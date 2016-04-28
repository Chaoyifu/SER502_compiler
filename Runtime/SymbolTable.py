class Symbol:
    def __init__(self,type):
        self.type = type

class Num(Symbol):
    def __init__(self,name,value = 0):
        self.type = 'int'
        self.value = value
        self.length = 0
        self.name = name

class Bool(Symbol):
    def __init__(self,name,value = True):
        self.type = 'bool'
        self.value = value
        self.length = 0
        self.name = name

class Array(Symbol):
    def __init__(self,type,length,name):
        self.type = type
        self.length = length
        self.name = name
        if type == 'int':
            self.value = [0 for i in range(length)]
        else:
           self.value = [True for i in range(length)]

class parList:
    def __init__(self,inPar,outPar):
        self.inPar = inPar
        self.outPar = outPar

class Function(Symbol):
    def __init__(self,value,start):
        self.type = 'function'
        self.value = value
        self.start = start

class Stack:
     def __init__(self):
         self.items = []

     def isEmpty(self):
         return self.items == []

     def push(self, item):
         self.items.append(item)

     def pop(self):
         return self.items.pop()

     def peek(self):
         return self.items[len(self.items)-1]

     def size(self):
         return len(self.items)
#test
'''
a = Num(3,'a')
b = Bool(True,'b')
c = Array('bool', 10,'c')

d = Function(parList([a,b],[c]),10)

SymbolTable = {}
SymbolTable['a'] = Num(3)
SymbolTable['b'] = Bool(True)
SymbolTable['c'] = Array('bool', 10,c)
SymbolTable['d'] = Function(parList([a,b],[c]),10)

print(SymbolTable['a'].value)
print(SymbolTable['b'].value)
print(SymbolTable['c'].value)
print(SymbolTable['d'].value.inPar[0].value)
'''


