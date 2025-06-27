// Generated from Fortall.g4 by ANTLR 4.13.2
package compiladores.fortall.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FortallParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ATR=1, AP=2, FP=3, VR=4, PV=5, DP=6, VAR=7, PROGRAMA=8, TIPO=9, INICIO=10, 
		FIM=11, ESCREVER=12, LER=13, SE=14, ENTAO=15, SENAO=16, ENQUANTO=17, FACA=18, 
		EQ=19, NE=20, GT=21, GE=22, LT=23, LE=24, MAIS=25, MENOS=26, MULT=27, 
		DIV=28, VALOR_STRING=29, ID=30, NUM=31, WS=32;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_variaveis = 2, RULE_mais_variaveis = 3, 
		RULE_ids = 4, RULE_mais_ids = 5, RULE_corpo = 6, RULE_comandos = 7, RULE_mais_comandos = 8, 
		RULE_comando = 9, RULE_escrita = 10, RULE_valores_string = 11, RULE_mais_valores_string = 12, 
		RULE_leitura = 13, RULE_atribuicao = 14, RULE_se = 15, RULE_senao = 16, 
		RULE_loop = 17, RULE_expressao = 18, RULE_expressao_logica = 19, RULE_relacao = 20, 
		RULE_aritmetica = 21, RULE_termo = 22, RULE_precedente = 23, RULE_fator = 24, 
		RULE_sinalizador = 25, RULE_valor = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "variaveis", "mais_variaveis", "ids", "mais_ids", 
			"corpo", "comandos", "mais_comandos", "comando", "escrita", "valores_string", 
			"mais_valores_string", "leitura", "atribuicao", "se", "senao", "loop", 
			"expressao", "expressao_logica", "relacao", "aritmetica", "termo", "precedente", 
			"fator", "sinalizador", "valor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':='", "'('", "')'", "','", "';'", "':'", "'var'", "'programa'", 
			null, "'in\\u00C3\\u00ADcio'", "'fim'", "'escrever'", "'ler'", "'se'", 
			"'ent\\u00C3\\u00A3o'", "'sen\\u00C3\\u00A3o'", "'enquanto'", "'fa\\u00C3\\u00A7a'", 
			"'='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ATR", "AP", "FP", "VR", "PV", "DP", "VAR", "PROGRAMA", "TIPO", 
			"INICIO", "FIM", "ESCREVER", "LER", "SE", "ENTAO", "SENAO", "ENQUANTO", 
			"FACA", "EQ", "NE", "GT", "GE", "LT", "LE", "MAIS", "MENOS", "MULT", 
			"DIV", "VALOR_STRING", "ID", "NUM", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Fortall.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FortallParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(FortallParser.PROGRAMA, 0); }
		public TerminalNode ID() { return getToken(FortallParser.ID, 0); }
		public TerminalNode PV() { return getToken(FortallParser.PV, 0); }
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(PROGRAMA);
			setState(55);
			match(ID);
			setState(56);
			match(PV);
			setState(57);
			declaracoes();
			setState(58);
			corpo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(FortallParser.VAR, 0); }
		public VariaveisContext variaveis() {
			return getRuleContext(VariaveisContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(VAR);
				setState(61);
				variaveis();
				}
				break;
			case INICIO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariaveisContext extends ParserRuleContext {
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode DP() { return getToken(FortallParser.DP, 0); }
		public TerminalNode TIPO() { return getToken(FortallParser.TIPO, 0); }
		public TerminalNode PV() { return getToken(FortallParser.PV, 0); }
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public VariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitVariaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitVariaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariaveisContext variaveis() throws RecognitionException {
		VariaveisContext _localctx = new VariaveisContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variaveis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			ids();
			setState(66);
			match(DP);
			setState(67);
			match(TIPO);
			setState(68);
			match(PV);
			setState(69);
			mais_variaveis();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mais_variaveisContext extends ParserRuleContext {
		public VariaveisContext variaveis() {
			return getRuleContext(VariaveisContext.class,0);
		}
		public Mais_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterMais_variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitMais_variaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitMais_variaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_variaveisContext mais_variaveis() throws RecognitionException {
		Mais_variaveisContext _localctx = new Mais_variaveisContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mais_variaveis);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				variaveis();
				}
				break;
			case INICIO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FortallParser.ID, 0); }
		public Mais_idsContext mais_ids() {
			return getRuleContext(Mais_idsContext.class,0);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitIds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitIds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ids);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ID);
			setState(76);
			mais_ids();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mais_idsContext extends ParserRuleContext {
		public TerminalNode VR() { return getToken(FortallParser.VR, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public Mais_idsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterMais_ids(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitMais_ids(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitMais_ids(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_idsContext mais_ids() throws RecognitionException {
		Mais_idsContext _localctx = new Mais_idsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mais_ids);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VR:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(VR);
				setState(79);
				ids();
				}
				break;
			case FP:
			case DP:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CorpoContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(FortallParser.INICIO, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FIM() { return getToken(FortallParser.FIM, 0); }
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(INICIO);
			setState(84);
			comandos();
			setState(85);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public TerminalNode PV() { return getToken(FortallParser.PV, 0); }
		public Mais_comandosContext mais_comandos() {
			return getRuleContext(Mais_comandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comandos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			comando();
			setState(88);
			match(PV);
			setState(89);
			mais_comandos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mais_comandosContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Mais_comandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterMais_comandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitMais_comandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitMais_comandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_comandosContext mais_comandos() throws RecognitionException {
		Mais_comandosContext _localctx = new Mais_comandosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mais_comandos);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESCREVER:
			case LER:
			case SE:
			case ENQUANTO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				comandos();
				}
				break;
			case FIM:
			case SENAO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public EscritaContext escrita() {
			return getRuleContext(EscritaContext.class,0);
		}
		public LeituraContext leitura() {
			return getRuleContext(LeituraContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comando);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESCREVER:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				escrita();
				}
				break;
			case LER:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				leitura();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				atribuicao();
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				se();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				loop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscritaContext extends ParserRuleContext {
		public TerminalNode ESCREVER() { return getToken(FortallParser.ESCREVER, 0); }
		public TerminalNode AP() { return getToken(FortallParser.AP, 0); }
		public Valores_stringContext valores_string() {
			return getRuleContext(Valores_stringContext.class,0);
		}
		public TerminalNode FP() { return getToken(FortallParser.FP, 0); }
		public EscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitEscrita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitEscrita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_escrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ESCREVER);
			setState(103);
			match(AP);
			setState(104);
			valores_string();
			setState(105);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Valores_stringContext extends ParserRuleContext {
		public TerminalNode VALOR_STRING() { return getToken(FortallParser.VALOR_STRING, 0); }
		public Mais_valores_stringContext mais_valores_string() {
			return getRuleContext(Mais_valores_stringContext.class,0);
		}
		public Valores_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterValores_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitValores_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitValores_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valores_stringContext valores_string() throws RecognitionException {
		Valores_stringContext _localctx = new Valores_stringContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valores_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(VALOR_STRING);
			setState(108);
			mais_valores_string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mais_valores_stringContext extends ParserRuleContext {
		public TerminalNode VR() { return getToken(FortallParser.VR, 0); }
		public Valores_stringContext valores_string() {
			return getRuleContext(Valores_stringContext.class,0);
		}
		public Mais_valores_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_valores_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterMais_valores_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitMais_valores_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitMais_valores_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_valores_stringContext mais_valores_string() throws RecognitionException {
		Mais_valores_stringContext _localctx = new Mais_valores_stringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mais_valores_string);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VR:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(VR);
				setState(111);
				valores_string();
				}
				break;
			case FP:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeituraContext extends ParserRuleContext {
		public TerminalNode LER() { return getToken(FortallParser.LER, 0); }
		public TerminalNode AP() { return getToken(FortallParser.AP, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode FP() { return getToken(FortallParser.FP, 0); }
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitLeitura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitLeitura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_leitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(LER);
			setState(116);
			match(AP);
			setState(117);
			ids();
			setState(118);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FortallParser.ID, 0); }
		public TerminalNode ATR() { return getToken(FortallParser.ATR, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ID);
			setState(121);
			match(ATR);
			setState(122);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(FortallParser.SE, 0); }
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(FortallParser.ENTAO, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public TerminalNode FIM() { return getToken(FortallParser.FIM, 0); }
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(SE);
			setState(125);
			expressao_logica();
			setState(126);
			match(ENTAO);
			setState(127);
			comandos();
			setState(128);
			senao();
			setState(129);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SenaoContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(FortallParser.SENAO, 0); }
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitSenao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitSenao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_senao);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(SENAO);
				setState(132);
				se();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(SENAO);
				setState(134);
				comandos();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(FortallParser.ENQUANTO, 0); }
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public TerminalNode FACA() { return getToken(FortallParser.FACA, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FIM() { return getToken(FortallParser.FIM, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ENQUANTO);
			setState(139);
			expressao_logica();
			setState(140);
			match(FACA);
			setState(141);
			comandos();
			setState(142);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public AritmeticaContext aritmetica() {
			return getRuleContext(AritmeticaContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			aritmetica();
			setState(145);
			fator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_logicaContext extends ParserRuleContext {
		public AritmeticaContext aritmetica() {
			return getRuleContext(AritmeticaContext.class,0);
		}
		public RelacaoContext relacao() {
			return getRuleContext(RelacaoContext.class,0);
		}
		public Expressao_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterExpressao_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitExpressao_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitExpressao_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_logicaContext expressao_logica() throws RecognitionException {
		Expressao_logicaContext _localctx = new Expressao_logicaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressao_logica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			aritmetica();
			setState(148);
			relacao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelacaoContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(FortallParser.EQ, 0); }
		public AritmeticaContext aritmetica() {
			return getRuleContext(AritmeticaContext.class,0);
		}
		public TerminalNode NE() { return getToken(FortallParser.NE, 0); }
		public TerminalNode GT() { return getToken(FortallParser.GT, 0); }
		public TerminalNode GE() { return getToken(FortallParser.GE, 0); }
		public TerminalNode LT() { return getToken(FortallParser.LT, 0); }
		public TerminalNode LE() { return getToken(FortallParser.LE, 0); }
		public RelacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterRelacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitRelacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitRelacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacaoContext relacao() throws RecognitionException {
		RelacaoContext _localctx = new RelacaoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relacao);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(EQ);
				setState(151);
				aritmetica();
				}
				break;
			case NE:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(NE);
				setState(153);
				aritmetica();
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(GT);
				setState(155);
				aritmetica();
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(GE);
				setState(157);
				aritmetica();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				match(LT);
				setState(159);
				aritmetica();
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				match(LE);
				setState(161);
				aritmetica();
				}
				break;
			case ENTAO:
			case FACA:
				enterOuterAlt(_localctx, 7);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AritmeticaContext extends ParserRuleContext {
		public PrecedenteContext precedente() {
			return getRuleContext(PrecedenteContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public AritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AritmeticaContext aritmetica() throws RecognitionException {
		AritmeticaContext _localctx = new AritmeticaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_aritmetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			precedente();
			setState(166);
			termo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public TerminalNode MAIS() { return getToken(FortallParser.MAIS, 0); }
		public PrecedenteContext precedente() {
			return getRuleContext(PrecedenteContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode MENOS() { return getToken(FortallParser.MENOS, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_termo);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(MAIS);
				setState(169);
				precedente();
				setState(170);
				termo();
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(MENOS);
				setState(173);
				precedente();
				setState(174);
				termo();
				}
				break;
			case FP:
			case PV:
			case ENTAO:
			case FACA:
			case EQ:
			case NE:
			case GT:
			case GE:
			case LT:
			case LE:
			case MULT:
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrecedenteContext extends ParserRuleContext {
		public SinalizadorContext sinalizador() {
			return getRuleContext(SinalizadorContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public PrecedenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterPrecedente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitPrecedente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitPrecedente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecedenteContext precedente() throws RecognitionException {
		PrecedenteContext _localctx = new PrecedenteContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_precedente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			sinalizador();
			setState(180);
			fator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(FortallParser.MULT, 0); }
		public SinalizadorContext sinalizador() {
			return getRuleContext(SinalizadorContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TerminalNode DIV() { return getToken(FortallParser.DIV, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fator);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(MULT);
				setState(183);
				sinalizador();
				setState(184);
				fator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(DIV);
				setState(187);
				sinalizador();
				setState(188);
				fator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SinalizadorContext extends ParserRuleContext {
		public TerminalNode MENOS() { return getToken(FortallParser.MENOS, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public SinalizadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinalizador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterSinalizador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitSinalizador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitSinalizador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinalizadorContext sinalizador() throws RecognitionException {
		SinalizadorContext _localctx = new SinalizadorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sinalizador);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(MENOS);
				setState(194);
				valor();
				}
				break;
			case AP:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				valor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(FortallParser.AP, 0); }
		public AritmeticaContext aritmetica() {
			return getRuleContext(AritmeticaContext.class,0);
		}
		public TerminalNode FP() { return getToken(FortallParser.FP, 0); }
		public TerminalNode ID() { return getToken(FortallParser.ID, 0); }
		public TerminalNode NUM() { return getToken(FortallParser.NUM, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortallListener ) ((FortallListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FortallVisitor ) return ((FortallVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_valor);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AP:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(AP);
				setState(199);
				aritmetica();
				setState(200);
				match(FP);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(ID);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001 \u00cf\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001@\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"J\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005R\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0003\b^\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\te\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0003\fr\b\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0089"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00a4\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00b2\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u00c0\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00c5"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u00cd\b\u001a\u0001\u001a\u0000\u0000\u001b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.024\u0000\u0000\u00cb\u00006\u0001\u0000\u0000\u0000\u0002?\u0001"+
		"\u0000\u0000\u0000\u0004A\u0001\u0000\u0000\u0000\u0006I\u0001\u0000\u0000"+
		"\u0000\bK\u0001\u0000\u0000\u0000\nQ\u0001\u0000\u0000\u0000\fS\u0001"+
		"\u0000\u0000\u0000\u000eW\u0001\u0000\u0000\u0000\u0010]\u0001\u0000\u0000"+
		"\u0000\u0012d\u0001\u0000\u0000\u0000\u0014f\u0001\u0000\u0000\u0000\u0016"+
		"k\u0001\u0000\u0000\u0000\u0018q\u0001\u0000\u0000\u0000\u001as\u0001"+
		"\u0000\u0000\u0000\u001cx\u0001\u0000\u0000\u0000\u001e|\u0001\u0000\u0000"+
		"\u0000 \u0088\u0001\u0000\u0000\u0000\"\u008a\u0001\u0000\u0000\u0000"+
		"$\u0090\u0001\u0000\u0000\u0000&\u0093\u0001\u0000\u0000\u0000(\u00a3"+
		"\u0001\u0000\u0000\u0000*\u00a5\u0001\u0000\u0000\u0000,\u00b1\u0001\u0000"+
		"\u0000\u0000.\u00b3\u0001\u0000\u0000\u00000\u00bf\u0001\u0000\u0000\u0000"+
		"2\u00c4\u0001\u0000\u0000\u00004\u00cc\u0001\u0000\u0000\u000067\u0005"+
		"\b\u0000\u000078\u0005\u001e\u0000\u000089\u0005\u0005\u0000\u00009:\u0003"+
		"\u0002\u0001\u0000:;\u0003\f\u0006\u0000;\u0001\u0001\u0000\u0000\u0000"+
		"<=\u0005\u0007\u0000\u0000=@\u0003\u0004\u0002\u0000>@\u0001\u0000\u0000"+
		"\u0000?<\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@\u0003\u0001"+
		"\u0000\u0000\u0000AB\u0003\b\u0004\u0000BC\u0005\u0006\u0000\u0000CD\u0005"+
		"\t\u0000\u0000DE\u0005\u0005\u0000\u0000EF\u0003\u0006\u0003\u0000F\u0005"+
		"\u0001\u0000\u0000\u0000GJ\u0003\u0004\u0002\u0000HJ\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000J\u0007\u0001"+
		"\u0000\u0000\u0000KL\u0005\u001e\u0000\u0000LM\u0003\n\u0005\u0000M\t"+
		"\u0001\u0000\u0000\u0000NO\u0005\u0004\u0000\u0000OR\u0003\b\u0004\u0000"+
		"PR\u0001\u0000\u0000\u0000QN\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000"+
		"\u0000R\u000b\u0001\u0000\u0000\u0000ST\u0005\n\u0000\u0000TU\u0003\u000e"+
		"\u0007\u0000UV\u0005\u000b\u0000\u0000V\r\u0001\u0000\u0000\u0000WX\u0003"+
		"\u0012\t\u0000XY\u0005\u0005\u0000\u0000YZ\u0003\u0010\b\u0000Z\u000f"+
		"\u0001\u0000\u0000\u0000[^\u0003\u000e\u0007\u0000\\^\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^\u0011\u0001"+
		"\u0000\u0000\u0000_e\u0003\u0014\n\u0000`e\u0003\u001a\r\u0000ae\u0003"+
		"\u001c\u000e\u0000be\u0003\u001e\u000f\u0000ce\u0003\"\u0011\u0000d_\u0001"+
		"\u0000\u0000\u0000d`\u0001\u0000\u0000\u0000da\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000e\u0013\u0001\u0000"+
		"\u0000\u0000fg\u0005\f\u0000\u0000gh\u0005\u0002\u0000\u0000hi\u0003\u0016"+
		"\u000b\u0000ij\u0005\u0003\u0000\u0000j\u0015\u0001\u0000\u0000\u0000"+
		"kl\u0005\u001d\u0000\u0000lm\u0003\u0018\f\u0000m\u0017\u0001\u0000\u0000"+
		"\u0000no\u0005\u0004\u0000\u0000or\u0003\u0016\u000b\u0000pr\u0001\u0000"+
		"\u0000\u0000qn\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r\u0019"+
		"\u0001\u0000\u0000\u0000st\u0005\r\u0000\u0000tu\u0005\u0002\u0000\u0000"+
		"uv\u0003\b\u0004\u0000vw\u0005\u0003\u0000\u0000w\u001b\u0001\u0000\u0000"+
		"\u0000xy\u0005\u001e\u0000\u0000yz\u0005\u0001\u0000\u0000z{\u0003$\u0012"+
		"\u0000{\u001d\u0001\u0000\u0000\u0000|}\u0005\u000e\u0000\u0000}~\u0003"+
		"&\u0013\u0000~\u007f\u0005\u000f\u0000\u0000\u007f\u0080\u0003\u000e\u0007"+
		"\u0000\u0080\u0081\u0003 \u0010\u0000\u0081\u0082\u0005\u000b\u0000\u0000"+
		"\u0082\u001f\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0010\u0000\u0000"+
		"\u0084\u0089\u0003\u001e\u000f\u0000\u0085\u0086\u0005\u0010\u0000\u0000"+
		"\u0086\u0089\u0003\u000e\u0007\u0000\u0087\u0089\u0001\u0000\u0000\u0000"+
		"\u0088\u0083\u0001\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000\u0000"+
		"\u0088\u0087\u0001\u0000\u0000\u0000\u0089!\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005\u0011\u0000\u0000\u008b\u008c\u0003&\u0013\u0000\u008c\u008d"+
		"\u0005\u0012\u0000\u0000\u008d\u008e\u0003\u000e\u0007\u0000\u008e\u008f"+
		"\u0005\u000b\u0000\u0000\u008f#\u0001\u0000\u0000\u0000\u0090\u0091\u0003"+
		"*\u0015\u0000\u0091\u0092\u00030\u0018\u0000\u0092%\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0003*\u0015\u0000\u0094\u0095\u0003(\u0014\u0000\u0095"+
		"\'\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0013\u0000\u0000\u0097\u00a4"+
		"\u0003*\u0015\u0000\u0098\u0099\u0005\u0014\u0000\u0000\u0099\u00a4\u0003"+
		"*\u0015\u0000\u009a\u009b\u0005\u0015\u0000\u0000\u009b\u00a4\u0003*\u0015"+
		"\u0000\u009c\u009d\u0005\u0016\u0000\u0000\u009d\u00a4\u0003*\u0015\u0000"+
		"\u009e\u009f\u0005\u0017\u0000\u0000\u009f\u00a4\u0003*\u0015\u0000\u00a0"+
		"\u00a1\u0005\u0018\u0000\u0000\u00a1\u00a4\u0003*\u0015\u0000\u00a2\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a3\u0096\u0001\u0000\u0000\u0000\u00a3\u0098"+
		"\u0001\u0000\u0000\u0000\u00a3\u009a\u0001\u0000\u0000\u0000\u00a3\u009c"+
		"\u0001\u0000\u0000\u0000\u00a3\u009e\u0001\u0000\u0000\u0000\u00a3\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4)\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0003.\u0017\u0000\u00a6\u00a7\u0003,\u0016"+
		"\u0000\u00a7+\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0019\u0000\u0000"+
		"\u00a9\u00aa\u0003.\u0017\u0000\u00aa\u00ab\u0003,\u0016\u0000\u00ab\u00b2"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u001a\u0000\u0000\u00ad\u00ae"+
		"\u0003.\u0017\u0000\u00ae\u00af\u0003,\u0016\u0000\u00af\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00a8\u0001\u0000"+
		"\u0000\u0000\u00b1\u00ac\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2-\u0001\u0000\u0000\u0000\u00b3\u00b4\u00032\u0019\u0000"+
		"\u00b4\u00b5\u00030\u0018\u0000\u00b5/\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0005\u001b\u0000\u0000\u00b7\u00b8\u00032\u0019\u0000\u00b8\u00b9\u0003"+
		"0\u0018\u0000\u00b9\u00c0\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u001c"+
		"\u0000\u0000\u00bb\u00bc\u00032\u0019\u0000\u00bc\u00bd\u00030\u0018\u0000"+
		"\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000"+
		"\u00bf\u00b6\u0001\u0000\u0000\u0000\u00bf\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bf\u00be\u0001\u0000\u0000\u0000\u00c01\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0005\u001a\u0000\u0000\u00c2\u00c5\u00034\u001a\u0000\u00c3\u00c5"+
		"\u00034\u001a\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c53\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u0002"+
		"\u0000\u0000\u00c7\u00c8\u0003*\u0015\u0000\u00c8\u00c9\u0005\u0003\u0000"+
		"\u0000\u00c9\u00cd\u0001\u0000\u0000\u0000\u00ca\u00cd\u0005\u001e\u0000"+
		"\u0000\u00cb\u00cd\u0005\u001f\u0000\u0000\u00cc\u00c6\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cd5\u0001\u0000\u0000\u0000\f?IQ]dq\u0088\u00a3\u00b1\u00bf"+
		"\u00c4\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}