//import org.antlr.v4.runtime.tree.ParseTree;
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
	@Override
	public String visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		System.out.println("\ntoken number from MNC.tokens: "+arg0.getSymbol().getType());
		System.out.println("terminal value: "+arg0.getText());
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
		System.out.println("\nin expression");
		for(int i=0; i<ctx.expr().size();i++){
			if (ctx.expr(i).expr()!= null){
				visit(ctx.expr(i));
			}
			if (ctx.ADD()!= null){
				visit(ctx.expr(i).ADD());
			}
			if (ctx.MUL()!= null){
				visit(ctx.expr(i).MUL());
			}
			if (ctx.factor()!= null){
				visit(ctx.expr(i).factor());
			}
			
		}
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
		if (ctx.SIGN()!= null){
			visit(ctx.SIGN());
		}
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