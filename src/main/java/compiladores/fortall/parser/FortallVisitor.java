// Generated from Fortall.g4 by ANTLR 4.13.2
package compiladores.fortall.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FortallParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FortallVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FortallParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(FortallParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(FortallParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#variaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariaveis(FortallParser.VariaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#mais_variaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_variaveis(FortallParser.Mais_variaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds(FortallParser.IdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#mais_ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_ids(FortallParser.Mais_idsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(FortallParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(FortallParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#mais_comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_comandos(FortallParser.Mais_comandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(FortallParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#escrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscrita(FortallParser.EscritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#valores_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValores_string(FortallParser.Valores_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#valor_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_string(FortallParser.Valor_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#mais_valores_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_valores_string(FortallParser.Mais_valores_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#leitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeitura(FortallParser.LeituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(FortallParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#se}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSe(FortallParser.SeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#senao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenao(FortallParser.SenaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(FortallParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(FortallParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_aritmetica(FortallParser.Expressao_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#expressao_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_logica(FortallParser.Expressao_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#relacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacao(FortallParser.RelacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmetica(FortallParser.AritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(FortallParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#precedente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedente(FortallParser.PrecedenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(FortallParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#sinalizador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinalizador(FortallParser.SinalizadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FortallParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(FortallParser.ValorContext ctx);
}