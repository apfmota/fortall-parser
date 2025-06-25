package compiladores.fortall.parser;// Generated from SimpleExpr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleExprParser}.
 */
public interface SimpleExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SimpleExprParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SimpleExprParser.TermContext ctx);
}