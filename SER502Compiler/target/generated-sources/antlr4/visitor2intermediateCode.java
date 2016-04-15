//import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;


public class visitor2intermediateCode extends MNCBaseVisitor<String>{

//	@Override
//	public String visit(ParseTree arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String visitChildren(RuleNode arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String visitErrorNode(ErrorNode arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
	CommonTokenStream tokens;
	public visitor2intermediateCode(CommonTokenStream tokens) {
		super();
		this.tokens = tokens;
	}

	@Override
	public String visitTerm(MNCParser.TermContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTerm(ctx);
	}

	@Override
	public String visitSign(MNCParser.SignContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSign(ctx);
	}

	@Override
	public String visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
//		tokens.
//		arg0.get
//		arg0.g
		switch(arg0.getSymbol().getType()){
		case MNCLexer.MAIN: System.out.println("\n main");
							break;
		case MNCLexer.START: System.out.println("\n start");
		break;
		case MNCLexer.END: System.out.println("\n end");
		break;
		case MNCLexer.PROGRAMEND: System.out.println("\n programend");
		break;
		case MNCLexer.IDENTIFIER: System.out.println("\n identifier");
		break;
		case MNCLexer.EOD: System.out.println("\n eod");
		break;
		case MNCLexer.EQUALS: System.out.println("\n equals");
		break;
//		case MNCLexer.SIGN: System.out.println("\n sign");
//		break;
		case MNCLexer.DIGIT: System.out.println("\n digit");
		break;
		case MNCLexer.TRUE: System.out.println("\n true");
		break;
		case MNCLexer.FALSE: System.out.println("\n false");
		break;
		case MNCLexer.CONDITIONS: System.out.println("\n conditions");
		break;
//		case MNCLexer.ADDSUB: System.out.println("\n add");
//		break;
//		case MNCLexer.MUL: System.out.println("\n mul");
//		break;
		case MNCLexer.OPENPAR: System.out.println("\n openpar");
		break;
		case MNCLexer.CLOSEPAR: System.out.println("\n closepar");
		break;
		case MNCLexer.SEPERATOR: System.out.println("\n seperator");
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
		default: System.out.println("token not found");
		}
//		System.out.println("token symbol from MNC.tokens: "+arg0.getSymbol());
		System.out.println("terminal value: "+arg0.getText());
//		System.out.println(tokens.getTokens().get(arg0.getSymbol().getType()));
		return null;
	}

	@Override
	public String visitProgram(MNCParser.ProgramContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin program");
		if (ctx.body()!= null){
			visit(ctx.body());
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
//			System.out.println("in for"+ ctx.statement(i).toString());
			if (ctx.statement(i).arithmetic()!=null){
				visit(ctx.statement(i).arithmetic());
			}
			if (ctx.statement(i).assignment()!=null){
				visit(ctx.statement(i).assignment());
			}
			if (ctx.statement(i).funcdeclaration()!=null){
				visit(ctx.statement(i).funcdeclaration());
			}
			if (ctx.statement(i).functioncall()!=null){
				visit(ctx.statement(i).functioncall());
			}
			if (ctx.statement(i).conditional()!=null){
				visit(ctx.statement(i).conditional());
			}
			if (ctx.statement(i).loop()!=null){
				visit(ctx.statement(i).loop());
			}
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
		if (ctx.funcdeclaration()!= null){
//			System.out.println("\nin function declaration");
			visit(ctx.funcdeclaration());
		}
		if (ctx.conditional()!= null){
//			System.out.println("\nin conditional");
			visit(ctx.conditional());
		}
		if (ctx.loop()!= null){
//			System.out.println("\nin loop");
			visit(ctx.loop());
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
		if (ctx.IDENTIFIER()!= null){
			visit(ctx.IDENTIFIER());
		}
		return null;
	}

	@Override
	public String visitType(MNCParser.TypeContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin type");
		if (ctx.num()!= null){
			visit(ctx.num());
		}
		if (ctx.boolt()!= null){
			visit(ctx.boolt());
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
		if (ctx.IDENTIFIER()!= null){
			visit(ctx.IDENTIFIER());
		}
		if (ctx.EQUALS()!= null){
			visit(ctx.EQUALS());
		}
		if (ctx.expr()!= null){
			visit(ctx.expr());
		}
		return null;
	}

	@Override
	public String visitExpr(MNCParser.ExprContext ctx) {
		// TODO Auto-generated method stub
		int addcount=0;
		int mulcount=0;
		int factorcount = 0;
		System.out.println("\nin expression");
		for( int i=0; i<ctx.getChildCount();i++){
////			System.out.println(ctx.getChild(i).getText());
//			if(ctx.getChild(i)==ctx.addsub(addcount)){
//				System.out.println("add"+ ctx.getChild(i).getText());
//				addcount++;
//			}
//			if(ctx.getChild(i)==ctx.mul(mulcount)){
//				System.out.println("mul"+ ctx.getChild(i).getText());
//				mulcount++;
//			}
//			if(ctx.getChild(i)==ctx.factor(factorcount)){
//				System.out.println("factor"+ ctx.getChild(i).getText());
//				factorcount++;
//			}
		}
//		for(int i=0; i<ctx.expr().size();i++){
//			if (ctx.!= null){
//				visit(ctx.expr());
//			}
//			if (ctx.ADD()!= null){
//				visit(ctx.ADD());
//			}
//			if (ctx.term()!= null){
//				visit(ctx.term());
//			}
			
//		}
		return null;
	}
	
	@Override
	public String visitFactor(MNCParser.FactorContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin factor");
		if (ctx.IDENTIFIER()!= null){
			visit(ctx.IDENTIFIER());
		}
		if (ctx.number()!= null){
			visit(ctx.number());
		}
		return null;
	}

	@Override
	public String visitNumber(MNCParser.NumberContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin number");
//		if (ctx.SIGN()!= null){
//			visit(ctx.SIGN());
//		}
		if (ctx.DIGIT()!= null){
			for (int i=0; i<ctx.DIGIT().size();i++){
				visit(ctx.DIGIT(i));
			}
		}
		return null;
	}

	@Override
	public String visitFunctioncall(MNCParser.FunctioncallContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("\nin function call");
//		if (ctx.id()!= null){
//			visit(ctx.SIGN());
//		}
		return null;
	}

	@Override
	public String visitConditional(MNCParser.ConditionalContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitBoolcheck(MNCParser.BoolcheckContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitLoop(MNCParser.LoopContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitFuncdeclaration(MNCParser.FuncdeclarationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitNum(MNCParser.NumContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitBoolt(MNCParser.BooltContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}
}
