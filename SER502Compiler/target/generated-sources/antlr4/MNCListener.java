// Generated from MNC.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MNCParser}.
 */
public interface MNCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MNCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MNCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MNCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(MNCParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(MNCParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(MNCParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(MNCParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MNCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MNCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(MNCParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(MNCParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(MNCParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(MNCParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(MNCParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(MNCParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MNCParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MNCParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(MNCParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(MNCParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MNCParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MNCParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MNCParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MNCParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MNCParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MNCParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MNCParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MNCParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(MNCParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(MNCParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MNCParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MNCParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(MNCParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(MNCParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(MNCParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(MNCParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#startlooppar}.
	 * @param ctx the parse tree
	 */
	void enterStartlooppar(MNCParser.StartloopparContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#startlooppar}.
	 * @param ctx the parse tree
	 */
	void exitStartlooppar(MNCParser.StartloopparContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#looppar}.
	 * @param ctx the parse tree
	 */
	void enterLooppar(MNCParser.LoopparContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#looppar}.
	 * @param ctx the parse tree
	 */
	void exitLooppar(MNCParser.LoopparContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#funcdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncdeclaration(MNCParser.FuncdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#funcdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncdeclaration(MNCParser.FuncdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#instatement}.
	 * @param ctx the parse tree
	 */
	void enterInstatement(MNCParser.InstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#instatement}.
	 * @param ctx the parse tree
	 */
	void exitInstatement(MNCParser.InstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#outstatement}.
	 * @param ctx the parse tree
	 */
	void enterOutstatement(MNCParser.OutstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#outstatement}.
	 * @param ctx the parse tree
	 */
	void exitOutstatement(MNCParser.OutstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#printcall}.
	 * @param ctx the parse tree
	 */
	void enterPrintcall(MNCParser.PrintcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#printcall}.
	 * @param ctx the parse tree
	 */
	void exitPrintcall(MNCParser.PrintcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(MNCParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(MNCParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#boolcheck}.
	 * @param ctx the parse tree
	 */
	void enterBoolcheck(MNCParser.BoolcheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#boolcheck}.
	 * @param ctx the parse tree
	 */
	void exitBoolcheck(MNCParser.BoolcheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link MNCParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(MNCParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MNCParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(MNCParser.SignContext ctx);
}