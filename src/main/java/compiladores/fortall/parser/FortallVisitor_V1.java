// Generated from Fortall.g4 by ANTLR 4.13.2
package compiladores.fortall.parser;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class FortallVisitor_V1 extends FortallBaseVisitor<Object> {

	private Map<String, Variavel> variaveis = new HashMap<>();

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitPrograma(FortallParser.ProgramaContext ctx) {
		System.out.println("Executando programa " + ctx.ID().getSymbol().getText());

		visitDeclaracoes(ctx.declaracoes());

		visitCorpo(ctx.corpo());

		System.out.println("Programa executado com sucesso");
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitDeclaracoes(FortallParser.DeclaracoesContext ctx) {
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitVariaveis(FortallParser.VariaveisContext ctx) {
		List<String> ids = (List<String>) visitIds(ctx.ids());
		String tipo = ctx.TIPO().getText();
		for (String id: ids) {
			System.out.println("Declarada variável " + id + " do tipo " + tipo);
			variaveis.put(id, new Variavel(id, tipo));
		}
	 	visitMais_variaveis(ctx.mais_variaveis());
	 	return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitMais_variaveis(FortallParser.Mais_variaveisContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitIds(FortallParser.IdsContext ctx) {
		List<String> ids = new ArrayList<>();
		ids.add(ctx.ID().getText());
		if (ctx.mais_ids() != null) {
			ids.addAll((List<String>) visitMais_ids(ctx.mais_ids()));
		}
		return ids;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitMais_ids(FortallParser.Mais_idsContext ctx) {
		if (ctx.ids() != null) {
			return visitIds(ctx.ids());
		}
		return Collections.emptyList();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitCorpo(FortallParser.CorpoContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitComandos(FortallParser.ComandosContext ctx) {
		visitComando(ctx.comando());
		if (ctx.mais_comandos() != null) {
			visitMais_comandos(ctx.mais_comandos());
		}
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitMais_comandos(FortallParser.Mais_comandosContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitComando(FortallParser.ComandoContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitEscrita(FortallParser.EscritaContext ctx) {
		List<String> valores = (List<String>) visitValores_string(ctx.valores_string());
		for (String valor: valores) {
			System.out.print(valor.substring(1, valor.length() - 1));
		}
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitValores_string(FortallParser.Valores_stringContext ctx) {
		List<String> valores = new ArrayList<>();
		valores.add((String) visitValor_string(ctx.valor_string()));
		if (ctx.mais_valores_string() != null) {
			valores.addAll((List<String>) visitMais_valores_string(ctx.mais_valores_string()));
		}
		return valores;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitMais_valores_string(FortallParser.Mais_valores_stringContext ctx) {
		if (ctx.valores_string() != null) {
			return visitValores_string(ctx.valores_string());
		}
		return Collections.emptyList();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitLeitura(FortallParser.LeituraContext ctx) {
		List<String> ids = (List<String>) visitIds(ctx.ids());
		for (String id : ids) {
			//ler variaveis
		}
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitAtribuicao(FortallParser.AtribuicaoContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitSe(FortallParser.SeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitSenao(FortallParser.SenaoContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitLoop(FortallParser.LoopContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExpressao(FortallParser.ExpressaoContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExpressao_logica(FortallParser.Expressao_logicaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitRelacao(FortallParser.RelacaoContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitAritmetica(FortallParser.AritmeticaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitTermo(FortallParser.TermoContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitPrecedente(FortallParser.PrecedenteContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitFator(FortallParser.FatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitSinalizador(FortallParser.SinalizadorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitValor(FortallParser.ValorContext ctx) { return visitChildren(ctx); }
}