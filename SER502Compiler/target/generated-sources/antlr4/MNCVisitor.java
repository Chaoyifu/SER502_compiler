// Generated from MNC.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MNCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MNCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MNCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MNCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(MNCParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(MNCParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MNCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(MNCParser.ArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(MNCParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(MNCParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MNCParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(MNCParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MNCParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MNCParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MNCParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MNCParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(MNCParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(MNCParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(MNCParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(MNCParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#startlooppar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartlooppar(MNCParser.StartloopparContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#looppar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLooppar(MNCParser.LoopparContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#funcdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdeclaration(MNCParser.FuncdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#instatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstatement(MNCParser.InstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#outstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutstatement(MNCParser.OutstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#printcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintcall(MNCParser.PrintcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(MNCParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#boolcheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolcheck(MNCParser.BoolcheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link MNCParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(MNCParser.SignContext ctx);
}