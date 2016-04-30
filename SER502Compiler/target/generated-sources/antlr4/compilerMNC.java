import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class compilerMNC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1){
			System.out.println("Invalid file count");
			return;
		}
		if(!(args[0].endsWith(".mnc"))){
			System.out.println("Not a .mnc file");
			return;
		}
		File f = new File(args[0]);
		if(!f.exists()){
			System.out.println("File not found");
			return;
		}
		String outFileName = args[0]+"c";
		String inputstr = "";
		try{
			FileReader fis = new FileReader(f);
			BufferedReader bufferedReader = new BufferedReader(fis);
			String line = "";
			while((line = bufferedReader.readLine())!= null){
				inputstr = inputstr+line+"\n";
			}
		}catch(IOException e){
			System.out.println("Couldn't open the file");
		}
		ANTLRInputStream input = new ANTLRInputStream(inputstr);
		MNCLexer lexer = new MNCLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		MNCParser parser = new MNCParser(tokens);
        ParseTree tree = parser.program(); // begin parsing at rule 'r'
    	FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(outFileName);
	    	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	        visitor2intermediateCode visitor = new visitor2intermediateCode(bufferedWriter);
	        visitor.visit(tree);
	        bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Generating compiler file");
		}
	}

}

/*
 * "function: factorial(in: number n out: number fact)"
				+ "\nstart"
				+ "\nif(n>1)"
				+ "\nstart"
				+ "\nnumber : temp"
				+ "\ntemp= n-1"
				+ "\nfactorial(temp, fact)"
				+ "\ntemp = n * fact"
				+ "\nfact = temp"
				+ "\nend"
				+ "\nelse"
				+ "\nstart"
				+ "\nfact = 1"
				+ "\nend"
				+ "\nend"
				+ "\nmain"
				+ "\nstart"
				+ "\nnumber : i"
				+ "\nnumber : result"
				+ "\ni = readInput"
				+ "\nfactorial(i, result)"
				+ "\nprint: result"
				+ "\nend\n"
 */



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