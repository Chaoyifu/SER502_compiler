import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class compilerMNC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputstr = "function: dodo(in: number a[10] in:boolean b)\n"+ 
				"start \n"+
				"end \n"+
				"main \n"+
				"start \n"+
				"a = 10 \n"+
				"end\n";
		ANTLRInputStream input = new ANTLRInputStream(inputstr);
		MNCLexer lexer = new MNCLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		MNCParser parser = new MNCParser(tokens);
        ParseTree tree = parser.program(); // begin parsing at rule 'r'
        System.out.println(tree.toStringTree(parser)); 
        visitor2intermediateCode visitor = new visitor2intermediateCode(tokens);
        String res = visitor.visit(tree);
        System.out.println(res);
	}

}

/*
 * "function: dodo(in: number a[10] in:boolean b)\n"+ 
				"start\n"+
				"end\n"+
				"main\n"+
				"start\n"+
				"number : a\n"+
				"number : b\n"+
				"a = 10\n"+
				"b = 20\n"+
				"if (a > b)\n"+
				"start\n"+
				"a = 20\n"+
				"end\n"+
				"else\n"+
				"start\n"+
				"a = 30\n"+
				"end\n"+ 
				"dodo(c,d)"+
				"end\n";
 */

/* Sample code : FunctionDeclaration and call
main 
start 
number : a
number : b
a = 10
b = 20
if (a > b)
start
a = 20
end
else
start
a = 30
end
end
end



VAR a num 0
VAR b num 0
EQL a 10 
EQL b 20
JLE if1 a b
EQL a 20
JMP elif1
LBL if1
EQL a 30
LBL elif1
HLT
*/

/* Sample code : FunctionDeclaration and call
main
start
number : a
number : b
a = 10
b = 20
loop: (1) to (10) with 2
start
a = a + 5
end
end
end



VAR a num 0
VAR b num 0
EQL a 10 
EQL b 20
LBL loop1
JGT	loop1end 1 10
ADD t1 a 5
EQL a t1
ADD 1 10 2
JMP loop1
LBL loop1end
HALT
*/


/* Sample code : FunctionDeclaration and call
main
start
number:a
number:b
number:c
a=5
b=10
c=0
dodo(a,b,c)
end
function: dodo(in:number a in:number b out:number c)
start
if(a>b)
start
c=20
end
else
start
c=30
end
end



VAR a num 0
VAR b num 0
VAR c num 0
EQL a 5
EQL b 10
EQL c 0
PAR a
PAR b
PAR c
JMP	dodo
HALT
LBL dodo 2 1
IPT t1
IPT t2
OPT t3
JLE if1 t1 t2
EQL t3 20
JMP elif1
LBL if1
EQL t3 30
LBL elif1
LBL dodoend
*/