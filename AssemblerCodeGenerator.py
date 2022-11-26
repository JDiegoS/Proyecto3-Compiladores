from ParserParser import ParserParser
from ParserVisitor import ParserVisitor
from Quadruple import Quadruple

from helpers import *

class Descriptors:   
    def __init__(self):
        self.registers = ['', '', '', '', '', '', '']
        self.addresses = {}
        self.operations = ['=', 'add' , 'sub', 'mult', 'div', 'ble']

    def varInRegisters(self, variable):
        reg = 0
        for i in self.registers:
            if i == variable:
                return reg
            elif ',' in i:
                vars = i.split(',')
                if variable in vars:
                    return reg
            reg += 1
        return -1
    
    def getRegisters(self, operation):
        
        operation = operation.replace(';', '').split('=')
        resVar = operation[0].replace(' ', '')
        operands = operation[1].split(' ')
        operands = [i for i in operands if i]
        res = []

        if resVar not in self.addresses:
            self.addresses[resVar] = resVar

        for i in operands:
            if i not in self.operations and i != '':
                if i not in self.addresses:
                    self.addresses[i] = i

                inReg = False
                emptyReg = -1
                reg = 0
                for j in self.registers:
                    if i == j or ',' + i in j or i + ',' in j:
                        inReg = True
                        res.append(reg)
                        break
                    elif j == '':
                        emptyReg = reg 
                        break
                    reg += 1
                    
                if inReg == False:
                    if emptyReg != -1:
                        self.registers[emptyReg] = i
                        self.addresses[i] += ',' + str(emptyReg)
                        res.append(emptyReg)
                    else:
                        validReg = 0
                        for j in self.registers:
                            if j not in operands:
                                if ',' not in j:
                                    self.addresses[j] = self.addresses[j].replace(',' + str(validReg), '')
                                    self.registers[validReg] = i
                                    self.addresses[i] += ',' + str(validReg)
                                    res.append(validReg)
                                    break
                                else:
                                    swaps = self.registers[validReg].split(',')
                                    done = False
                                    for s in swaps:
                                        self.addresses[s] = self.addresses[s].replace(',' + str(validReg+1), '')
                                        self.addresses[i] += ',' + str(validReg)
                                        self.registers[validReg] = i
                                        res.append(validReg)
                                        done = True
                                        break
                                    if done:
                                        break
                            validReg += 1

        if len(operands) == 1:
            self.addresses[resVar] += ',' + str(res[0])
            usedReg = emptyReg
            if emptyReg == -1:
                if inReg:
                    usedReg = reg
                else:
                    usedReg = validReg
            self.registers[usedReg] += ',' + str(resVar)
            return res

        validReg = 0
        for j in self.registers:
            
            if ',' in j:
                if resVar in j:
                    self.registers[validReg] = self.registers[validReg].replace(str(resVar), '').replace(',,', ',')
                    
                elif operands[-1] in j:
                    self.registers[validReg] = self.registers[validReg].replace(str(operands[-1]), '').replace(',,', ',')
                
                if validReg == 2:
                    validReg = 0
                swaps = self.registers[validReg+1].split(',')
                swaps = [i for i in swaps if i]
                for s in swaps:
                    self.addresses[s] = self.addresses[s].replace(',' + str(validReg+1), '')

                self.registers[validReg+1] = resVar
                res.append(validReg+1)
                break
                    
            if j == operands[-1]:
                self.addresses[j] = self.addresses[j].replace(',' + str(validReg), '')
                self.registers[validReg] = resVar
                self.addresses[resVar] += ',' + str(validReg)
                res.append(validReg)
                break
                
            validReg += 1
        return res
        

        

class AssemblerCodeGenerator():   
    def __init__(self, code, quads):
        self.code = code
        self.quads = quads
        self.descriptors = Descriptors()
        self.operations = ['add' , 'sub', 'mult', 'div']
        self.assemblyCode = []

    def generateCode(self):
        self.assemblyCode.append('.data')
        self.assemblyCode.append('.text')
        self.assemblyCode.append('  .globl main')
        index = 0
        for i in self.code:

            if ':' in i:
                if '.' in i: 
                    #Funcion
                    name = i.split('.')[1]
                    self.assemblyCode.append(' ' + name)
                else:
                    self.assemblyCode.append(' ' + i)
                continue
            elements = i.replace(';', '').split(' ')
            if '=' in elements:
                op = ''
                if len(elements) == 3:
                    if elements[-1].isnumeric() == False:
                        
                        value = self.descriptors.varInRegisters(elements[-1])
                        if value != -1:
                            op = 'move'
                    else:
                        op = 'li'
                elif 'add' in elements:
                    op = 'add'
                elif 'sub' in elements:
                    op = 'sub'
                elif 'mult' in elements:
                    op = 'mul'
                elif 'div' in elements:
                    op = 'div'
                elif 'ble' in elements:
                    op = 'sle'
                
                
                if op == 'li':
                    regs = self.descriptors.getRegisters(i)
                    if 't' not in elements[2]:
                        self.assemblyCode.append('  ' + op + ' $t' + str(regs[0]) + ', ' + elements[2])

                elif op == 'move':
                    
                    regs = self.descriptors.getRegisters(i)

                elif op == 'sle':
                    self.assemblyCode.append('  ' + op + ' $t3' + ', $t' + str(self.descriptors.varInRegisters(elements[2])) + ', $t' + str(self.descriptors.varInRegisters(elements[4])))                    
                    regs = self.descriptors.getRegisters(i)

                elif op != '':

                    regs = self.descriptors.getRegisters(i)

                    resR = regs[2]
                    regs[2] = regs[1]
                    regs[1] = regs[0]
                    regs[0] = resR


                    self.assemblyCode.append('  ' + op + ' $t' + str(regs[0]) + ', $t' + str(regs[1]) + ', $t' + str(regs[2]))
            
            elif 'IFFALSE' in elements:
                self.assemblyCode.append('  beq $t3' + ', $zero' + ', ' + str(elements[-1]))     

            elif 'goto' == elements[0]:
                self.assemblyCode.append('  j ' + elements[1])     




            index += 1
                    
        self.assemblyCode.append('  li $v0, 10')     
        self.assemblyCode.append('  syscall')     
        print(self.descriptors.addresses)
        print(self.descriptors.registers)
        print()
        print(self.assemblyCode)
        return self.assemblyCode