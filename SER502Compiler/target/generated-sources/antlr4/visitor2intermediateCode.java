//import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;



public class visitor2intermediateCode extends MNCBaseVisitor<String>{

	CommonTokenStream tokens;
	public visitor2intermediateCode(CommonTokenStream tokens) {
		super();
		this.tokens = tokens;
	}

	@Override
	public String visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getSymbol().getType()){
		case MNCLexer.MAIN: System.out.println("\n main");
							break;
		case MNCLexer.START: System.out.println("\n start");
							break;
		case MNCLexer.END: System.out.println("\n end");
							break;
		case MNCLexer.NUM: System.out.println("\n number");
							break;
		case MNCLexer.BOOLT: System.out.println("\n boolean");
							break;
		case MNCLexer.TRUE: System.out.println("\n true");
		break;
		case MNCLexer.FALSE: System.out.println("\n false");
		break;
		case MNCLexer.IF: System.out.println("\n if");
		break;
		case MNCLexer.ELSE: System.out.println("\n else");
		break;
		case MNCLexer.LOOP: System.out.println("\n loop");
		break;
		case MNCLexer.TO: System.out.println("\n to");
		break;
		case MNCLexer.WITH: System.out.println("\n with");
		break;
		case MNCLexer.FUNCTION: System.out.println("\n function");
		break;
		case MNCLexer.IN: System.out.println("\n in");
		break;
		case MNCLexer.OUT: System.out.println("\n out");
		break;
		case MNCLexer.PRINT: System.out.println("\n print");
		break;
		case MNCLexer.READ: System.out.println("\n readInput");
		break;
		case MNCLexer.EOL: System.out.println("\n eol");
		break;
		case MNCLexer.EQUALS: System.out.println("\n =");
		break;
		case MNCLexer.DIGIT: System.out.println("\n 0-9");
		break;
		case MNCLexer.CONDITIONS: System.out.println("\n ==");
		break;
		case MNCLexer.ADD: System.out.println("\n add");
		break;
		case MNCLexer.SUB: System.out.println("\n sub");
		break;
		case MNCLexer.MUL: System.out.println("\n mul");
		break;
		case MNCLexer.DIV: System.out.println("\n div");
		break;
		case MNCLexer.OPENPAR: System.out.println("\n openpar");
		break;
		case MNCLexer.CLOSEPAR: System.out.println("\n closepar");
		break;
		case MNCLexer.ARRAYOPEN: System.out.println("\n [");
		break;
		case MNCLexer.ARRAYCLOSE: System.out.println("\n ]");
		break;
		case MNCLexer.SEPERATOR: System.out.println("\n seperator");
		break;
		case MNCLexer.COLON: System.out.println("\n colon   :    ");
		break;
		case MNCLexer.IDENTIFIER: System.out.println("\n identifier");
		break;
		default: System.out.println("token not found");
		}
//		System.out.println("terminal value: "+arg0.getText());
		return null;
	}

	@Override
	public String visitProgram(MNCParser.ProgramContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin program");
		if (ctx.MAIN()!= null){
			visit(ctx.MAIN());
		}
		if (ctx.body()!= null){
			visit(ctx.body());
		}
		for(int i=0;i<ctx.funcdeclaration().size();i++){
			visit(ctx.funcdeclaration(i));
		}
//		System.out.println(ctx.body().toString());
		return "";
	}

	@Override
	public String visitBody(MNCParser.BodyContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin body");
		if (ctx.statements()!= null){
			visit(ctx.statements());
		}
		return null;
	}

	@Override
	public String visitStatements(MNCParser.StatementsContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin statements");
		for (int i=0;i<ctx.statement().size();i++){
			visit(ctx.statement(i));
		}
		return null;
	}

	@Override
	public String visitStatement(MNCParser.StatementContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin statement");
		if (ctx.arithmetic()!= null){
//			System.out.println("\nin arithmetic");
			visit(ctx.arithmetic());
		}
		if (ctx.assignment()!= null){
//			System.out.println("\nin assignment");
			visit(ctx.assignment());
		}
		if (ctx.functioncall()!= null){
//			System.out.println("\nin function call");
			visit(ctx.functioncall());
		}
		if (ctx.conditional()!= null){
//			System.out.println("\nin conditional");
			visit(ctx.conditional());
		}
		if (ctx.loop()!= null){
//			System.out.println("\nin loop");
			visit(ctx.loop());
		}
//		if (ctx.funcdeclaration()!= null){
////			System.out.println("\nin function declaration");
//			visit(ctx.funcdeclaration());
//		}
		if (ctx.printcall()!= null){
//			System.out.println("\nin printcall");
			visit(ctx.printcall());
		}
		return null;
	}

	@Override
	public String visitArithmetic(MNCParser.ArithmeticContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin arithmetic");
		if (ctx.type()!= null){
			visit(ctx.type());
		}
		if (ctx.var()!= null){
			visit(ctx.var());
		}
		return null;
	}
	
	@Override
	public String visitVar(MNCParser.VarContext ctx){
		System.out.println("\nin var");
		if(ctx.IDENTIFIER()!=null){
			visit(ctx.IDENTIFIER());
		}
		if(ctx.array()!=null){
			visit(ctx.array());
		}
		return null;
	}
	
	@Override
	public String visitArray(MNCParser.ArrayContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin array");
		if(ctx.IDENTIFIER()!=null){
			visit(ctx.IDENTIFIER());
		}
		if(ctx.ARRAYOPEN()!=null){
			visit(ctx.ARRAYOPEN());
		}
		for(int i=0; i<ctx.DIGIT().size(); i++){
			visit(ctx.DIGIT(i));
		}
		if(ctx.ARRAYCLOSE()!=null){
			visit(ctx.ARRAYCLOSE());
		}
		return null;
	}

	@Override
	public String visitType(MNCParser.TypeContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin type");
		if (ctx.NUM()!= null){
			visit(ctx.NUM());
		}
		if (ctx.BOOLT()!= null){
			visit(ctx.BOOLT());
		}
		return null;
	}

	@Override
	public String visitBool(MNCParser.BoolContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin bool");
		if (ctx.TRUE()!= null){
			visit(ctx.TRUE());
		}
		if (ctx.FALSE()!= null){
			visit(ctx.FALSE());
		}
		return null;
	}

	@Override
	public String visitAssignment(MNCParser.AssignmentContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin assignment");
		if (ctx.var()!= null){
			visit(ctx.var());
		}
		if (ctx.EQUALS()!= null){
			visit(ctx.EQUALS());
		}
		if (ctx.expr()!= null){
			visit(ctx.expr());
		}
		if (ctx.READ()!= null){
			visit(ctx.READ());
		}
		return null;
	}

	@Override
	public String visitExpr(MNCParser.ExprContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin expression");
		if (ctx.term()!= null){
			visit(ctx.term());
		}
		if (ctx.ADD()!= null){
			visit(ctx.ADD());
		}
		if (ctx.SUB()!= null){
			visit(ctx.SUB());
		}
		if (ctx.expr()!= null){
			visit(ctx.expr());
		}
		return null;
	}
	
	@Override
	public String visitTerm(MNCParser.TermContext ctx){
		System.out.println("\nin term");
		if (ctx.factor()!= null){
			visit(ctx.factor());
		}
		if (ctx.MUL()!= null){
			visit(ctx.MUL());
		}
		if (ctx.DIV()!= null){
			visit(ctx.DIV());
		}
		if (ctx.term()!= null){
			visit(ctx.term());
		}
		return null;
	}
	
	@Override
	public String visitFactor(MNCParser.FactorContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin factor");
		if (ctx.element()!= null){
			visit(ctx.element());
		}
		if (ctx.OPENPAR()!= null){
			visit(ctx.OPENPAR());
		}
		if (ctx.expr()!= null){
			visit(ctx.expr());
		}
		if (ctx.CLOSEPAR()!= null){
			visit(ctx.CLOSEPAR());
		}
		return null;
	}

	@Override
	public String visitElement(MNCParser.ElementContext ctx){
		System.out.println("\nin element");
		if(ctx.var()!=null){
			visit(ctx.var());
		}
		if(ctx.number()!=null){
			visit(ctx.number());
		}
		if(ctx.bool()!=null){
			visit(ctx.bool());
		}
		return null;
	}
	
	@Override
	public String visitNumber(MNCParser.NumberContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin number");
		if (ctx.sign()!= null){
			visit(ctx.sign());
		}
		if (ctx.DIGIT()!= null){
			for (int i=0; i<ctx.DIGIT().size();i++){
				visit(ctx.DIGIT(i));
			}
		}
		return null;
	}

	@Override
	public String visitConditional(MNCParser.ConditionalContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin conditional");
		if(ctx.IF()!=null){
			visit(ctx.IF());
		}
		if(ctx.OPENPAR()!=null){
			visit(ctx.OPENPAR());
		}
		if(ctx.boolcheck()!=null){
			visit(ctx.boolcheck());
		}
		if(ctx.var()!=null){
			visit(ctx.var());
		}
		if(ctx.CLOSEPAR()!=null){
			visit(ctx.CLOSEPAR());
		}
		if(ctx.body(0)!=null){
			visit(ctx.body(0));
		}
		if(ctx.ELSE()!=null){
			visit(ctx.ELSE());
			if(ctx.body(1)!=null){
				visit(ctx.body(1));
			}
		}
		return null;
	}

	@Override
	public String visitLoop(MNCParser.LoopContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin loop");
		if(ctx.LOOP()!=null){
			visit(ctx.LOOP());
		}
		if(ctx.OPENPAR(0)!=null){
			visit(ctx.OPENPAR(0));
		}
		if(ctx.var(0)!=null){
			visit(ctx.var(0));
		}
		if(ctx.number(0)!=null){
			visit(ctx.number(0));
		}
		if(ctx.CLOSEPAR(0)!=null){
			visit(ctx.CLOSEPAR(0));
		}
		if(ctx.TO()!=null){
			visit(ctx.TO());
		}
		if(ctx.OPENPAR(1)!=null){
			visit(ctx.OPENPAR(1));
		}
		if(ctx.var(1)!=null){
			visit(ctx.var(1));
		}
		if(ctx.number(1)!=null){
			visit(ctx.number(1));
		}
		if(ctx.CLOSEPAR(1)!=null){
			visit(ctx.CLOSEPAR(1));
		}
		if(ctx.WITH()!=null){
			visit(ctx.WITH());
		}
		if(ctx.number(2)!=null){
			visit(ctx.number(2));
		}
		if(ctx.body()!=null){
			visit(ctx.body());
		}
		return null;
	}

	@Override
	public String visitFuncdeclaration(MNCParser.FuncdeclarationContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("func declaration");
		if(ctx.FUNCTION()!=null){
			visit(ctx.FUNCTION());
		}
		if(ctx.IDENTIFIER()!=null){
			visit(ctx.IDENTIFIER());
		}
		if(ctx.OPENPAR()!=null){
			visit(ctx.OPENPAR());
		}
		for(int i=0;i<ctx.instatement().size();i++){
			visit(ctx.instatement(i));
		}
		if(ctx.outstatement()!=null){
			visit(ctx.outstatement());
		}
		if(ctx.CLOSEPAR()!=null){
			visit(ctx.CLOSEPAR());
		}
		if(ctx.body()!=null){
			visit(ctx.body());
		}
		return null;
	}

	@Override
	public String visitInstatement(MNCParser.InstatementContext ctx){
		System.out.println("\nin instatement");
		if(ctx.IN()!=null){
			visit(ctx.IN());
		}
		if(ctx.type()!=null){
			visit(ctx.type());
		}
		if(ctx.IDENTIFIER()!=null){
			visit(ctx.IDENTIFIER());
		}
		return null;
	}

	@Override
	public String visitOutstatement(MNCParser.OutstatementContext ctx){
		System.out.println("\nin instatement");
		if(ctx.OUT()!=null){
			visit(ctx.OUT());
		}
		if(ctx.type()!=null){
			visit(ctx.type());
		}
		if(ctx.IDENTIFIER()!=null){
			visit(ctx.IDENTIFIER());
		}
		return null;
	}

	@Override
	public String visitPrintcall(MNCParser.PrintcallContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("print call");
		if(ctx.PRINT()!=null){
			visit(ctx.PRINT());
		}
		if(ctx.var()!=null){
			visit(ctx.var());
		}
		if(ctx.bool()!=null){
			visit(ctx.bool());
		}
		if(ctx.number()!=null){
			visit(ctx.number());
		}
		return null;
	}

	@Override
	public String visitFunctioncall(MNCParser.FunctioncallContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin function call");
		if(ctx.IDENTIFIER()!=null){
			visit(ctx.IDENTIFIER());
		}
		if(ctx.OPENPAR()!=null){
			visit(ctx.OPENPAR());
		}
		if(ctx.var()!=null){
			visit(ctx.var(0));
		}
		for(int i=0;i<ctx.SEPERATOR().size();i++){
			visit(ctx.SEPERATOR(i));
			visit(ctx.var(i));
		}
		if(ctx.CLOSEPAR()!=null){
			visit(ctx.CLOSEPAR());
		}
		return null;
	}

	@Override
	public String visitBoolcheck(MNCParser.BoolcheckContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin boolcheck");
		if(ctx.expr(0)!=null){
			visit(ctx.expr(0));
		}
		if(ctx.CONDITIONS()!=null){
			visit(ctx.CONDITIONS());
		}
		if(ctx.expr(1)!=null){
			visit(ctx.expr(1));
		}
		return null;
	}

	@Override
	public String visitSign(MNCParser.SignContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin sign");
		if(ctx.OPENPAR()!=null){
			visit(ctx.OPENPAR());
		}
		if(ctx.ADD()!=null){
			visit(ctx.ADD());
		}
		if(ctx.SUB()!=null){
			visit(ctx.SUB());
		}
		if(ctx.CLOSEPAR()!=null){
			visit(ctx.CLOSEPAR());
		}
		return null;
	}
	
}
