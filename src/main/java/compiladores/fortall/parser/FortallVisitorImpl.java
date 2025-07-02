// Generated from Fortall.g4 by ANTLR 4.13.2
package compiladores.fortall.parser;

import org.apache.commons.lang3.StringEscapeUtils;

import java.io.InputStream;
import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class FortallVisitorImpl extends FortallBaseVisitor<Object> {

	private Map<String, Variavel> variaveis = new HashMap<>();
	private final Scanner scanner;

	public FortallVisitorImpl (InputStream inputStream) {
		scanner = new Scanner(inputStream);
	}

	@Override public Object visitPrograma(FortallParser.ProgramaContext ctx) {
		System.out.println("Executando programa " + ctx.ID().getSymbol().getText());

		visitDeclaracoes(ctx.declaracoes());

		visitCorpo(ctx.corpo());

		System.out.println("Programa executado com sucesso");
		return null;
	}
	
	@Override public Object visitDeclaracoes(FortallParser.DeclaracoesContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override public Object visitVariaveis(FortallParser.VariaveisContext ctx) {
		List<String> ids = (List<String>) visitIds(ctx.ids());
		String tipo = ctx.TIPO().getText();
		for (String id: ids) {
			if (!variaveis.containsKey(id)) {
				variaveis.put(id, new Variavel(id, tipo));
			} else {
				throw new RuntimeException("Variável \"" + id + "\" declarada. Linha " + ctx.start.getLine());
			}
		}
	 	visitMais_variaveis(ctx.mais_variaveis());
	 	return null;
	}
	
	@Override public Object visitMais_variaveis(FortallParser.Mais_variaveisContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitIds(FortallParser.IdsContext ctx) {
		List<String> ids = new ArrayList<>();
		ids.add(ctx.ID().getText());
		if (ctx.mais_ids() != null) {
			ids.addAll((List<String>) visitMais_ids(ctx.mais_ids()));
		}
		return ids;
	}
	
	@Override public Object visitMais_ids(FortallParser.Mais_idsContext ctx) {
		if (ctx.ids() != null) {
			return visitIds(ctx.ids());
		}
		return Collections.emptyList();
	}
	
	@Override public Object visitCorpo(FortallParser.CorpoContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitComandos(FortallParser.ComandosContext ctx) {
		visitComando(ctx.comando());
		if (ctx.mais_comandos() != null) {
			visitMais_comandos(ctx.mais_comandos());
		}
		return null;
	}
	
	@Override public Object visitMais_comandos(FortallParser.Mais_comandosContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitComando(FortallParser.ComandoContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitEscrita(FortallParser.EscritaContext ctx) {
		List<String> valores = (List<String>) visitValores_string(ctx.valores_string());
		for (String valor: valores) {
			System.out.print(StringEscapeUtils.unescapeJava(valor));
		}
		return null;
	}
	
	@Override public Object visitValores_string(FortallParser.Valores_stringContext ctx) {
		List<String> valores = new ArrayList<>();
		valores.add((String) visitValor_string(ctx.valor_string()));
		if (ctx.mais_valores_string() != null) {
			valores.addAll((List<String>) visitMais_valores_string(ctx.mais_valores_string()));
		}
		return valores;
	}
	
	@Override public Object visitMais_valores_string(FortallParser.Mais_valores_stringContext ctx) {
		if (ctx.valores_string() != null) {
			return visitValores_string(ctx.valores_string());
		}
		return Collections.emptyList();
	}
	
	@Override public Object visitLeitura(FortallParser.LeituraContext ctx) {
		List<String> ids = (List<String>) visitIds(ctx.ids());
		for (String id : ids) {
			Variavel variavel = variaveis.get(id);
			if (variavel != null) {
				variavel.ler(scanner);
			} else {
				throw new RuntimeException("Variável \"" + id + "\" não declarada. Linha " + ctx.start.getLine());
			}
		}
		return null;
	}
	
	@Override public Object visitAtribuicao(FortallParser.AtribuicaoContext ctx) {
		Variavel variavel = variaveis.get(ctx.ID().getText());
		if (variavel != null) {
			if (ctx.expressao() != null) {			
				//REFATORAR
				Integer valor = (Integer) visitExpressao(ctx.expressao());
				if (valor != 0 && valor != 1 && variavel.getTipo().equals("lógico")) {
					throw new RuntimeException("Valor da variável \"" + ctx.ID().getText() + "\" deve ser 0 ou 1. Linha " + ctx.start.getLine());
				}
				if (variavel.getTipo().equals("lógico")) {
					variavel.setValor(valor == 1);
				} else {
					variavel.setValor(valor);
				}
			} else if (ctx.BOOLEANO() != null) {
				//REFATORAR
				String valor = ctx.BOOLEANO().getText();
				if (valor.equalsIgnoreCase("verdadeiro") || valor.equalsIgnoreCase("falso")) {
					variavel.setValor(valor.equalsIgnoreCase("verdadeiro"));
				} else {
					throw new RuntimeException("Valor lógico inválido: " + valor + " Linha " + ctx.start.getLine());
				}
			}
		} else {
			throw new RuntimeException("Variável \"" + ctx.ID().getText() + "\" não declarada. Linha " + ctx.start.getLine());
		}
		return null;
	}
	
	@Override public Object visitSe(FortallParser.SeContext ctx) {
		if ((Integer) visitExpressao(ctx.expressao()) == 1) {
			visitComandos(ctx.comandos());
		} else if (ctx.senao() != null) {
			visitSenao(ctx.senao());
		}
		return null;
	}
	
	@Override public Object visitSenao(FortallParser.SenaoContext ctx) {
		if (ctx.se() != null) {
			visitSe(ctx.se());
		} else if (ctx.SENAO() != null) {
			visitComandos(ctx.comandos());
		}
		return null;
	}
	
	@Override public Object visitLoop(FortallParser.LoopContext ctx) {
		Integer resultadoExpressao = (Integer) visitExpressao(ctx.expressao());
		while (resultadoExpressao != 0) {
			visitComandos(ctx.comandos());
			resultadoExpressao = (Integer) visitExpressao(ctx.expressao());
		}
		return null;
	}
	
	@Override public Object visitExpressao(FortallParser.ExpressaoContext ctx) {
		if (ctx.expressao_aritmetica() != null) {
			return visitExpressao_aritmetica(ctx.expressao_aritmetica());
		} else {
			Boolean valor = (Boolean) visitExpressao_logica(ctx.expressao_logica());
			return valor ? 1 : 0;
		}
	}
	
	@Override public Object visitExpressao_logica(FortallParser.Expressao_logicaContext ctx) {
		Integer valor = (Integer) visitAritmetica(ctx.aritmetica());
		return resolveRelacao(ctx.relacao(), valor);
	}
	
	@Override public Object visitRelacao(FortallParser.RelacaoContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitAritmetica(FortallParser.AritmeticaContext ctx) {
		Integer valor = (Integer) visitPrecedente(ctx.precedente());
		if (ctx.termo() != null) {
			return resolveTermo(ctx.termo(), valor);
		}
		return valor;
	}
	
	@Override public Object visitTermo(FortallParser.TermoContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitPrecedente(FortallParser.PrecedenteContext ctx) {
		Integer valor = (Integer) visitSinalizador(ctx.sinalizador());
		if (ctx.fator() != null) {
			return resolveFator(ctx.fator(), valor);
		}
		return valor;
	}
	
	@Override public Object visitFator(FortallParser.FatorContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitSinalizador(FortallParser.SinalizadorContext ctx) {
		Integer valor = (Integer) visitValor(ctx.valor());
		if (ctx.MENOS() != null) {
			return valor * -1;
		}
		return valor;
	}

	@Override public Object visitValor(FortallParser.ValorContext ctx) {
		if (ctx.AP() != null) {
			return visitAritmetica(ctx.aritmetica());
		} else if (ctx.ID() != null) {
			Variavel variavel = variaveis.get(ctx.ID().getText());
			if (variavel == null) {
				throw new RuntimeException("Variável \"" + ctx.ID().getText() + "\" não declarada. Linha " + ctx.start.getLine());
			} else if (variavel.getValor() == null) {
				throw new RuntimeException("Variável \"" + ctx.ID().getText() + "\" não inicializada. Linha " + ctx.start.getLine());	
			}
			if (variavel.getValor() instanceof Boolean) {
				return ((Boolean) variavel.getValor()) ? 1 : 0; 
			}
			return variavel.getValor();
		} else {
			return Integer.parseInt(ctx.NUM().getText());
		}
	}

	private Boolean resolveRelacao(FortallParser.RelacaoContext ctx, Integer valorAnterior) {
		if (ctx.aritmetica() != null) {
			Integer valor = (Integer) visitAritmetica(ctx.aritmetica());
			if (ctx.EQ() != null) {
				return valorAnterior.equals(valor);
			} else if (ctx.NE() != null) {
				return !valorAnterior.equals(valor);
			} else if (ctx.GE() != null) {
				return valorAnterior >= valor;
			} else if (ctx.GT() != null) {
				return valorAnterior > valor;
			} else if (ctx.LE() != null) {
				return valorAnterior <= valor;
			} else if (ctx.LT() != null) {
				return valorAnterior < valor;
			}
 		}
		throw new RuntimeException("Erro inesperado ao avaliar expressão de relação. Linha " + ctx.start.getLine());
	}

	private Integer resolveFator(FortallParser.FatorContext ctx, Integer valorAnterior) {
		if (ctx.DIV() != null) {
			Integer valor = (Integer) visitSinalizador(ctx.sinalizador());
			if (ctx.fator() != null) {
				return resolveFator(ctx.fator(), valorAnterior / valor);
			}
			return valor / valorAnterior;
		} else if (ctx.MULT() != null) {
			Integer valor = (Integer) visitSinalizador(ctx.sinalizador());
			if (ctx.fator() != null) {
				return resolveFator(ctx.fator(), valorAnterior * valor);
			}
			return valor * valorAnterior;
		}
		return valorAnterior;
	}

	private Integer resolveTermo(FortallParser.TermoContext ctx, Integer valorAnterior) {
		if (ctx.MAIS() != null) {
			Integer valor = (Integer) visitPrecedente(ctx.precedente());
			if (ctx.termo() != null) {
				return resolveTermo(ctx.termo(), valorAnterior + valor);
			}
			return valor + valorAnterior;
		} else if (ctx.MENOS() != null) {
			Integer valor = (Integer) visitPrecedente(ctx.precedente());
			if (ctx.termo() != null) {
				return resolveTermo(ctx.termo(), valorAnterior - valor);
			}
			return valor - valorAnterior;
		}
		return valorAnterior;
	}

	@Override
	public Object visitExpressao_aritmetica(FortallParser.Expressao_aritmeticaContext ctx) {
		Integer valor = (Integer) visitAritmetica(ctx.aritmetica());
		if (ctx.fator() != null) {
			return resolveFator(ctx.fator(), valor);
		}
		return valor;
	}

	@Override
	public Object visitValor_string(FortallParser.Valor_stringContext ctx) {
		if (ctx.expressao() != null) {
			return visitExpressao(ctx.expressao()).toString();
		} else {
			return ctx.STRING().getText().substring(1, ctx.STRING().getText().length() -1);
		}
	}
}