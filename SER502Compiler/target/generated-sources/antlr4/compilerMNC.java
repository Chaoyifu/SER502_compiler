import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class compilerMNC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputstr = "main \n" +
							"start \n" +
//							"number: a \n" +
//							"boolean: _bcd \n" +
//							"a = 10 \n"+
//							"a = 10 + 20 + 30 * 100 / 50 \n"+
							"end  \n \n";
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
