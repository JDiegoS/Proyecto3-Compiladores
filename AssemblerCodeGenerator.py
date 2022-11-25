from ParserParser import ParserParser
from ParserVisitor import ParserVisitor
from Quadruple import Quadruple

from helpers import *

class Descriptors:   
    def __init__(self):
        self.registers = []
        self.addresses = {}

    def modifyRegister(self, r, value):
        self.registers[r] = value

    def modifyAddress(self, name, value):
        self.addresses[name] = value

    def getRegisters(self, variables):
        res = []
        for i in variables:
            res.append(self.addresses[i])



class AssemblerCodeGenerator():   
    def __init__(self, code, quads):
        self.code = code
        self.quads = quads
        self.descriptors = Descriptors()
        self.operations = ['add' , 'sub', 'mul', 'div']
        self.assemblyCode = ''