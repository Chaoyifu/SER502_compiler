import SymbolTable
import copy
import sys

golSt = {}
funcSt = {}
arithSt = SymbolTable.Stack()
parSt = SymbolTable.Stack()
jumpTypes = ["JEQ","JNE", "JGT", "JLT", "JGE", "JLE"]
calTypes = ["ADD","SUB","MUL","DIV"]
global code
global currentLine

def getValue(var,St):
    if is_number(var):
        return int(var)
    elif is_number(var[0]):
        if arithSt.isEmpty():
            print("Error")
            exit()
        return arithSt.peek()
    elif var in St:
        return St[var].peek().value
    elif var in golSt:
        return golSt[var].peek().value
    else:
        print("Error: undefined variable" + var)
        exit()

def is_number(s):
    try:
        float(s)
        return True
    except ValueError:
        pass

    try:
        import unicodedata
        unicodedata.numeric(s)
        return True
    except (TypeError, ValueError):
        pass

    return False

def convert_to_boolean(str):
    if str == "False":
        return False
    elif str == "True":
        return  True
    else:
        return str

def createSymbol(command):
    op = command.split(' ')
    if op[1] == 'NUM':
        if int(op[3]) == -1 or int(op[3]) == 0:
            par = SymbolTable.Num(op[2])
            return par
        elif int(op[3]) > 0:
            par = SymbolTable.Array('int',int(op[3]),op[2])
            return par
        else:
            print("Error: Invalid parameter")
            exit()
    else:
        if int(op[3]) == -1 or int(op[3]) == 0:
            par = SymbolTable.Bool(op[2])
            return par
        elif int(op[3]) > 0:
            par = SymbolTable.Array('bool',int(op[3]),op[2])
            return par
        else:
            print("Error: Invalid parameter")
            exit()

def destroySymbol(St,varList):
    for vars in varList:
        if(vars in St):
            St[vars].pop()
            if St[vars].isEmpty():
                del St[vars]

def functionReadFile(filename):
    global code
    code = []
    fp=open(filename, "r")
    for line in fp.readlines():
        line=line.strip('\n')
        code.append(line)
    fp.close()

def preprocess(code):
    global currentLine
    i = 0
    while(i < len(code)):
        items = code[i].split(' ')
        if items[0] == "LBL":
            if not is_number(items[1][0]):
                currentLine = i
                execute(code[i], golSt)
                i = currentLine
                i += 1
                continue
        if items[0] == "VAR":
            execute(code[i], golSt)
            i += 1
            continue
        if code[i] == "SRT":
            currentLine = i
            return
        i += 1

def process(code):
    preprocess(code)
    locSt = {}
    global currentLine
    try:
        while(currentLine < len(code)):
            temp = code[currentLine].split(' ')
            if temp[0] == 'VAR' and temp[1] not in locSt:
                execute(code[currentLine], locSt)
            elif temp[0] != 'VAR':
                execute(code[currentLine], locSt)
            else:
                print("Error: redefine variable " + temp[1])
                exit()
            currentLine += 1
    except NameError:
        exit()

def execute(command,St):
    if command == "":
        return None
    op = command.split(' ')
    if op[0] == 'OUT':
        println(op,St)
    if op[0] == 'VAR':
        declaration(op,St)
    if op[0] == 'EQL':
        assignment(op,St)
    if op[0] == 'EAR':
        arrayAssignment(op,St)
    if op[0] in calTypes:
        arithment(op,St)
    if op[0] == "LBL" and not is_number(op[1][0]):
        functiondec(op)
    if op[0] in jumpTypes and is_number(op[1][0]) and "if" in op[1]:
        conditionalFunc(op,St)
    if op[0]  == "JMP" and not is_number(op[1][0]):
        functionCall(op,St)
    if op[0] == "LBL" and is_number(op[1][0]) and "loop" in op[1]:
        loopFunc(op,St)
    if (op[0] == "JGE" or op[0] == "JLE" ) and not "if" in op[1]:
        condJump(op,St)
    if op[0] == "JMP" and is_number(op[1][0]) and "loop" in op[1]:
        unconJump(op,St)
    if op[0] == "HLT":
        return

def println(op,St):
    index = -1
    if len(op) == 3:
        print(op[2])
    else:
        if(op[2] in St):
            index = getValue(op[3],St)
            if( index != -1):
                try:
                    print(St[op[2]].peek().value[index])
                except IndexError:
                    print("Error: index out of range")
                    exit()
                except TypeError:
                    print("Error: variable " + op[2]+" is not a array")
                    exit()
            else:
               print(St[op[2]].peek().value)
        else:
             if(op[2] in golSt):
                 index = getValue(op[3],St)
                 if( index != -1):
                     try:
                         print(golSt[op[2]].peek().value[index])
                     except IndexError:
                         print("Error: index out of range")
                         exit()
                     except TypeError:
                         print("Error: " + op[2]+" is not a array")
                         exit()
                 else:
                     print(golSt[op[2]].peek().value)
             else:
                 print("Error: cannot find variable "+op[2])
                 exit()

def declaration(op,St):
    if int(op[3]) == -1 or int(op[3]) == 0:
        par3 = 0
    else:
        par3 = int(op[3])
    if(op[2] not in St ):
        St[op[2]] = SymbolTable.Stack()
    if op[1] == 'NUM':
        if par3 > 0:
            St[op[2]].push(SymbolTable.Array('int',int(par3),op[2]))
        elif par3 == 0:
            St[op[2]].push(SymbolTable.Num(op[2]))
        else:
            print ("Error: Array index out of range")
            exit()
    elif op[1] == 'BLN':
        if par3 > 0:
            St[op[2]].push(SymbolTable.Array('bool',int(par3),op[2]))
        elif par3 == 0:
            St[op[2]].push(SymbolTable.Bool(op[2]))
        else:
            print ("Error: Array index out of range")
            exit()

def assignment(op,St):      # a = b
    if(is_number(op[1][0])):
        if op[2] == 'True' or op[2] == 'False':
            arithSt.push(convert_to_boolean(op[2]))
        elif is_number(op[2]):
            arithSt.push(int(op[2]))
        elif op[2] in St:
            arithSt.push(St[op[2]].peek().value)
        elif op[2] in golSt:
            arithSt.push(golSt[op[2]].peek().value)
        else:
            print("Error: undefined variable " + op[2])
    elif (op[1] in St):     #a is local var
        if(St[op[1]].peek().length > 0):        #a cant be array
            print ("Error: Invalid type assigned")
            exit()
        if op[2] == 'True' or op[2] == 'False':       #b is bool
            if(St[op[1]].peek().type != 'bool'):
                print("Error: Invalid type assigned")
                exit()
            else:
                St[op[1]].peek().value = convert_to_boolean(op[2])
        elif is_number(op[2]):                    #b is number
            if(St[op[1]].peek().type != 'int'):
                print ("Error: Invalid type assigned")
                exit()
            else:
                St[op[1]].peek().value = int(op[2])
        elif is_number(op[2][0]):               #b is temp var
            if arithSt.isEmpty():
                print("Error")
                exit()
            temp = arithSt.peek()
            arithSt.pop()
            if (St[op[1]].peek().type  == 'int' and is_number(temp)) or (St[op[1]].peek().type  == 'bool' and not is_number(temp)):
                 St[op[1]].peek().value = temp
            else:
                print("Error:Invalid type assigned")
                exit()
        elif op[2] == "$IN":                            #b is input
            if(St[op[1]].peek().type  == 'int'):
                temp = input()
                if is_number(temp):
                    St[op[1]].peek().value = int(temp)
                else:
                    print("Error:Invalid input")
                    exit()
            else:
                print("Error:Invalid type assigned")
                exit()
        elif op[2] in St:                                 #b is local var
            if(St[op[1]].peek().type == St[op[2]].peek().type and St[op[1]].peek().length == 0 and St[op[2]].peek().length == 0):
                St[op[1]].peek().value = St[op[2]].peek().value
            else:
                print("Error:Invalid type assigned")
                exit()
        elif op[2] in golSt:                                 #b is global var
            if(St[op[1]].peek().type == golSt[op[2]].peek().type and St[op[1]].peek().length == 0 and golSt[op[2]].peek().length == 0):
                St[op[1]].peek().value = golSt[op[2]].peek().value
            else:
                print("Error:Invalid type assigned")
                exit()
        else:
            print("Error: Invalid variable assigned")         #b cant be matched
            exit()
    elif (op[1] in golSt):     #a is global var
        if(golSt[op[1]].peek().length > 0):        #a cant be array
            print ("Error: Invalid type assigned")
            exit()
        if op[2] == 'True' or op[2] == 'False':       #b is bool
            if(golSt[op[1]].peek().type != 'bool'):
                print("Error: Invalid type assigned")
                exit()
            else:
                golSt[op[1]].peek().value = convert_to_boolean(op[2])
        elif is_number(op[2]):                    #b is number
            if(golSt[op[1]].peek().type != 'int'):
                print ("Error: Invalid type assigned")
                exit()
            else:
                golSt[op[1]].peek().value = int(op[2])
        elif is_number(op[2][0]):               #b is temp var
            if arithSt.isEmpty():
                print("Error")
                exit()
            temp = arithSt.peek()
            arithSt.pop()
            if (golSt[op[1]].peek().type  == 'int' and is_number(temp)) or (golSt[op[1]].peek().type  == 'bool' and not is_number(temp)):
                 golSt[op[1]].peek().value = temp
            else:
                print("Error:Invalid type assigned")
                exit()
        elif op[2] == "$IN":                            #b is input
            if(golSt[op[1]].peek().type  == 'int'):
                temp = input()
                if is_number(temp):
                    golSt[op[1]].peek().value = int(temp)
                else:
                    print("Error:Invalid input")
                    exit()
            else:
                print("Error:Invalid type assigned")
                exit()
        elif op[2] in St:                                 #b is local var
            if(golSt[op[1]].peek().type == St[op[2]].peek().type and golSt[op[1]].peek().length == 0 and St[op[2]].peek().length == 0):
                golSt[op[1]].peek().value = St[op[2]].peek().value
            else:
                print("Error:Invalid type assigned")
                exit()
        elif op[2] in golSt:                                 #b is global var
            if(golSt[op[1]].peek().type == golSt[op[2]].peek().type and golSt[op[1]].peek().length == 0 and golSt[op[2]].peek().length == 0):
                golSt[op[1]].peek().value = golSt[op[2]].peek().value
            else:
                print("Error:Invalid type assigned")
                exit()
        else:
            print("Error: Invalid variable assigned")  #b cant be matched
            exit()
    else:
        print("Error: cant find variable " + op[1])
        exit()

def arrayAssignment(op,St):
    index = -1
    if is_number(op[1][0]):
        if(op[2] in St):
            index = getValue(op[3],St)
            try:
                arithSt.push(St[op[2]].peek().value[index])
            except IndexError:
                print("Error: Index out of range")
                exit()
            except TypeError:
                print("Error: " + op[2] + " is not an Array")
                exit()
        elif(op[2] in golSt):
            try:
                arithSt.push(golSt[op[2]].peek().value[index])
            except IndexError:
                print("Error: Index out of range")
                exit()
            except TypeError:
                print("Error: " + op[2] + " is not an Array")
                exit()
    elif op[1] in St:
        index = getValue(op[2],St)
        if St[op[1]].peek().length == 0:
            print("Error: " + op[1] + " is not an Array")
            exit()
        if St[op[1]].peek().length <= index:
            print("Error: Index out of range")
            exit()
        if op[3] == "$IN":
            if St[op[1]].peek().type == 'int':
                temp = input()
                if is_number(temp):
                    St[op[1]].peek().value[index] = int(temp)
                else:
                    print("Error:Invalid input")
                    exit()
            else:
                print("Error: Invalid variable assigned for "+op[1])
        elif is_number(op[3]):
            if St[op[1]].peek().type == 'int':
                St[op[1]].peek().value[index] = int(op[3])
            else:
                print("Error: Invalid type assigned for " + op[1])
        elif op[3] == "True" or op[3] == "False":
            if St[op[1]].peek().type == 'bool':
                St[op[1]].peek().value[index] = convert_to_boolean(op[3])
            else:
                print("Error: Invalid type assigned for " + op[1])
        elif is_number(op[3][0]):
            if arithSt.isEmpty():
                print("Error")
                exit()
            temp = arithSt.peek()
            arithSt.pop()
            if (St[op[1]].peek().type  == 'int' and is_number(temp)) or (St[op[1]].peek().type  == 'bool' and not is_number(temp)):
                St[op[1]].peek().value[index] = temp
            else:
                print("Error:Invalid type assigned")
                exit()
        elif op[3] in St:
            if(St[op[1]].peek().type == St[op[3]].peek().type and St[op[3]].peek().length == 0):
                St[op[1]].peek().value[index] = St[op[3]].peek().value
            else:
                print("Error:Invalid type assigned")
                exit()
        elif op[3] in golSt:
            if(St[op[1]].peek().type == golSt[op[3]].peek().type and golSt[op[3]].peek().length == 0):
                St[op[1]].peek().value[index] = golSt[op[3]].peek().value
            else:
                print("Error:Invalid type assigned")
                exit()
        else:
            print("Error: Invalid variable assigned")
            exit()
    elif op[1] in golSt:
        index = getValue(op[2],St)
        if golSt[op[1]].peek().length == 0:
            print("Error: " + op[1] + " is not an Array")
            exit()
        if golSt[op[1]].peek().length <= index:
            print("Error: Index out of range")
            exit()
        if op[3] == "$IN":
            if golSt[op[1]].peek().type == 'int':
                temp = input()
                if is_number(temp):
                    golSt[op[1]].peek().value[index] = int(temp)
                else:
                    print("Error:Invalid input")
                    exit()
            else:
                print("Error: Invalid variable assigned for "+op[1])
        elif is_number(op[3]):
            if golSt[op[1]].peek().type == 'int':
                golSt[op[1]].peek().value[index] = int(op[3])
            else:
                print("Error: Invalid type assigned for " + op[1])
        elif op[3] == "True" or op[3] == "False":
            if golSt[op[1]].peek().type == 'bool':
                golSt[op[1]].peek().value[index] = convert_to_boolean(op[3])
            else:
                print("Error: Invalid type assigned for " + op[1])
        elif is_number(op[3][0]):
            if arithSt.isEmpty():
                print("Error")
                exit()
            temp = arithSt.peek()
            arithSt.pop()
            if (golSt[op[1]].peek().type  == 'int' and is_number(temp)) or (golSt[op[1]].peek().type  == 'bool' and not is_number(temp)):
                golSt[op[1]].peek().value[index] = temp
            else:
                print("Error:Invalid type assigned")
                exit()
        elif op[3] in St:
            if(golSt[op[1]].peek().type == St[op[3]].peek().type and St[op[3]].peek().length == 0):
                golSt[op[1]].peek().value[index] = St[op[3]].peek().value
            else:
                print("Error:Invalid type assigned")
                exit()
        elif op[3] in golSt:
            if(golSt[op[1]].peek().type == golSt[op[3]].peek().type and golSt[op[3]].peek().length == 0):
                golSt[op[1]].peek().value[index] = golSt[op[3]].peek().value
            else:
                print("Error:Invalid type assigned")
                exit()
        else:
            print("Error: Invalid variable assigned")
            exit()
    else:
        print("Error: cant find variable " + op[1])
        exit()

def arithment(op,St):
    if is_number(op[2]):
        leftOp = int(op[2])
    elif is_number(op[2][0]):
        if(arithSt.isEmpty()):
            print("Error")
            exit()
        else:
            leftOp = arithSt.peek()
            arithSt.pop()
    elif op[2] in St:
        if St[op[2]].peek().length > 0:
            print("Error: Array type is invalid for arithmetic")
            exit()
        else:
            leftOp = St[op[2]].peek().value
    elif op[2] in golSt:
        if golSt[op[2]].peek().length > 0:
            print("Error: Array type is invalid for arithmetic")
            exit()
        else:
            leftOp = golSt[op[2]].peek().value
    else:
        print("Error: cannot find variable " + op[2])
        exit()
    if is_number(op[3]):
        rightOp = int(op[3])
    elif is_number(op[3][0]):
         if(arithSt.isEmpty()):
             print("Error")
             exit()
         else:
             rightOp = arithSt.peek()
             arithSt.pop()
    elif op[3] in St:
        if St[op[3]].peek().length > 0:
            print("Error: Array type is invalid for arithmetic")
            exit()
        else:
            rightOp = St[op[3]].peek().value
    elif op[3] in golSt:
        if golSt[op[3]].peek().length > 0:
            print("Error: Array type is invalid for arithmetic")
            exit()
        else:
            rightOp = golSt[op[3]].peek().value
    else:
        print("Error: cannot find variable " + op[3])
        exit()
    if is_number(leftOp) == is_number(rightOp):
        if(is_number(leftOp)):
            if op[0] == "ADD":
                arithSt.push(leftOp + rightOp)
            if op[0] == "SUB":
                arithSt.push(leftOp - rightOp)
            if op[0] == "MUL":
                arithSt.push(leftOp * rightOp)
            try:
                if op[0] == "DIV":
                    arithSt.push(leftOp / rightOp)
            except ZeroDivisionError:
                print("Error: division by zero")
        else:
            if op[0] == "ADD":
                arithSt.push(leftOp and rightOp)
            if op[0] == "SUB":
                arithSt.push(leftOp or rightOp)
            if op[0] == "MUL":
                arithSt.push((leftOp and (not rightOp)) or ((not leftOp) and rightOp))
            if op[0] == "DIV":
                    arithSt.push(leftOp == rightOp)
    else:
        print("Error: Different types are invalid for arithmetic")
    if op[1] in St:
        if arithSt.isEmpty():
            print("Error")
            exit()
        St[op[1]].peek().value = arithSt.peek()
        arithSt.pop()
    elif op[1] in golSt:
        if arithSt.isEmpty():
            print("Error")
            exit()
        golSt[op[1]].peek().value = arithSt.peek()
        arithSt.pop()

def functiondec(op):
    varList = []
    if int(op[3]) > 1:
        print("Error: cannot have several out parameters")
        exit()
    if (op[1] in funcSt):
        print("Error: " + op[1] + " is defined")
        exit()
    inPar = []
    for i in range(int(op[2])):
        global currentLine
        currentLine += 1
        temp = code[currentLine].split(' ')
        if temp[2] in varList:
            print("Error: parameter cannot be the same name")
            exit()
        inPar.append(createSymbol(code[currentLine]))
        varList.append(temp[2])
    currentLine += 1
    if code[currentLine][0:3] == "OPT":
        temp = code[currentLine].split(' ')
        if temp[2] in varList:
            print("Error: parameter cannot be the same name")
            exit()
        outPar = createSymbol(code[currentLine])
        varList.append(temp[2])
        currentLine += 1
    else:
        outPar = None
    par = SymbolTable.parList(inPar,outPar)
    startLine = currentLine
    funcSt[op[1]] = SymbolTable.Function(par,startLine)
    while code[currentLine][0:3] != "SRT":
        temp = code[currentLine].split(' ')
        if(temp[0] == "LBL" and temp[1] == op[1] + "END"):
            break
        currentLine += 1

def executeElse(lineNumber,ifTag,St):
    localVariableList = []
    global currentLine
    while(1):
        temp = code[lineNumber].split(' ')
        if temp[0] == 'LBL' and temp[1] == ifTag + "el":
            currentLine = lineNumber
            destroySymbol(St,localVariableList)
            return
        else:
            if temp[0] == 'VAR' and temp[2] not in localVariableList:
                execute(code[lineNumber], St)
                localVariableList.append(temp[2])
            elif temp[0] != 'VAR':
                execute(code[lineNumber], St)
            else:
                print("Error: redefine variable "+temp[2])
                exit()
        lineNumber += 1

def conditionalFunc(op, St):
    endifLine = -1;
    startelsLine = -1
    localVariableList = [];
    global currentLine
    for i in range(currentLine + 1, len(code)):
        temp = code[i].split(' ')
        if (temp[0] == 'JMP' and temp[1] == op[1]+"el"):
            endifLine = i
            startelsLine = endifLine + 1
            break
        if(temp[0] == 'LBL' and temp[1] == op[1]):
            endifLine = i
    val1 = -1
    val2 = -1
       # get the value of the second variable
    if (is_number(op[3])):
        val2 = int(op[3])
    elif(op[3] == "True" or op[3] == "False"):
        val1 = convert_to_boolean(op[3])
    elif (is_number(op[3][0])):
        if arithSt.isEmpty():
            print("Error")
            exit()
        val2 = arithSt.peek()
        arithSt.pop()
    elif (op[3] in St):
        if (St[op[3]].peek().length == 0):
            val2 = St[op[3]].peek().value
        else:
            print("Error: array cannot be compared")
            exit()
    elif (op[3] in golSt):
        if (golSt[op[3]].peek().length == 0):
            val2 = golSt[op[3]].peek().value
        else:
            print("Error: array cannot be compared")
            exit()
    else:
        print("Error: undefined variable " + op[3])
        exit()
    # get the value of the first variable
    if (is_number(op[2])):
        val1 = int(op[2])
    elif(op[2] == "True" or op[2] == "False"):
        val1 = convert_to_boolean(op[2])
    elif (is_number(op[2][0])):
        if arithSt.isEmpty():
            print("Error")
            exit()
        val1 = arithSt.peek()
        arithSt.pop()
    elif (op[2] in St):
        if (St[op[2]].peek().length == 0):
            val1 = St[op[2]].peek().value
        else:
            print("Error: array cannot be compared")
            exit()
    elif (op[2] in golSt):
        if (golSt[op[2]].peek().length == 0):
            val1 = golSt[op[2]].peek().value
        else:
            print("Error: array cannot be compared")
            exit()
    else:
        print("Error: undefined variable " + op[2])
        exit()
    if (is_number(val1) != is_number(val2)):
        print("Type mismatch")
        exit()
    result = False
    if (op[0] == jumpTypes[0]):
         if val1 == val2:
             result = True
    elif (op[0] == jumpTypes[1]):
         if val1 != val2:
             result = True
    elif (op[0] == jumpTypes[2]):
         if val1 > val2:
             result = True
    elif (op[0] == jumpTypes[3]):
         if val1 < val2:
             result = True
    elif (op[0] == jumpTypes[4]):
         if val1 >= val2:
             result = True
    elif (op[0] == jumpTypes[5]):
         if val1 <= val2:
             result = True
    if (result):
        destroySymbol(St, localVariableList)
        if(startelsLine != -1):
            executeElse(startelsLine + 1,op[1],St)
            return
        currentLine = endifLine
        return
    else:
        currentLine += 1
        while (currentLine != endifLine):
            temp = code[currentLine].split(' ')
            if temp[0] == 'VAR' and temp[2] not in localVariableList:
                execute(code[currentLine], St)
                localVariableList.append(temp[2])
            elif temp[0] != 'VAR':
                execute(code[currentLine], St)
            else:
                print("Error: redefine variable " + temp[2])
                exit()
            currentLine += 1
        if code[currentLine][0:3] == "JMP":
            for i in range(currentLine + 1, len(code)):
                temp = code[i].split(' ')
                if(temp[0] == "LBL" and temp[1] == op[1] + 'el'):
                    destroySymbol(St, localVariableList)
                    currentLine = i
                    return
        else:
            destroySymbol(St, localVariableList)
            return

def loopFunc(op,St):
    global  currentLine
    varList = []
    currentLine += 1
    tag = code[currentLine].split(' ')[1]
    while(code[currentLine] != "LBL "+tag):
        temp = code[currentLine].split(' ')
        if temp[0] == 'VAR':
            if temp[2] not in varList:
                execute(code[currentLine], St)
                varList.append(temp[2])
            else:
                print("Error: redefine variable " + temp[2])
                exit()
        elif temp[0] == 'JMP' and temp[1] == op[1]:
            destroySymbol(St,varList)
            while(len(varList) != 0):
                varList.pop()
            execute(code[currentLine],St)
            continue
        else:
            execute(code[currentLine],St)
        currentLine += 1
    destroySymbol(St,varList)
    if(not arithSt.isEmpty()):
        arithSt.pop()

def condJump(op,St):
    global currentLine
    if is_number(op[3]):
        val2 = int(op[3])
    elif is_number(op[3][0]):
        val2 = arithSt.peek()
    elif op[3] in St:
        if St[op[3]].peek().type != 'int' or St[op[3]].peek().length > 0:
            print("Error: type mismatch")
            exit()
        val2= St[op[3]].peek().value
    elif op[3] in golSt:
        if golSt[op[3]].peek().type != 'int' or golSt[op[3]].peek().length > 0:
            print("Error: type mismatch")
            exit()
        val2 = golSt[op[3]].peek().value
    else:
        print("Error: undefined variable "+op[2])
        exit()
    if is_number(op[2]):
        val1 = int(op[2])
    elif is_number(op[2][0]):
        val1 = arithSt.peek()
    elif op[2] in St:
        if St[op[2]].peek().type != 'int' or St[op[2]].peek().length > 0:
            print("Error: type mismatch")
            exit()
        val1= St[op[2]].peek().value
    elif op[2] in golSt:
        if golSt[op[2]].peek().type != 'int' or golSt[op[2]].peek().length > 0:
            print("Error: type mismatch")
            exit()
        val1 = golSt[op[2]].peek().value
    else:
        print("Error: undefined variable "+op[2])
        exit()
    result = False
    if(op[0] == "JGE"):
        if val1 >= val2:
            result = True
    if(op[0] == "JLE"):
        if val1 <= val2:
            result = True
    targetLine = len(code) - 1
    for i in range(currentLine +1, len(code)):
        temp = code[i].split(" ")
        if temp[1] == op[1]:
            targetLine = i
            break
    if result:
        currentLine = targetLine -1
    else:
        return

def unconJump(op,St):
    global  currentLine
    i = currentLine
    for i in range(currentLine-1,0,-1):
        temp = code[i].split(' ')
        if temp[1] == op[1]:
            currentLine = i + 1
            return

def functionCall(op,St):
    global  currentLine
    flag = currentLine
    funclocSt = {}
    if op[1] not in funcSt:
        print("Error: No function declared")
        exit()
    i = currentLine -1
    count = 0
    while(code[i][0:3] == "PAR"):
        count += 1
        i -= 1
    i += 1
    if funcSt[op[1]].value.outPar is None:
        out = 0
    else:
        out = 1
    if len(funcSt[op[1]].value.inPar) + out != count:
        print("Error: the number of parameters not match")
        exit()
    count = 0
    index = 0
    while i < currentLine:
        temp = code[i].split(' ')
        if temp[1] in St:
            index = getValue(temp[2],St)
            if St[temp[1]].peek().length == 0 and  index != -1:
                print("Error: "+ temp[1] + " is not an array")
                exit()
            if St[temp[1]].peek().length <= index:
                print("Error: index out of range")
                exit()
            if count < len(funcSt[op[1]].value.inPar):
                if St[temp[1]].peek().type != funcSt[op[1]].value.inPar[count].type or St[temp[1]].peek().length != funcSt[op[1]].value.inPar[count].length:
                    print("Error: parameter mismatch")
                    exit()
                else:
                    funcSt[op[1]].value.inPar[count].value = St[temp[1]].peek().value
                    funclocSt[funcSt[op[1]].value.inPar[count].name] = SymbolTable.Stack()
                    tag = copy.deepcopy(funcSt[op[1]].value.inPar[count])
                    funclocSt[funcSt[op[1]].value.inPar[count].name].push(tag)
                    count += 1
            else:
                 if St[temp[1]].peek().type != funcSt[op[1]].value.outPar.type or St[temp[1]].peek().length != funcSt[op[1]].value.outPar.length:
                     print("Error: parameter mismatch")
                     exit()
                 else:
                     funcOut = temp[1]
                     funcSt[op[1]].value.outPar.value = St[temp[1]].peek().value
                     funclocSt[funcSt[op[1]].value.outPar.name] = SymbolTable.Stack()
                     tag = copy.deepcopy(funcSt[op[1]].value.outPar)
                     funclocSt[funcSt[op[1]].value.outPar.name].push(tag)
        elif temp[1] in golSt:
            index = getValue(temp[2],St)
            if golSt[temp[1]].peek().length == 0 and index != -1:
                print("Error: "+ temp[1] + " is not an array")
                exit()
            if golSt[temp[1]].peek().length <= index:
                print("Error: index out of range")
                exit()
            if count < len(funcSt[op[1]].value.inPar):
                if golSt[temp[1]].peek().type != funcSt[op[1]].value.inPar[count].type or golSt[temp[1]].peek().length != funcSt[op[1]].value.inPar[count].length:
                    print("Error: parameter mismatch")
                    exit()
                else:
                    funcSt[op[1]].value.inPar[count].value = golSt[temp[1]].peek().value
                    funclocSt[funcSt[op[1]].value.inPar[count].name] = SymbolTable.Stack()
                    tag = copy.deepcopy(funcSt[op[1]].value.inPar[count])
                    funclocSt[funcSt[op[1]].value.inPar[count].name].push(tag)
                    count += 1
            else:
                 if golSt[temp[1]].peek().type != funcSt[op[1]].value.outPar.type or golSt[temp[1]].peek().length != funcSt[op[1]].value.outPar.length:
                     print("Error: parameter mismatch")
                     exit()
                 else:
                     funcOut = temp[1]
                     funcSt[op[1]].value.outPar.value = golSt[temp[1]].peek().value
                     funclocSt[funcSt[op[1]].value.outPar.name] = SymbolTable.Stack()
                     tag = copy.deepcopy(funcSt[op[1]].value.outPar)
                     funclocSt[funcSt[op[1]].value.outPar.name].push(tag)
        else:
            print("Error: undefined variable "+ temp[1])
            exit()
        i += 1
    executefunc(op[1],funclocSt)
    if out == 1:
        if funcOut in St:
            St[funcOut].peek().value = funclocSt[funcSt[op[1]].value.outPar.name].peek().value
        else:
            golSt[funcOut].peek().value = funclocSt[funcSt[op[1]].value.outPar.name].peek().value
    del funclocSt
    currentLine = flag

def executefunc(funcName, St):
    global currentLine
    currentLine = funcSt[funcName].start
    while code[currentLine][0:3] != "SRT":
        temp = code[currentLine].split(' ')
        if(temp[0] == "LBL" and temp[1] == funcName + "END"):
            return
        if temp[0] == 'VAR' and temp[2] not in St:
            execute(code[currentLine], St)
        elif temp[0] != 'VAR':
            execute(code[currentLine], St)
        else:
            print("Error: redefine variable " +temp[2])
            exit()
        currentLine += 1

functionReadFile(sys.argv[1])
process(code)