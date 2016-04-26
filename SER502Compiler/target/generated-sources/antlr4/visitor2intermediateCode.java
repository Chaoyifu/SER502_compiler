//import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

//import MNCParser.LoopparContext;



public class visitor2intermediateCode extends MNCBaseVisitor<String>{
	
	private int temp_count=0;
	private int loop_count=0;
	private int if_count=0;
	private int else_count=0;

	CommonTokenStream tokens;
	public visitor2intermediateCode(CommonTokenStream tokens) {
		super();
		this.tokens = tokens;
	}

	@Override
	public String visitTerminal(TerminalNode arg0) {
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
		return null;
	}

	@Override
	public String visitProgram(MNCParser.ProgramContext ctx) {
		for(int i=0;i<ctx.arithmetic().size();i++){
			visit(ctx.arithmetic(i));
		}
		for(int i=0;i<ctx.funcdeclaration().size();i++){
			visit(ctx.funcdeclaration(i));
		}
		System.out.println("SRT");
		if (ctx.body()!= null){
			visit(ctx.body());
		}
		System.out.println("HLT");
		return "";
	}

	@Override
	public String visitBody(MNCParser.BodyContext ctx) {
		if (ctx.statements()!= null){
			visit(ctx.statements());
		}
		return null;
	}

	@Override
	public String visitStatements(MNCParser.StatementsContext ctx) {
		for (int i=0;i<ctx.statement().size();i++){
			visit(ctx.statement(i));
		}
		return null;
	}

	@Override
	public String visitStatement(MNCParser.StatementContext ctx) {
		if (ctx.arithmetic()!= null){
			visit(ctx.arithmetic());
		}
		if (ctx.assignment()!= null){
			visit(ctx.assignment());
		}
		if (ctx.functioncall()!= null){
			visit(ctx.functioncall());
		}
		if (ctx.conditional()!= null){
			visit(ctx.conditional());
		}
		if (ctx.loop()!= null){
			visit(ctx.loop());
		}
		if (ctx.printcall()!= null){
			visit(ctx.printcall());
		}
		return null;
	}

	@Override
	public String visitArithmetic(MNCParser.ArithmeticContext ctx) {
		String str="var "+visit(ctx.var())+" "+visit(ctx.type());
		System.out.println(str);
		return null;
	}
	
	@Override
	public String visitVar(MNCParser.VarContext ctx){
		if(ctx.IDENTIFIER()!=null){
			String id = ctx.IDENTIFIER().getText()+ " -1";
			return id;
		}
		if(ctx.array()!=null){
			String arr = visit(ctx.array());
			return arr;
		}
		return null;
	}
	
	@Override
	public String visitArray(MNCParser.ArrayContext ctx) {
		String arr = ctx.IDENTIFIER(0).getText()+ " ";
		if(ctx.DIGIT().size()>0){
			for(int i=0; i<ctx.DIGIT().size(); i++){
				arr = arr+ctx.DIGIT(i).getText();
			}
		}
		else{
			arr=arr+ctx.IDENTIFIER(1).getText();
		}
		return arr;
	}

	@Override
	public String visitType(MNCParser.TypeContext ctx) {
		if (ctx.NUM()!= null){
			return "NUM";
		}
		if (ctx.BOOLT()!= null){
			return "BLN";
		}
		return null;
	}

	@Override
	public String visitBool(MNCParser.BoolContext ctx) {
		if (ctx.TRUE()!= null){
			return "true";
		}
		if (ctx.FALSE()!= null){
			return "false";
		}
		return null;
	}

	@Override
	public String visitAssignment(MNCParser.AssignmentContext ctx) {
		String str="";
		if((ctx.var()).array()!=null){
			str = "EAR "+visit(ctx.var());
		}
		if((ctx.var()).IDENTIFIER()!=null){
			str = "EQL "+(ctx.var()).IDENTIFIER().getText();
		}
		if (ctx.expr()!= null){
			str = str + " "+visit(ctx.expr());
		}
		if (ctx.READ()!= null){
			str = str + " $IN";
		}
		System.out.println(str);
		return null;
	}

	@Override
	public String visitExpr(MNCParser.ExprContext ctx) {
		String str="";
		if (ctx.expr() == null){
			return visit(ctx.term());
		}
		else{
			int count = temp_count;
			temp_count++;
			if (ctx.ADD()!= null){
				str="ADD ";
			}
			if (ctx.SUB()!= null){
				str="SUB ";
			}
			str = str+count+"t "+visit(ctx.term())+" "+visit(ctx.expr());
			System.out.println(str);
			return ""+count+"t";
		}
	}
	
	@Override
	public String visitTerm(MNCParser.TermContext ctx){
		String str="";
		if (ctx.term()== null){
			return visit(ctx.factor());
		}
		else{
			int count = temp_count;
			temp_count++;
			if (ctx.MUL()!= null){
				str = "MUL ";
			}
			if (ctx.DIV()!= null){
				str = "DIV ";
			}
			str = str+count+"t "+visit(ctx.factor())+" "+visit(ctx.term());
			System.out.println(str);
			return ""+count+"t";
		}
	}
	
	@Override
	public String visitFactor(MNCParser.FactorContext ctx) {
		if (ctx.element()!= null){
			return visit(ctx.element());
		}
		if (ctx.expr()!= null){
			return visit(ctx.expr());
		}
		return null;
	}

	@Override
	public String visitElement(MNCParser.ElementContext ctx){
		if(ctx.var()!=null){
			if((ctx.var()).array()!=null){
				int count = temp_count;
				String str = "EAR "+count+"t "+visit(ctx.var());
				temp_count++;
				System.out.println(str);
				return ""+count+"t";
			}
			if((ctx.var()).IDENTIFIER()!=null){
				String str = ""+(ctx.var()).IDENTIFIER().getText();
				return str;
			}
		}
		if(ctx.number()!=null){
			return visit(ctx.number());
		}
		if(ctx.bool()!=null){
			return visit(ctx.bool());
		}
		return null;
	}
	
	@Override
	public String visitNumber(MNCParser.NumberContext ctx) {
		String str = "";
		if (ctx.sign()!= null){
			str+= visit(ctx.sign());
		}
		for (int i=0; i<ctx.DIGIT().size();i++){
			str+=ctx.DIGIT(i).getText();
		}
		return str;
	}

	@Override
	public String visitConditional(MNCParser.ConditionalContext ctx) {
		String strCond = "";
		int count = if_count;
		if(ctx.boolcheck()!=null){
			strCond=visit(ctx.boolcheck());
		}
		if(ctx.var()!=null){
			strCond="JNE "+count+"if ";
			String str = "";
			if_count++;
			if((ctx.var()).array()!=null){
				int tcount = temp_count;
				temp_count++;
				str = "EAR "+tcount+"t "+visit(ctx.var());
				System.out.println(str);
				strCond = strCond + tcount+"t true";
			}
			if((ctx.var()).IDENTIFIER()!=null){
				strCond = strCond + (ctx.var()).IDENTIFIER().getText()+" true";
			}
		}
		System.out.println(strCond);
		visit(ctx.body(0));
		if(ctx.ELSE()!=null){
			System.out.println("JMP "+count +"ifel");
			System.out.println("LBL "+count+"if");
			if(ctx.body(1)!=null){
				visit(ctx.body(1));
			}
			System.out.println("LBL "+count+"ifel");
		}
		else{
			System.out.println("LBL "+count+"if");
		}
		return null;
	}
	
	

	@Override
	public String visitLooppar(MNCParser.LoopparContext ctx) {
		if(ctx.number()!=null){
			int count=temp_count;
			System.out.println("EQL "+count+"t "+visit(ctx.number()));
			temp_count++;
			return count+"t";
		}
		if(ctx.var()!=null){
			int count=temp_count;
			if(ctx.var().array()!=null){
				System.out.println("EAR "+count+"t "+ visit(ctx.var()));
				temp_count++;
				return count+"t";
			}
			if(ctx.var().IDENTIFIER()!=null){
				return ctx.var().IDENTIFIER().getText();
			}
		}
		return "";
	}

	@Override
	public String visitLoop(MNCParser.LoopContext ctx) {
		int count=loop_count;
		loop_count++;
		String str="";
		if(ctx.number().sign()!=null){
			if((ctx.number().sign().getText())=="-"){
				str+="JLE ";
			}
			else{
				str+="JGE ";
			}
		}
		else{
			str+="JGE ";
		}
		String start = visit(ctx.looppar(0));
		String end = visit(ctx.looppar(1));
		System.out.println("LBL "+count+"loop");
		str+=count+"lpEND "+start+" "+end;
		System.out.println(str);
		visit(ctx.body());
		System.out.println("ADD "+start+" "+start+" "+visit(ctx.number()));
		System.out.println("JMP "+count+"loop");
		System.out.println("LBL "+count+"lpEND");
		return null;
	}

	@Override
	public String visitFuncdeclaration(MNCParser.FuncdeclarationContext ctx) { 
		String funcname = "";
		int outcount = 0; 
		funcname = ctx.IDENTIFIER().getText(); 
		String outpar="";
		if(ctx.outstatement()!=null){
			 outpar = visit(ctx.outstatement());
			outcount = 1;
		}
		System.out.println("LBL "+ funcname+ " "+ ctx.instatement().size()+" "+ outcount);
		for(int i=0;i<ctx.instatement().size();i++){
			String inpar = visit(ctx.instatement(i));
			System.out.println("IPT "+ inpar);
		}
		if(ctx.outstatement()!=null){
			System.out.println("OPT "+ outpar);
		} 
		visit(ctx.body());
		System.out.println("LBL "+funcname+"END"); 
		return null;
	}

	@Override
	public String visitInstatement(MNCParser.InstatementContext ctx){ 
		String type = "";
		String var= ""; 
		type = visit(ctx.type()); 
		var = visit(ctx.var());
		return type+" "+var;
	}

	@Override
	public String visitOutstatement(MNCParser.OutstatementContext ctx){
		String type = "";
		String id= "";
		type = visit(ctx.type());
		id = ctx.IDENTIFIER().getText();
		return type+" "+id+" -1";
	}

	@Override
	public String visitPrintcall(MNCParser.PrintcallContext ctx) {
		if(ctx.var()!=null){
			System.out.println("OUT var "+visit(ctx.var()));
		}
		if(ctx.bool()!=null){
			System.out.println("OUT val "+visit(ctx.bool()));
		}
		if(ctx.number()!=null){
			System.out.println("OUT val "+visit(ctx.number()));
		}
		return null;
	}

	@Override
	public String visitFunctioncall(MNCParser.FunctioncallContext ctx) {
		for(int i=0;i<ctx.var().size();i++){
			System.out.println("PAR "+visit(ctx.var(i)));
		}
		System.out.println("JMP "+ctx.IDENTIFIER().getText());
		return null;
	}

	@Override
	public String visitBoolcheck(MNCParser.BoolcheckContext ctx) {
		String str="";
		switch(ctx.CONDITIONS().getText()){
			case "==": str = str+"JNE ";
					break;
			case ">=":str = str+"JLT ";
					break;
			case "<=":str = str+"JGT ";
					break;
			case ">":str = str+"JLE ";
					break;
			case "<":str = str+"JGE ";
					break;
			case "!=":str = str+"JEQ ";
					break;
		}
		str = str+if_count+"if "+visit(ctx.expr(0))+" "+visit(ctx.expr(1));
		if_count++;
		return str;
	}

	@Override
	public String visitSign(MNCParser.SignContext ctx) {
		if(ctx.ADD()!=null){
			return "";
		}
		if(ctx.SUB()!=null){
			return "-";
		}
		return null;
	}	
}