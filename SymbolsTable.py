'''
    Symbols Table Class
Created By:
Juan Diego Solorzano
Juan Fernando De Leon
'''
from helpers import *
from tabulate import tabulate

class SymbolTable:
    def __init__(self):
        self.table = []
        self.scopes = [GLOBAL]
        self.errors = []
        self.offset = 0

    def push_scope(self, scope):
        self.scopes.append(scope)

    def pop_scope(self):
        self.scopes.pop()

    def insert(self, name, typ, kind, scope, line, value=None):
        scope_variables = filter(lambda x: x['scope'] == scope, self.table)
        if (name, kind, scope) in map(lambda x: (x['name'], x['kind'], x['scope']), scope_variables) and kind != 'parameter':
            self.errors.append(error(KIND_TABLE_ERROR[kind] + ' ' + name + ' ya fue declarada ', line))

        size = self.getBytes(typ)

        self.table.append({'name': name, 'type': typ, 'kind': kind, 'scope': scope, 'line': line, 'value': value, 'size': size, 'address': self.offset})

    def get(self, name, line,scope=None):
        if scope is None:
            scope = self.get_scope()

        scope_variables = filter(lambda x: x['scope'] == scope, self.table)
        for variable in scope_variables:
            if variable['name'] == name:
                return variable

        self.errors.append(error('Variable ' + name + ' no declarada', line))

    def set(self, name, line, value):
        for scope in reversed(self.scopes):
            for row in self.table:
                if row['name'] == name and row['scope'] == scope:
                    row['value'] = value
                    return

        self.errors.append(error('Variable ' + name + ' no declarada', line))

    def getBytes(self, type):
        if type == 'String':
            self.offset += 30
            return 30
        elif type == 'Int':
            self.offset += 4
            return 4
        elif type == 'Bool':
            self.offset += 1
            return 1
        else:
            self.offset += 100
            return 100

    def get_scope(self):
        return self.scopes[-1]

    def __str__(self):
        table = map(lambda x: x.values(), self.table)
        return tabulate(table, headers=['name', 'type', 'kind', 'scope', 'line', 'value', 'size', 'address'])

    def getTable(self):
        return self.table