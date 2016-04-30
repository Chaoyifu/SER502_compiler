import java.io.BufferedWriter;
import java.io.IOException;
import org.antlr.v4.runtime.tree.TerminalNode;

public class visitor2intermediateCode extends MNCBaseVisitor<String>{
	
	private int temp_count=0;
	private int loop_count=0;
	private int if_count=0;
	private BufferedWriter bufferedWriter;

//	CommonTokenStream tokens;
//	public visitor2intermediateCode(CommonTokenStream tokens) {
//		super();
//		this.tokens = tokens;
//	}

	public visitor2intermediateCode(BufferedWriter fWriter) {
		// TODO Auto-generated constructor stub
            bufferedWriter = fWriter;
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
		try {
			bufferedWriter.write("SRT\n");
			if (ctx.body()!= null){
				visit(ctx.body());
			}
			bufferedWriter.write("HLT\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Generating compiler file ");
			
			System.exit(0);
		}
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
		String str="VAR "+visit(ctx.type())+" "+visit(ctx.var());
		try {
			bufferedWriter.write(str+"\n");
		} catch (IOException e) {
			System.out.println("Error Generating compiler file");
			System.exit(0);
		}
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
			return "True";
		}
		if (ctx.FALSE()!= null){
			return "False";
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
		try {
			bufferedWriter.write(str+"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Generating compiler file");
			System.exit(0);
		}
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
			try {
				bufferedWriter.write(str+"\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error Generating compiler file");
				System.exit(0);
			}
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
			try {
				bufferedWriter.write(str+"\n");
			} catch (IOException e) {
				System.out.println("Error Generating compiler file");
				System.exit(0);
			}
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
				try {
					bufferedWriter.write(str+"\n");
				} catch (IOException e) {
					System.out.println("Error Generating compiler file");
					System.exit(0);
				}
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
				try {
					bufferedWriter.write(str+"\n");
				} catch (IOException e) {
					System.out.println("Error Generating compiler file");
					System.exit(0);
				}
				strCond = strCond + tcount+"t True";
			}
			if((ctx.var()).IDENTIFIER()!=null){
				strCond = strCond + (ctx.var()).IDENTIFIER().getText()+" True";
			}
		}
		try {
			bufferedWriter.write(strCond+"\n");
		} catch (IOException e) {
			System.out.println("Error Generating compiler file");
			System.exit(0);
		}
		visit(ctx.body(0));
		if(ctx.ELSE()!=null){
			try {
				bufferedWriter.write("JMP "+count +"ifel"+"\n");
			} catch (IOException e) {
				System.out.println("Error Generating compiler file");
				System.exit(0);
			}
			try {
				bufferedWriter.write("LBL "+count+"if"+"\n");
			} catch (IOException e) {
				System.out.println("Error Generating compiler file");
				System.exit(0);
			}
			if(ctx.body(1)!=null){
				visit(ctx.body(1));
			}
			try {
				bufferedWriter.write("LBL "+count+"ifel"+"\n");
			} catch (IOException e) {
				System.out.println("Error Generating compiler file");
				System.exit(0);
			}
		}
		else{
			try {
				bufferedWriter.write("LBL "+count+"if"+"\n");
			} catch (IOException e) {
				System.out.println("Error Generating compiler file");
				System.exit(0);
			}
		}
		return null;
	}

	@Override
	public String visitLooppar(MNCParser.LoopparContext ctx) {
		if(ctx.number()!=null){
			return visit(ctx.number());
		}
		if(ctx.IDENTIFIER()!=null){
			return ctx.IDENTIFIER().getText();
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
		try {
			bufferedWriter.write("LBL "+count+"loop"+"\n");
		} catch (IOException e) {
			System.out.println("Error Generating compiler file");
			System.exit(0);
		}
		str+=count+"lpEND "+start+" "+end;
		try {
			bufferedWriter.write(str+"\n");
		} catch (IOException e) {
			System.out.println("Error Generating compiler file");
			System.exit(0);
		}
		visit(ctx.body());
		try {
			bufferedWriter.write("ADD "+start+" "+start+" "+visit(ctx.number())+"\n");
		} catch (IOException e) {
			System.out.println("Error Generating compiler file");
			System.exit(0);
		}
		try {
			bufferedWriter.write("JMP "+count+"loop"+"\n");
		} catch (IOException e) {
			System.out.println("Error Generating compiler file");
			System.exit(0);
		}
		try {
			bufferedWriter.write("LBL "+count+"lpEND"+"\n");
		} catch (IOException e) {
			System.out.println("Error Generating compiler file");
			System.exit(0);
		}
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
		try {
			bufferedWriter.write("LBL "+ funcname+ " "+ ctx.instatement().size()+" "+ outcount+"\n");
		} catch (IOException e) {
			System.out.println("Error Generating compiler file");
			System.exit(0);
		}
		for(int i=0;i<ctx.instatement().size();i++){
			String inpar = visit(ctx.instatement(i));
			try {
				bufferedWriter.write("IPT "+ inpar+"\n");
			} catch (IOException e) {
				System.out.println("Error Generating compiler file");
				System.exit(0);
			}
		}
		if(ctx.outstatement()!=null){
			try {
				bufferedWriter.write("OPT "+ outpar+"\n");
			} catch (IOException e) {
				System.out.println("Error Generating compiler file");
				System.exit(0);
			}
		} 
		visit(ctx.body());
		try {
			bufferedWriter.write("LBL "+funcname+"END"+"\n");
		} catch (IOException e) {
			System.out.println("Error Generating compiler file");
			System.exit(0);
		}
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
			try {
				bufferedWriter.write("OUT var "+visit(ctx.var())+"\n");
			} catch (IOException e) {
				System.out.println("Error Generating compiler file");
				System.exit(0);
			}
		}
		if(ctx.bool()!=null){
			try {
				bufferedWriter.write("OUT val "+visit(ctx.bool())+"\n");
			} catch (IOException e) {
				System.out.println("Error Generating compiler file");
				System.exit(0);
			}
		}
		if(ctx.number()!=null){
			try {
				bufferedWriter.write("OUT val "+visit(ctx.number())+"\n");
			} catch (IOException e) {
				System.out.println("Error Generating compiler file");
				System.exit(0);
			}
		}
		return null;
	}

	@Override
	public String visitFunctioncall(MNCParser.FunctioncallContext ctx) {
		for(int i=0;i<ctx.var().size();i++){
			try {
				bufferedWriter.write("PAR "+visit(ctx.var(i))+"\n");
			} catch (IOException e) {
				System.out.println("Error Generating compiler file");
				System.exit(0);
			}
		}
		try {
			bufferedWriter.write("JMP "+ctx.IDENTIFIER().getText()+"\n");
		} catch (IOException e) {
			System.out.println("Error Generating compiler file");
			System.exit(0);
		}
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