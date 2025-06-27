// Generated from Fortall.g4 by ANTLR 4.13.2
package compiladores.fortall.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FortallParser}.
 */
public interface FortallListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FortallParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(FortallParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(FortallParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(FortallParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(FortallParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void enterVariaveis(FortallParser.VariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void exitVariaveis(FortallParser.VariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#mais_variaveis}.
	 * @param ctx the parse tree
	 */
	void enterMais_variaveis(FortallParser.Mais_variaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#mais_variaveis}.
	 * @param ctx the parse tree
	 */
	void exitMais_variaveis(FortallParser.Mais_variaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#ids}.
	 * @param ctx the parse tree
	 */
	void enterIds(FortallParser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#ids}.
	 * @param ctx the parse tree
	 */
	void exitIds(FortallParser.IdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#mais_ids}.
	 * @param ctx the parse tree
	 */
	void enterMais_ids(FortallParser.Mais_idsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#mais_ids}.
	 * @param ctx the parse tree
	 */
	void exitMais_ids(FortallParser.Mais_idsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(FortallParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(FortallParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(FortallParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(FortallParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#mais_comandos}.
	 * @param ctx the parse tree
	 */
	void enterMais_comandos(FortallParser.Mais_comandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#mais_comandos}.
	 * @param ctx the parse tree
	 */
	void exitMais_comandos(FortallParser.Mais_comandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(FortallParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(FortallParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterEscrita(FortallParser.EscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitEscrita(FortallParser.EscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#valores_string}.
	 * @param ctx the parse tree
	 */
	void enterValores_string(FortallParser.Valores_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#valores_string}.
	 * @param ctx the parse tree
	 */
	void exitValores_string(FortallParser.Valores_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#valor_string}.
	 * @param ctx the parse tree
	 */
	void enterValor_string(FortallParser.Valor_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#valor_string}.
	 * @param ctx the parse tree
	 */
	void exitValor_string(FortallParser.Valor_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#mais_valores_string}.
	 * @param ctx the parse tree
	 */
	void enterMais_valores_string(FortallParser.Mais_valores_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#mais_valores_string}.
	 * @param ctx the parse tree
	 */
	void exitMais_valores_string(FortallParser.Mais_valores_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterLeitura(FortallParser.LeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitLeitura(FortallParser.LeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(FortallParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(FortallParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#se}.
	 * @param ctx the parse tree
	 */
	void enterSe(FortallParser.SeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#se}.
	 * @param ctx the parse tree
	 */
	void exitSe(FortallParser.SeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#senao}.
	 * @param ctx the parse tree
	 */
	void enterSenao(FortallParser.SenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#senao}.
	 * @param ctx the parse tree
	 */
	void exitSenao(FortallParser.SenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(FortallParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(FortallParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(FortallParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(FortallParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_aritmetica(FortallParser.Expressao_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_aritmetica(FortallParser.Expressao_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_logica(FortallParser.Expressao_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_logica(FortallParser.Expressao_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#relacao}.
	 * @param ctx the parse tree
	 */
	void enterRelacao(FortallParser.RelacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#relacao}.
	 * @param ctx the parse tree
	 */
	void exitRelacao(FortallParser.RelacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterAritmetica(FortallParser.AritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitAritmetica(FortallParser.AritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(FortallParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(FortallParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#precedente}.
	 * @param ctx the parse tree
	 */
	void enterPrecedente(FortallParser.PrecedenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#precedente}.
	 * @param ctx the parse tree
	 */
	void exitPrecedente(FortallParser.PrecedenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(FortallParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(FortallParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#sinalizador}.
	 * @param ctx the parse tree
	 */
	void enterSinalizador(FortallParser.SinalizadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#sinalizador}.
	 * @param ctx the parse tree
	 */
	void exitSinalizador(FortallParser.SinalizadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortallParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(FortallParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortallParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(FortallParser.ValorContext ctx);
}