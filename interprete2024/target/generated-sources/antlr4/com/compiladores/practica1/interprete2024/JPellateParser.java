// Generated from com/compiladores/practica1/interprete2024/JPellate.g4 by ANTLR 4.5.1
package com.compiladores.practica1.interprete2024;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JPellateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		P_GRUPO=1, P_VAR=2, P_S=3, P_E=4, P_IF=5, P_ELSE_IF=6, P_ELSE=7, P_SW=8, 
		P_OTRO=9, P_END=10, P_DEF=11, P_WHILE=12, P_FOR=13, P_FC=14, P_AND=15, 
		P_OR=16, P_S_OPERACION=17, P_S_NEGACION=18, P_S_DE_COMPA=19, S_ASI=20, 
		S_DO=21, P_A=22, P_C=23, P_COR_A=24, P_COR_C=25, P_LL_A=26, P_LL_C=27, 
		P_PUN_P_COMA=28, P_COMA=29, P_REGRESAR=30, P_COMILLAS=31, P_IDENTIFICADORES=32, 
		P_TEXTO=33, P_NUMERO=34, WS=35;
	public static final int
		RULE_start = 0, RULE_inicio = 1, RULE_v_asignar = 2, RULE_v_asignar_valor_P_NUMERO = 3, 
		RULE_v_asignar_valor_P_TEXTO = 4, RULE_c_s_P_TEXTO = 5, RULE_c_s_variable = 6, 
		RULE_c_s_combinado = 7, RULE_c_e_nuevo = 8, RULE_c_e_viejo = 9, RULE_if_unitario = 10, 
		RULE_if_else = 11, RULE_if_elseif = 12, RULE_elseif = 13, RULE_sw_switch = 14, 
		RULE_otro = 15, RULE_otro_P_TEXTO = 16, RULE_otro_P_NUMERO = 17, RULE_ciclo_while = 18, 
		RULE_ciclo_for = 19, RULE_rango = 20, RULE_rango_P_NUMERO = 21, RULE_rango_v_iz = 22, 
		RULE_rango_v_de = 23, RULE_rango_v = 24, RULE_funciones_p = 25, RULE_funcion_nr_vacio = 26, 
		RULE_funcion_nr_variables = 27, RULE_funcion_sr_vacio = 28, RULE_funcion_sr_variables = 29, 
		RULE_rtr = 30, RULE_vrt = 31, RULE_condicional = 32, RULE_c_normal = 33, 
		RULE_c_normal_and = 34, RULE_c_normal_or = 35, RULE_c_P_TEXTO = 36, RULE_c_P_TEXTO_iz = 37, 
		RULE_c_P_TEXTO_de = 38, RULE_c_num_iz = 39, RULE_c_num_de = 40;
	public static final String[] ruleNames = {
		"start", "inicio", "v_asignar", "v_asignar_valor_P_NUMERO", "v_asignar_valor_P_TEXTO", 
		"c_s_P_TEXTO", "c_s_variable", "c_s_combinado", "c_e_nuevo", "c_e_viejo", 
		"if_unitario", "if_else", "if_elseif", "elseif", "sw_switch", "otro", 
		"otro_P_TEXTO", "otro_P_NUMERO", "ciclo_while", "ciclo_for", "rango", 
		"rango_P_NUMERO", "rango_v_iz", "rango_v_de", "rango_v", "funciones_p", 
		"funcion_nr_vacio", "funcion_nr_variables", "funcion_sr_vacio", "funcion_sr_variables", 
		"rtr", "vrt", "condicional", "c_normal", "c_normal_and", "c_normal_or", 
		"c_P_TEXTO", "c_P_TEXTO_iz", "c_P_TEXTO_de", "c_num_iz", "c_num_de"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Grupo'", "'Variable'", "'Salida'", "'Entrada'", "'if'", "'else if'", 
		"'else'", "'Sw'", "'Otro'", "'end'", "'Def'", "'While'", "'For'", "'Funcion'", 
		"'AND'", "'OR'", null, "'!'", null, "'='", "'$'", "'('", "')'", "'['", 
		"']'", "'{'", "'}'", "';'", "','", "'->'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "P_GRUPO", "P_VAR", "P_S", "P_E", "P_IF", "P_ELSE_IF", "P_ELSE", 
		"P_SW", "P_OTRO", "P_END", "P_DEF", "P_WHILE", "P_FOR", "P_FC", "P_AND", 
		"P_OR", "P_S_OPERACION", "P_S_NEGACION", "P_S_DE_COMPA", "S_ASI", "S_DO", 
		"P_A", "P_C", "P_COR_A", "P_COR_C", "P_LL_A", "P_LL_C", "P_PUN_P_COMA", 
		"P_COMA", "P_REGRESAR", "P_COMILLAS", "P_IDENTIFICADORES", "P_TEXTO", 
		"P_NUMERO", "WS"
	};
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
	public String getGrammarFileName() { return "JPellate.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JPellateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode P_GRUPO() { return getToken(JPellateParser.P_GRUPO, 0); }
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public TerminalNode P_LL_A() { return getToken(JPellateParser.P_LL_A, 0); }
		public TerminalNode P_LL_C() { return getToken(JPellateParser.P_LL_C, 0); }
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(P_GRUPO);
			setState(83);
			match(P_IDENTIFICADORES);
			setState(84);
			match(P_LL_A);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_VAR) | (1L << P_S) | (1L << P_IF) | (1L << P_SW) | (1L << P_WHILE) | (1L << P_FOR) | (1L << P_FC) | (1L << P_IDENTIFICADORES))) != 0)) {
				{
				{
				setState(85);
				inicio();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(P_LL_C);
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

	public static class InicioContext extends ParserRuleContext {
		public V_asignarContext v_asignar() {
			return getRuleContext(V_asignarContext.class,0);
		}
		public V_asignar_valor_P_NUMEROContext v_asignar_valor_P_NUMERO() {
			return getRuleContext(V_asignar_valor_P_NUMEROContext.class,0);
		}
		public V_asignar_valor_P_TEXTOContext v_asignar_valor_P_TEXTO() {
			return getRuleContext(V_asignar_valor_P_TEXTOContext.class,0);
		}
		public C_s_P_TEXTOContext c_s_P_TEXTO() {
			return getRuleContext(C_s_P_TEXTOContext.class,0);
		}
		public C_s_variableContext c_s_variable() {
			return getRuleContext(C_s_variableContext.class,0);
		}
		public C_s_combinadoContext c_s_combinado() {
			return getRuleContext(C_s_combinadoContext.class,0);
		}
		public C_e_nuevoContext c_e_nuevo() {
			return getRuleContext(C_e_nuevoContext.class,0);
		}
		public C_e_viejoContext c_e_viejo() {
			return getRuleContext(C_e_viejoContext.class,0);
		}
		public If_unitarioContext if_unitario() {
			return getRuleContext(If_unitarioContext.class,0);
		}
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public If_elseifContext if_elseif() {
			return getRuleContext(If_elseifContext.class,0);
		}
		public Sw_switchContext sw_switch() {
			return getRuleContext(Sw_switchContext.class,0);
		}
		public Ciclo_whileContext ciclo_while() {
			return getRuleContext(Ciclo_whileContext.class,0);
		}
		public Ciclo_forContext ciclo_for() {
			return getRuleContext(Ciclo_forContext.class,0);
		}
		public Funciones_pContext funciones_p() {
			return getRuleContext(Funciones_pContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inicio);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				v_asignar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				v_asignar_valor_P_NUMERO();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				v_asignar_valor_P_TEXTO();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				c_s_P_TEXTO();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				c_s_variable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				c_s_combinado();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				c_e_nuevo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
				c_e_viejo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(101);
				if_unitario();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(102);
				if_else();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(103);
				if_elseif();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(104);
				sw_switch();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(105);
				ciclo_while();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(106);
				ciclo_for();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(107);
				funciones_p();
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

	public static class V_asignarContext extends ParserRuleContext {
		public TerminalNode P_VAR() { return getToken(JPellateParser.P_VAR, 0); }
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public TerminalNode P_PUN_P_COMA() { return getToken(JPellateParser.P_PUN_P_COMA, 0); }
		public V_asignarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_asignar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterV_asignar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitV_asignar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitV_asignar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V_asignarContext v_asignar() throws RecognitionException {
		V_asignarContext _localctx = new V_asignarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_v_asignar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(P_VAR);
			setState(111);
			match(P_IDENTIFICADORES);
			setState(112);
			match(P_PUN_P_COMA);
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

	public static class V_asignar_valor_P_NUMEROContext extends ParserRuleContext {
		public TerminalNode P_VAR() { return getToken(JPellateParser.P_VAR, 0); }
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public TerminalNode S_ASI() { return getToken(JPellateParser.S_ASI, 0); }
		public TerminalNode P_NUMERO() { return getToken(JPellateParser.P_NUMERO, 0); }
		public TerminalNode P_PUN_P_COMA() { return getToken(JPellateParser.P_PUN_P_COMA, 0); }
		public V_asignar_valor_P_NUMEROContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_asignar_valor_P_NUMERO; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterV_asignar_valor_P_NUMERO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitV_asignar_valor_P_NUMERO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitV_asignar_valor_P_NUMERO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V_asignar_valor_P_NUMEROContext v_asignar_valor_P_NUMERO() throws RecognitionException {
		V_asignar_valor_P_NUMEROContext _localctx = new V_asignar_valor_P_NUMEROContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_v_asignar_valor_P_NUMERO);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(P_VAR);
			setState(115);
			match(P_IDENTIFICADORES);
			setState(116);
			match(S_ASI);
			setState(117);
			match(P_NUMERO);
			setState(118);
			match(P_PUN_P_COMA);
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

	public static class V_asignar_valor_P_TEXTOContext extends ParserRuleContext {
		public TerminalNode P_VAR() { return getToken(JPellateParser.P_VAR, 0); }
		public List<TerminalNode> P_IDENTIFICADORES() { return getTokens(JPellateParser.P_IDENTIFICADORES); }
		public TerminalNode P_IDENTIFICADORES(int i) {
			return getToken(JPellateParser.P_IDENTIFICADORES, i);
		}
		public TerminalNode S_ASI() { return getToken(JPellateParser.S_ASI, 0); }
		public List<TerminalNode> P_COMILLAS() { return getTokens(JPellateParser.P_COMILLAS); }
		public TerminalNode P_COMILLAS(int i) {
			return getToken(JPellateParser.P_COMILLAS, i);
		}
		public TerminalNode P_PUN_P_COMA() { return getToken(JPellateParser.P_PUN_P_COMA, 0); }
		public V_asignar_valor_P_TEXTOContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_asignar_valor_P_TEXTO; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterV_asignar_valor_P_TEXTO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitV_asignar_valor_P_TEXTO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitV_asignar_valor_P_TEXTO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V_asignar_valor_P_TEXTOContext v_asignar_valor_P_TEXTO() throws RecognitionException {
		V_asignar_valor_P_TEXTOContext _localctx = new V_asignar_valor_P_TEXTOContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_v_asignar_valor_P_TEXTO);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(P_VAR);
			setState(121);
			match(P_IDENTIFICADORES);
			setState(122);
			match(S_ASI);
			setState(123);
			match(P_COMILLAS);
			setState(124);
			match(P_IDENTIFICADORES);
			setState(125);
			match(P_COMILLAS);
			setState(126);
			match(P_PUN_P_COMA);
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

	public static class C_s_P_TEXTOContext extends ParserRuleContext {
		public TerminalNode P_S() { return getToken(JPellateParser.P_S, 0); }
		public TerminalNode P_COR_A() { return getToken(JPellateParser.P_COR_A, 0); }
		public List<TerminalNode> P_COMILLAS() { return getTokens(JPellateParser.P_COMILLAS); }
		public TerminalNode P_COMILLAS(int i) {
			return getToken(JPellateParser.P_COMILLAS, i);
		}
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public TerminalNode P_COR_C() { return getToken(JPellateParser.P_COR_C, 0); }
		public TerminalNode P_PUN_P_COMA() { return getToken(JPellateParser.P_PUN_P_COMA, 0); }
		public C_s_P_TEXTOContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_s_P_TEXTO; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterC_s_P_TEXTO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitC_s_P_TEXTO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitC_s_P_TEXTO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_s_P_TEXTOContext c_s_P_TEXTO() throws RecognitionException {
		C_s_P_TEXTOContext _localctx = new C_s_P_TEXTOContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_c_s_P_TEXTO);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(P_S);
			setState(129);
			match(P_COR_A);
			setState(130);
			match(P_COMILLAS);
			setState(131);
			match(P_IDENTIFICADORES);
			setState(132);
			match(P_COMILLAS);
			setState(133);
			match(P_COR_C);
			setState(134);
			match(P_PUN_P_COMA);
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

	public static class C_s_variableContext extends ParserRuleContext {
		public TerminalNode P_S() { return getToken(JPellateParser.P_S, 0); }
		public TerminalNode P_COR_A() { return getToken(JPellateParser.P_COR_A, 0); }
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public TerminalNode P_COR_C() { return getToken(JPellateParser.P_COR_C, 0); }
		public TerminalNode P_PUN_P_COMA() { return getToken(JPellateParser.P_PUN_P_COMA, 0); }
		public C_s_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_s_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterC_s_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitC_s_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitC_s_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_s_variableContext c_s_variable() throws RecognitionException {
		C_s_variableContext _localctx = new C_s_variableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_c_s_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(P_S);
			setState(137);
			match(P_COR_A);
			setState(138);
			match(P_IDENTIFICADORES);
			setState(139);
			match(P_COR_C);
			setState(140);
			match(P_PUN_P_COMA);
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

	public static class C_s_combinadoContext extends ParserRuleContext {
		public TerminalNode P_S() { return getToken(JPellateParser.P_S, 0); }
		public TerminalNode P_COR_A() { return getToken(JPellateParser.P_COR_A, 0); }
		public List<TerminalNode> P_COMILLAS() { return getTokens(JPellateParser.P_COMILLAS); }
		public TerminalNode P_COMILLAS(int i) {
			return getToken(JPellateParser.P_COMILLAS, i);
		}
		public List<TerminalNode> P_IDENTIFICADORES() { return getTokens(JPellateParser.P_IDENTIFICADORES); }
		public TerminalNode P_IDENTIFICADORES(int i) {
			return getToken(JPellateParser.P_IDENTIFICADORES, i);
		}
		public TerminalNode S_DO() { return getToken(JPellateParser.S_DO, 0); }
		public TerminalNode P_COR_C() { return getToken(JPellateParser.P_COR_C, 0); }
		public TerminalNode P_PUN_P_COMA() { return getToken(JPellateParser.P_PUN_P_COMA, 0); }
		public C_s_combinadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_s_combinado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterC_s_combinado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitC_s_combinado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitC_s_combinado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_s_combinadoContext c_s_combinado() throws RecognitionException {
		C_s_combinadoContext _localctx = new C_s_combinadoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_c_s_combinado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(P_S);
			setState(143);
			match(P_COR_A);
			setState(144);
			match(P_COMILLAS);
			setState(145);
			match(P_IDENTIFICADORES);
			setState(146);
			match(P_COMILLAS);
			setState(147);
			match(S_DO);
			setState(148);
			match(P_IDENTIFICADORES);
			setState(149);
			match(P_COR_C);
			setState(150);
			match(P_PUN_P_COMA);
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

	public static class C_e_nuevoContext extends ParserRuleContext {
		public TerminalNode P_VAR() { return getToken(JPellateParser.P_VAR, 0); }
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public TerminalNode S_ASI() { return getToken(JPellateParser.S_ASI, 0); }
		public TerminalNode P_E() { return getToken(JPellateParser.P_E, 0); }
		public TerminalNode P_COR_A() { return getToken(JPellateParser.P_COR_A, 0); }
		public TerminalNode P_COR_C() { return getToken(JPellateParser.P_COR_C, 0); }
		public TerminalNode P_PUN_P_COMA() { return getToken(JPellateParser.P_PUN_P_COMA, 0); }
		public C_e_nuevoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_e_nuevo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterC_e_nuevo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitC_e_nuevo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitC_e_nuevo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_e_nuevoContext c_e_nuevo() throws RecognitionException {
		C_e_nuevoContext _localctx = new C_e_nuevoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_c_e_nuevo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(P_VAR);
			setState(153);
			match(P_IDENTIFICADORES);
			setState(154);
			match(S_ASI);
			setState(155);
			match(P_E);
			setState(156);
			match(P_COR_A);
			setState(157);
			match(P_COR_C);
			setState(158);
			match(P_PUN_P_COMA);
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

	public static class C_e_viejoContext extends ParserRuleContext {
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public TerminalNode S_ASI() { return getToken(JPellateParser.S_ASI, 0); }
		public TerminalNode P_E() { return getToken(JPellateParser.P_E, 0); }
		public TerminalNode P_COR_A() { return getToken(JPellateParser.P_COR_A, 0); }
		public TerminalNode P_COR_C() { return getToken(JPellateParser.P_COR_C, 0); }
		public TerminalNode P_PUN_P_COMA() { return getToken(JPellateParser.P_PUN_P_COMA, 0); }
		public C_e_viejoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_e_viejo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterC_e_viejo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitC_e_viejo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitC_e_viejo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_e_viejoContext c_e_viejo() throws RecognitionException {
		C_e_viejoContext _localctx = new C_e_viejoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_c_e_viejo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(P_IDENTIFICADORES);
			setState(161);
			match(S_ASI);
			setState(162);
			match(P_E);
			setState(163);
			match(P_COR_A);
			setState(164);
			match(P_COR_C);
			setState(165);
			match(P_PUN_P_COMA);
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

	public static class If_unitarioContext extends ParserRuleContext {
		public TerminalNode P_IF() { return getToken(JPellateParser.P_IF, 0); }
		public TerminalNode P_COR_A() { return getToken(JPellateParser.P_COR_A, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public TerminalNode P_COR_C() { return getToken(JPellateParser.P_COR_C, 0); }
		public TerminalNode P_LL_A() { return getToken(JPellateParser.P_LL_A, 0); }
		public TerminalNode P_LL_C() { return getToken(JPellateParser.P_LL_C, 0); }
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public If_unitarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_unitario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterIf_unitario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitIf_unitario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitIf_unitario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_unitarioContext if_unitario() throws RecognitionException {
		If_unitarioContext _localctx = new If_unitarioContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_unitario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(P_IF);
			setState(168);
			match(P_COR_A);
			setState(169);
			condicional();
			setState(170);
			match(P_COR_C);
			setState(171);
			match(P_LL_A);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_VAR) | (1L << P_S) | (1L << P_IF) | (1L << P_SW) | (1L << P_WHILE) | (1L << P_FOR) | (1L << P_FC) | (1L << P_IDENTIFICADORES))) != 0)) {
				{
				{
				setState(172);
				inicio();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(P_LL_C);
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

	public static class If_elseContext extends ParserRuleContext {
		public TerminalNode P_IF() { return getToken(JPellateParser.P_IF, 0); }
		public TerminalNode P_COR_A() { return getToken(JPellateParser.P_COR_A, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public TerminalNode P_COR_C() { return getToken(JPellateParser.P_COR_C, 0); }
		public List<TerminalNode> P_LL_A() { return getTokens(JPellateParser.P_LL_A); }
		public TerminalNode P_LL_A(int i) {
			return getToken(JPellateParser.P_LL_A, i);
		}
		public List<TerminalNode> P_LL_C() { return getTokens(JPellateParser.P_LL_C); }
		public TerminalNode P_LL_C(int i) {
			return getToken(JPellateParser.P_LL_C, i);
		}
		public TerminalNode P_ELSE() { return getToken(JPellateParser.P_ELSE, 0); }
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterIf_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitIf_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitIf_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(P_IF);
			setState(181);
			match(P_COR_A);
			setState(182);
			condicional();
			setState(183);
			match(P_COR_C);
			setState(184);
			match(P_LL_A);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_VAR) | (1L << P_S) | (1L << P_IF) | (1L << P_SW) | (1L << P_WHILE) | (1L << P_FOR) | (1L << P_FC) | (1L << P_IDENTIFICADORES))) != 0)) {
				{
				{
				setState(185);
				inicio();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(P_LL_C);
			setState(192);
			match(P_ELSE);
			setState(193);
			match(P_LL_A);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_VAR) | (1L << P_S) | (1L << P_IF) | (1L << P_SW) | (1L << P_WHILE) | (1L << P_FOR) | (1L << P_FC) | (1L << P_IDENTIFICADORES))) != 0)) {
				{
				{
				setState(194);
				inicio();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			match(P_LL_C);
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

	public static class If_elseifContext extends ParserRuleContext {
		public TerminalNode P_IF() { return getToken(JPellateParser.P_IF, 0); }
		public TerminalNode P_COR_A() { return getToken(JPellateParser.P_COR_A, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public TerminalNode P_COR_C() { return getToken(JPellateParser.P_COR_C, 0); }
		public List<TerminalNode> P_LL_A() { return getTokens(JPellateParser.P_LL_A); }
		public TerminalNode P_LL_A(int i) {
			return getToken(JPellateParser.P_LL_A, i);
		}
		public List<TerminalNode> P_LL_C() { return getTokens(JPellateParser.P_LL_C); }
		public TerminalNode P_LL_C(int i) {
			return getToken(JPellateParser.P_LL_C, i);
		}
		public TerminalNode P_ELSE() { return getToken(JPellateParser.P_ELSE, 0); }
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public List<ElseifContext> elseif() {
			return getRuleContexts(ElseifContext.class);
		}
		public ElseifContext elseif(int i) {
			return getRuleContext(ElseifContext.class,i);
		}
		public If_elseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterIf_elseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitIf_elseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitIf_elseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elseifContext if_elseif() throws RecognitionException {
		If_elseifContext _localctx = new If_elseifContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_elseif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(P_IF);
			setState(203);
			match(P_COR_A);
			setState(204);
			condicional();
			setState(205);
			match(P_COR_C);
			setState(206);
			match(P_LL_A);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_VAR) | (1L << P_S) | (1L << P_IF) | (1L << P_SW) | (1L << P_WHILE) | (1L << P_FOR) | (1L << P_FC) | (1L << P_IDENTIFICADORES))) != 0)) {
				{
				{
				setState(207);
				inicio();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(P_LL_C);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==P_ELSE_IF) {
				{
				{
				setState(214);
				elseif();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(P_ELSE);
			setState(221);
			match(P_LL_A);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_VAR) | (1L << P_S) | (1L << P_IF) | (1L << P_SW) | (1L << P_WHILE) | (1L << P_FOR) | (1L << P_FC) | (1L << P_IDENTIFICADORES))) != 0)) {
				{
				{
				setState(222);
				inicio();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(P_LL_C);
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

	public static class ElseifContext extends ParserRuleContext {
		public TerminalNode P_ELSE_IF() { return getToken(JPellateParser.P_ELSE_IF, 0); }
		public TerminalNode P_COR_A() { return getToken(JPellateParser.P_COR_A, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public TerminalNode P_COR_C() { return getToken(JPellateParser.P_COR_C, 0); }
		public TerminalNode P_LL_A() { return getToken(JPellateParser.P_LL_A, 0); }
		public TerminalNode P_LL_C() { return getToken(JPellateParser.P_LL_C, 0); }
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitElseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elseif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(P_ELSE_IF);
			setState(231);
			match(P_COR_A);
			setState(232);
			condicional();
			setState(233);
			match(P_COR_C);
			setState(234);
			match(P_LL_A);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_VAR) | (1L << P_S) | (1L << P_IF) | (1L << P_SW) | (1L << P_WHILE) | (1L << P_FOR) | (1L << P_FC) | (1L << P_IDENTIFICADORES))) != 0)) {
				{
				{
				setState(235);
				inicio();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			match(P_LL_C);
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

	public static class Sw_switchContext extends ParserRuleContext {
		public TerminalNode P_SW() { return getToken(JPellateParser.P_SW, 0); }
		public TerminalNode P_COR_A() { return getToken(JPellateParser.P_COR_A, 0); }
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public TerminalNode P_COR_C() { return getToken(JPellateParser.P_COR_C, 0); }
		public TerminalNode P_LL_A() { return getToken(JPellateParser.P_LL_A, 0); }
		public TerminalNode P_DEF() { return getToken(JPellateParser.P_DEF, 0); }
		public TerminalNode S_ASI() { return getToken(JPellateParser.S_ASI, 0); }
		public TerminalNode P_END() { return getToken(JPellateParser.P_END, 0); }
		public TerminalNode P_PUN_P_COMA() { return getToken(JPellateParser.P_PUN_P_COMA, 0); }
		public TerminalNode P_LL_C() { return getToken(JPellateParser.P_LL_C, 0); }
		public List<OtroContext> otro() {
			return getRuleContexts(OtroContext.class);
		}
		public OtroContext otro(int i) {
			return getRuleContext(OtroContext.class,i);
		}
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public Sw_switchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sw_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterSw_switch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitSw_switch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitSw_switch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sw_switchContext sw_switch() throws RecognitionException {
		Sw_switchContext _localctx = new Sw_switchContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sw_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(P_SW);
			setState(244);
			match(P_COR_A);
			setState(245);
			match(P_IDENTIFICADORES);
			setState(246);
			match(P_COR_C);
			setState(247);
			match(P_LL_A);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==P_OTRO) {
				{
				{
				setState(248);
				otro();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(P_DEF);
			setState(255);
			match(S_ASI);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_VAR) | (1L << P_S) | (1L << P_IF) | (1L << P_SW) | (1L << P_WHILE) | (1L << P_FOR) | (1L << P_FC) | (1L << P_IDENTIFICADORES))) != 0)) {
				{
				{
				setState(256);
				inicio();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(P_END);
			setState(263);
			match(P_PUN_P_COMA);
			setState(264);
			match(P_LL_C);
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

	public static class OtroContext extends ParserRuleContext {
		public Otro_P_TEXTOContext otro_P_TEXTO() {
			return getRuleContext(Otro_P_TEXTOContext.class,0);
		}
		public Otro_P_NUMEROContext otro_P_NUMERO() {
			return getRuleContext(Otro_P_NUMEROContext.class,0);
		}
		public OtroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterOtro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitOtro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitOtro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtroContext otro() throws RecognitionException {
		OtroContext _localctx = new OtroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_otro);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				otro_P_TEXTO();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				otro_P_NUMERO();
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

	public static class Otro_P_TEXTOContext extends ParserRuleContext {
		public TerminalNode P_OTRO() { return getToken(JPellateParser.P_OTRO, 0); }
		public TerminalNode P_COR_A() { return getToken(JPellateParser.P_COR_A, 0); }
		public List<TerminalNode> P_COMILLAS() { return getTokens(JPellateParser.P_COMILLAS); }
		public TerminalNode P_COMILLAS(int i) {
			return getToken(JPellateParser.P_COMILLAS, i);
		}
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public TerminalNode P_COR_C() { return getToken(JPellateParser.P_COR_C, 0); }
		public TerminalNode S_ASI() { return getToken(JPellateParser.S_ASI, 0); }
		public TerminalNode P_END() { return getToken(JPellateParser.P_END, 0); }
		public TerminalNode P_PUN_P_COMA() { return getToken(JPellateParser.P_PUN_P_COMA, 0); }
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public Otro_P_TEXTOContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otro_P_TEXTO; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterOtro_P_TEXTO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitOtro_P_TEXTO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitOtro_P_TEXTO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Otro_P_TEXTOContext otro_P_TEXTO() throws RecognitionException {
		Otro_P_TEXTOContext _localctx = new Otro_P_TEXTOContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_otro_P_TEXTO);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(P_OTRO);
			setState(271);
			match(P_COR_A);
			setState(272);
			match(P_COMILLAS);
			setState(273);
			match(P_IDENTIFICADORES);
			setState(274);
			match(P_COMILLAS);
			setState(275);
			match(P_COR_C);
			setState(276);
			match(S_ASI);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_VAR) | (1L << P_S) | (1L << P_IF) | (1L << P_SW) | (1L << P_WHILE) | (1L << P_FOR) | (1L << P_FC) | (1L << P_IDENTIFICADORES))) != 0)) {
				{
				{
				setState(277);
				inicio();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(P_END);
			setState(284);
			match(P_PUN_P_COMA);
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

	public static class Otro_P_NUMEROContext extends ParserRuleContext {
		public TerminalNode P_OTRO() { return getToken(JPellateParser.P_OTRO, 0); }
		public TerminalNode P_COR_A() { return getToken(JPellateParser.P_COR_A, 0); }
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public TerminalNode P_COR_C() { return getToken(JPellateParser.P_COR_C, 0); }
		public TerminalNode S_ASI() { return getToken(JPellateParser.S_ASI, 0); }
		public TerminalNode P_END() { return getToken(JPellateParser.P_END, 0); }
		public TerminalNode P_PUN_P_COMA() { return getToken(JPellateParser.P_PUN_P_COMA, 0); }
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public Otro_P_NUMEROContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otro_P_NUMERO; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterOtro_P_NUMERO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitOtro_P_NUMERO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitOtro_P_NUMERO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Otro_P_NUMEROContext otro_P_NUMERO() throws RecognitionException {
		Otro_P_NUMEROContext _localctx = new Otro_P_NUMEROContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_otro_P_NUMERO);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(P_OTRO);
			setState(287);
			match(P_COR_A);
			setState(288);
			match(P_IDENTIFICADORES);
			setState(289);
			match(P_COR_C);
			setState(290);
			match(S_ASI);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_VAR) | (1L << P_S) | (1L << P_IF) | (1L << P_SW) | (1L << P_WHILE) | (1L << P_FOR) | (1L << P_FC) | (1L << P_IDENTIFICADORES))) != 0)) {
				{
				{
				setState(291);
				inicio();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(P_END);
			setState(298);
			match(P_PUN_P_COMA);
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

	public static class Ciclo_whileContext extends ParserRuleContext {
		public TerminalNode P_WHILE() { return getToken(JPellateParser.P_WHILE, 0); }
		public TerminalNode P_COR_A() { return getToken(JPellateParser.P_COR_A, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public TerminalNode P_COR_C() { return getToken(JPellateParser.P_COR_C, 0); }
		public TerminalNode P_LL_A() { return getToken(JPellateParser.P_LL_A, 0); }
		public TerminalNode P_LL_C() { return getToken(JPellateParser.P_LL_C, 0); }
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public Ciclo_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterCiclo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitCiclo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitCiclo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_whileContext ciclo_while() throws RecognitionException {
		Ciclo_whileContext _localctx = new Ciclo_whileContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ciclo_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(P_WHILE);
			setState(301);
			match(P_COR_A);
			setState(302);
			condicional();
			setState(303);
			match(P_COR_C);
			setState(304);
			match(P_LL_A);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_VAR) | (1L << P_S) | (1L << P_IF) | (1L << P_SW) | (1L << P_WHILE) | (1L << P_FOR) | (1L << P_FC) | (1L << P_IDENTIFICADORES))) != 0)) {
				{
				{
				setState(305);
				inicio();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(P_LL_C);
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

	public static class Ciclo_forContext extends ParserRuleContext {
		public TerminalNode P_FOR() { return getToken(JPellateParser.P_FOR, 0); }
		public TerminalNode P_COR_A() { return getToken(JPellateParser.P_COR_A, 0); }
		public RangoContext rango() {
			return getRuleContext(RangoContext.class,0);
		}
		public TerminalNode P_COR_C() { return getToken(JPellateParser.P_COR_C, 0); }
		public TerminalNode P_LL_A() { return getToken(JPellateParser.P_LL_A, 0); }
		public TerminalNode P_LL_C() { return getToken(JPellateParser.P_LL_C, 0); }
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public Ciclo_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterCiclo_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitCiclo_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitCiclo_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_forContext ciclo_for() throws RecognitionException {
		Ciclo_forContext _localctx = new Ciclo_forContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ciclo_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(P_FOR);
			setState(314);
			match(P_COR_A);
			setState(315);
			rango();
			setState(316);
			match(P_COR_C);
			setState(317);
			match(P_LL_A);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_VAR) | (1L << P_S) | (1L << P_IF) | (1L << P_SW) | (1L << P_WHILE) | (1L << P_FOR) | (1L << P_FC) | (1L << P_IDENTIFICADORES))) != 0)) {
				{
				{
				setState(318);
				inicio();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			match(P_LL_C);
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

	public static class RangoContext extends ParserRuleContext {
		public Rango_P_NUMEROContext rango_P_NUMERO() {
			return getRuleContext(Rango_P_NUMEROContext.class,0);
		}
		public Rango_v_izContext rango_v_iz() {
			return getRuleContext(Rango_v_izContext.class,0);
		}
		public Rango_v_deContext rango_v_de() {
			return getRuleContext(Rango_v_deContext.class,0);
		}
		public Rango_vContext rango_v() {
			return getRuleContext(Rango_vContext.class,0);
		}
		public RangoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rango; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterRango(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitRango(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitRango(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangoContext rango() throws RecognitionException {
		RangoContext _localctx = new RangoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_rango);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				rango_P_NUMERO();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				rango_v_iz();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				rango_v_de();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				rango_v();
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

	public static class Rango_P_NUMEROContext extends ParserRuleContext {
		public List<TerminalNode> P_NUMERO() { return getTokens(JPellateParser.P_NUMERO); }
		public TerminalNode P_NUMERO(int i) {
			return getToken(JPellateParser.P_NUMERO, i);
		}
		public TerminalNode S_DO() { return getToken(JPellateParser.S_DO, 0); }
		public Rango_P_NUMEROContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rango_P_NUMERO; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterRango_P_NUMERO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitRango_P_NUMERO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitRango_P_NUMERO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rango_P_NUMEROContext rango_P_NUMERO() throws RecognitionException {
		Rango_P_NUMEROContext _localctx = new Rango_P_NUMEROContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rango_P_NUMERO);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(P_NUMERO);
			setState(333);
			match(S_DO);
			setState(334);
			match(P_NUMERO);
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

	public static class Rango_v_izContext extends ParserRuleContext {
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public TerminalNode S_DO() { return getToken(JPellateParser.S_DO, 0); }
		public TerminalNode P_NUMERO() { return getToken(JPellateParser.P_NUMERO, 0); }
		public Rango_v_izContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rango_v_iz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterRango_v_iz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitRango_v_iz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitRango_v_iz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rango_v_izContext rango_v_iz() throws RecognitionException {
		Rango_v_izContext _localctx = new Rango_v_izContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_rango_v_iz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(P_IDENTIFICADORES);
			setState(337);
			match(S_DO);
			setState(338);
			match(P_NUMERO);
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

	public static class Rango_v_deContext extends ParserRuleContext {
		public TerminalNode P_NUMERO() { return getToken(JPellateParser.P_NUMERO, 0); }
		public TerminalNode S_DO() { return getToken(JPellateParser.S_DO, 0); }
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public Rango_v_deContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rango_v_de; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterRango_v_de(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitRango_v_de(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitRango_v_de(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rango_v_deContext rango_v_de() throws RecognitionException {
		Rango_v_deContext _localctx = new Rango_v_deContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rango_v_de);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(P_NUMERO);
			setState(341);
			match(S_DO);
			setState(342);
			match(P_IDENTIFICADORES);
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

	public static class Rango_vContext extends ParserRuleContext {
		public List<TerminalNode> P_IDENTIFICADORES() { return getTokens(JPellateParser.P_IDENTIFICADORES); }
		public TerminalNode P_IDENTIFICADORES(int i) {
			return getToken(JPellateParser.P_IDENTIFICADORES, i);
		}
		public TerminalNode S_DO() { return getToken(JPellateParser.S_DO, 0); }
		public Rango_vContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rango_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterRango_v(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitRango_v(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitRango_v(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rango_vContext rango_v() throws RecognitionException {
		Rango_vContext _localctx = new Rango_vContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rango_v);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(P_IDENTIFICADORES);
			setState(345);
			match(S_DO);
			setState(346);
			match(P_IDENTIFICADORES);
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

	public static class Funciones_pContext extends ParserRuleContext {
		public Funcion_nr_vacioContext funcion_nr_vacio() {
			return getRuleContext(Funcion_nr_vacioContext.class,0);
		}
		public Funcion_nr_variablesContext funcion_nr_variables() {
			return getRuleContext(Funcion_nr_variablesContext.class,0);
		}
		public Funcion_sr_vacioContext funcion_sr_vacio() {
			return getRuleContext(Funcion_sr_vacioContext.class,0);
		}
		public Funcion_sr_variablesContext funcion_sr_variables() {
			return getRuleContext(Funcion_sr_variablesContext.class,0);
		}
		public Funciones_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funciones_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterFunciones_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitFunciones_p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitFunciones_p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funciones_pContext funciones_p() throws RecognitionException {
		Funciones_pContext _localctx = new Funciones_pContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funciones_p);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				funcion_nr_vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				funcion_nr_variables();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				funcion_sr_vacio();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				funcion_sr_variables();
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

	public static class Funcion_nr_vacioContext extends ParserRuleContext {
		public TerminalNode P_FC() { return getToken(JPellateParser.P_FC, 0); }
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public TerminalNode P_COR_A() { return getToken(JPellateParser.P_COR_A, 0); }
		public TerminalNode P_COR_C() { return getToken(JPellateParser.P_COR_C, 0); }
		public TerminalNode P_LL_A() { return getToken(JPellateParser.P_LL_A, 0); }
		public TerminalNode P_LL_C() { return getToken(JPellateParser.P_LL_C, 0); }
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public Funcion_nr_vacioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_nr_vacio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterFuncion_nr_vacio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitFuncion_nr_vacio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitFuncion_nr_vacio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcion_nr_vacioContext funcion_nr_vacio() throws RecognitionException {
		Funcion_nr_vacioContext _localctx = new Funcion_nr_vacioContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_funcion_nr_vacio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(P_FC);
			setState(355);
			match(P_IDENTIFICADORES);
			setState(356);
			match(P_COR_A);
			setState(357);
			match(P_COR_C);
			setState(358);
			match(P_LL_A);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_VAR) | (1L << P_S) | (1L << P_IF) | (1L << P_SW) | (1L << P_WHILE) | (1L << P_FOR) | (1L << P_FC) | (1L << P_IDENTIFICADORES))) != 0)) {
				{
				{
				setState(359);
				inicio();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			match(P_LL_C);
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

	public static class Funcion_nr_variablesContext extends ParserRuleContext {
		public TerminalNode P_FC() { return getToken(JPellateParser.P_FC, 0); }
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public TerminalNode P_COR_A() { return getToken(JPellateParser.P_COR_A, 0); }
		public TerminalNode P_COR_C() { return getToken(JPellateParser.P_COR_C, 0); }
		public TerminalNode P_LL_A() { return getToken(JPellateParser.P_LL_A, 0); }
		public TerminalNode P_LL_C() { return getToken(JPellateParser.P_LL_C, 0); }
		public List<VrtContext> vrt() {
			return getRuleContexts(VrtContext.class);
		}
		public VrtContext vrt(int i) {
			return getRuleContext(VrtContext.class,i);
		}
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public Funcion_nr_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_nr_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterFuncion_nr_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitFuncion_nr_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitFuncion_nr_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcion_nr_variablesContext funcion_nr_variables() throws RecognitionException {
		Funcion_nr_variablesContext _localctx = new Funcion_nr_variablesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_funcion_nr_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(P_FC);
			setState(368);
			match(P_IDENTIFICADORES);
			setState(369);
			match(P_COR_A);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==P_IDENTIFICADORES) {
				{
				{
				setState(370);
				vrt();
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			match(P_COR_C);
			setState(377);
			match(P_LL_A);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_VAR) | (1L << P_S) | (1L << P_IF) | (1L << P_SW) | (1L << P_WHILE) | (1L << P_FOR) | (1L << P_FC) | (1L << P_IDENTIFICADORES))) != 0)) {
				{
				{
				setState(378);
				inicio();
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
			match(P_LL_C);
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

	public static class Funcion_sr_vacioContext extends ParserRuleContext {
		public TerminalNode P_FC() { return getToken(JPellateParser.P_FC, 0); }
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public TerminalNode P_COR_A() { return getToken(JPellateParser.P_COR_A, 0); }
		public TerminalNode P_COR_C() { return getToken(JPellateParser.P_COR_C, 0); }
		public TerminalNode P_LL_A() { return getToken(JPellateParser.P_LL_A, 0); }
		public TerminalNode P_REGRESAR() { return getToken(JPellateParser.P_REGRESAR, 0); }
		public RtrContext rtr() {
			return getRuleContext(RtrContext.class,0);
		}
		public TerminalNode P_LL_C() { return getToken(JPellateParser.P_LL_C, 0); }
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public Funcion_sr_vacioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_sr_vacio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterFuncion_sr_vacio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitFuncion_sr_vacio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitFuncion_sr_vacio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcion_sr_vacioContext funcion_sr_vacio() throws RecognitionException {
		Funcion_sr_vacioContext _localctx = new Funcion_sr_vacioContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_funcion_sr_vacio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(P_FC);
			setState(387);
			match(P_IDENTIFICADORES);
			setState(388);
			match(P_COR_A);
			setState(389);
			match(P_COR_C);
			setState(390);
			match(P_LL_A);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_VAR) | (1L << P_S) | (1L << P_IF) | (1L << P_SW) | (1L << P_WHILE) | (1L << P_FOR) | (1L << P_FC) | (1L << P_IDENTIFICADORES))) != 0)) {
				{
				{
				setState(391);
				inicio();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
			match(P_REGRESAR);
			setState(398);
			rtr();
			setState(399);
			match(P_LL_C);
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

	public static class Funcion_sr_variablesContext extends ParserRuleContext {
		public TerminalNode P_FC() { return getToken(JPellateParser.P_FC, 0); }
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public TerminalNode P_COR_A() { return getToken(JPellateParser.P_COR_A, 0); }
		public TerminalNode P_COR_C() { return getToken(JPellateParser.P_COR_C, 0); }
		public TerminalNode P_LL_A() { return getToken(JPellateParser.P_LL_A, 0); }
		public TerminalNode P_REGRESAR() { return getToken(JPellateParser.P_REGRESAR, 0); }
		public RtrContext rtr() {
			return getRuleContext(RtrContext.class,0);
		}
		public TerminalNode P_LL_C() { return getToken(JPellateParser.P_LL_C, 0); }
		public List<VrtContext> vrt() {
			return getRuleContexts(VrtContext.class);
		}
		public VrtContext vrt(int i) {
			return getRuleContext(VrtContext.class,i);
		}
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public Funcion_sr_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_sr_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterFuncion_sr_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitFuncion_sr_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitFuncion_sr_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcion_sr_variablesContext funcion_sr_variables() throws RecognitionException {
		Funcion_sr_variablesContext _localctx = new Funcion_sr_variablesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_funcion_sr_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(P_FC);
			setState(402);
			match(P_IDENTIFICADORES);
			setState(403);
			match(P_COR_A);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==P_IDENTIFICADORES) {
				{
				{
				setState(404);
				vrt();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
			match(P_COR_C);
			setState(411);
			match(P_LL_A);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_VAR) | (1L << P_S) | (1L << P_IF) | (1L << P_SW) | (1L << P_WHILE) | (1L << P_FOR) | (1L << P_FC) | (1L << P_IDENTIFICADORES))) != 0)) {
				{
				{
				setState(412);
				inicio();
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
			match(P_REGRESAR);
			setState(419);
			rtr();
			setState(420);
			match(P_LL_C);
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

	public static class RtrContext extends ParserRuleContext {
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public TerminalNode P_NUMERO() { return getToken(JPellateParser.P_NUMERO, 0); }
		public RtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rtr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterRtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitRtr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitRtr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RtrContext rtr() throws RecognitionException {
		RtrContext _localctx = new RtrContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_rtr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_la = _input.LA(1);
			if ( !(_la==P_IDENTIFICADORES || _la==P_NUMERO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class VrtContext extends ParserRuleContext {
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public VrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vrt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterVrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitVrt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitVrt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VrtContext vrt() throws RecognitionException {
		VrtContext _localctx = new VrtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_vrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(P_IDENTIFICADORES);
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

	public static class CondicionalContext extends ParserRuleContext {
		public C_normalContext c_normal() {
			return getRuleContext(C_normalContext.class,0);
		}
		public C_normal_andContext c_normal_and() {
			return getRuleContext(C_normal_andContext.class,0);
		}
		public C_normal_orContext c_normal_or() {
			return getRuleContext(C_normal_orContext.class,0);
		}
		public C_P_TEXTOContext c_P_TEXTO() {
			return getRuleContext(C_P_TEXTOContext.class,0);
		}
		public C_P_TEXTO_izContext c_P_TEXTO_iz() {
			return getRuleContext(C_P_TEXTO_izContext.class,0);
		}
		public C_P_TEXTO_deContext c_P_TEXTO_de() {
			return getRuleContext(C_P_TEXTO_deContext.class,0);
		}
		public C_num_izContext c_num_iz() {
			return getRuleContext(C_num_izContext.class,0);
		}
		public C_num_deContext c_num_de() {
			return getRuleContext(C_num_deContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_condicional);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				c_normal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				c_normal_and();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				c_normal_or();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(429);
				c_P_TEXTO();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(430);
				c_P_TEXTO_iz();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(431);
				c_P_TEXTO_de();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(432);
				c_num_iz();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(433);
				c_num_de();
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

	public static class C_normalContext extends ParserRuleContext {
		public List<TerminalNode> P_IDENTIFICADORES() { return getTokens(JPellateParser.P_IDENTIFICADORES); }
		public TerminalNode P_IDENTIFICADORES(int i) {
			return getToken(JPellateParser.P_IDENTIFICADORES, i);
		}
		public TerminalNode P_S_DE_COMPA() { return getToken(JPellateParser.P_S_DE_COMPA, 0); }
		public C_normalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_normal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterC_normal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitC_normal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitC_normal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_normalContext c_normal() throws RecognitionException {
		C_normalContext _localctx = new C_normalContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_c_normal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(P_IDENTIFICADORES);
			setState(437);
			match(P_S_DE_COMPA);
			setState(438);
			match(P_IDENTIFICADORES);
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

	public static class C_normal_andContext extends ParserRuleContext {
		public List<TerminalNode> P_A() { return getTokens(JPellateParser.P_A); }
		public TerminalNode P_A(int i) {
			return getToken(JPellateParser.P_A, i);
		}
		public List<TerminalNode> P_IDENTIFICADORES() { return getTokens(JPellateParser.P_IDENTIFICADORES); }
		public TerminalNode P_IDENTIFICADORES(int i) {
			return getToken(JPellateParser.P_IDENTIFICADORES, i);
		}
		public List<TerminalNode> P_S_DE_COMPA() { return getTokens(JPellateParser.P_S_DE_COMPA); }
		public TerminalNode P_S_DE_COMPA(int i) {
			return getToken(JPellateParser.P_S_DE_COMPA, i);
		}
		public List<TerminalNode> P_C() { return getTokens(JPellateParser.P_C); }
		public TerminalNode P_C(int i) {
			return getToken(JPellateParser.P_C, i);
		}
		public TerminalNode P_AND() { return getToken(JPellateParser.P_AND, 0); }
		public C_normal_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_normal_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterC_normal_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitC_normal_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitC_normal_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_normal_andContext c_normal_and() throws RecognitionException {
		C_normal_andContext _localctx = new C_normal_andContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_c_normal_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(P_A);
			setState(441);
			match(P_IDENTIFICADORES);
			setState(442);
			match(P_S_DE_COMPA);
			setState(443);
			match(P_IDENTIFICADORES);
			setState(444);
			match(P_C);
			setState(445);
			match(P_AND);
			setState(446);
			match(P_A);
			setState(447);
			match(P_IDENTIFICADORES);
			setState(448);
			match(P_S_DE_COMPA);
			setState(449);
			match(P_IDENTIFICADORES);
			setState(450);
			match(P_C);
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

	public static class C_normal_orContext extends ParserRuleContext {
		public List<TerminalNode> P_A() { return getTokens(JPellateParser.P_A); }
		public TerminalNode P_A(int i) {
			return getToken(JPellateParser.P_A, i);
		}
		public List<TerminalNode> P_IDENTIFICADORES() { return getTokens(JPellateParser.P_IDENTIFICADORES); }
		public TerminalNode P_IDENTIFICADORES(int i) {
			return getToken(JPellateParser.P_IDENTIFICADORES, i);
		}
		public List<TerminalNode> P_S_DE_COMPA() { return getTokens(JPellateParser.P_S_DE_COMPA); }
		public TerminalNode P_S_DE_COMPA(int i) {
			return getToken(JPellateParser.P_S_DE_COMPA, i);
		}
		public List<TerminalNode> P_C() { return getTokens(JPellateParser.P_C); }
		public TerminalNode P_C(int i) {
			return getToken(JPellateParser.P_C, i);
		}
		public TerminalNode P_OR() { return getToken(JPellateParser.P_OR, 0); }
		public C_normal_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_normal_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterC_normal_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitC_normal_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitC_normal_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_normal_orContext c_normal_or() throws RecognitionException {
		C_normal_orContext _localctx = new C_normal_orContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_c_normal_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(P_A);
			setState(453);
			match(P_IDENTIFICADORES);
			setState(454);
			match(P_S_DE_COMPA);
			setState(455);
			match(P_IDENTIFICADORES);
			setState(456);
			match(P_C);
			setState(457);
			match(P_OR);
			setState(458);
			match(P_A);
			setState(459);
			match(P_IDENTIFICADORES);
			setState(460);
			match(P_S_DE_COMPA);
			setState(461);
			match(P_IDENTIFICADORES);
			setState(462);
			match(P_C);
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

	public static class C_P_TEXTOContext extends ParserRuleContext {
		public List<TerminalNode> P_COMILLAS() { return getTokens(JPellateParser.P_COMILLAS); }
		public TerminalNode P_COMILLAS(int i) {
			return getToken(JPellateParser.P_COMILLAS, i);
		}
		public List<TerminalNode> P_IDENTIFICADORES() { return getTokens(JPellateParser.P_IDENTIFICADORES); }
		public TerminalNode P_IDENTIFICADORES(int i) {
			return getToken(JPellateParser.P_IDENTIFICADORES, i);
		}
		public TerminalNode P_S_DE_COMPA() { return getToken(JPellateParser.P_S_DE_COMPA, 0); }
		public C_P_TEXTOContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_P_TEXTO; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterC_P_TEXTO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitC_P_TEXTO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitC_P_TEXTO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_P_TEXTOContext c_P_TEXTO() throws RecognitionException {
		C_P_TEXTOContext _localctx = new C_P_TEXTOContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_c_P_TEXTO);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(P_COMILLAS);
			setState(465);
			match(P_IDENTIFICADORES);
			setState(466);
			match(P_COMILLAS);
			setState(467);
			match(P_S_DE_COMPA);
			setState(468);
			match(P_COMILLAS);
			setState(469);
			match(P_IDENTIFICADORES);
			setState(470);
			match(P_COMILLAS);
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

	public static class C_P_TEXTO_izContext extends ParserRuleContext {
		public List<TerminalNode> P_COMILLAS() { return getTokens(JPellateParser.P_COMILLAS); }
		public TerminalNode P_COMILLAS(int i) {
			return getToken(JPellateParser.P_COMILLAS, i);
		}
		public List<TerminalNode> P_IDENTIFICADORES() { return getTokens(JPellateParser.P_IDENTIFICADORES); }
		public TerminalNode P_IDENTIFICADORES(int i) {
			return getToken(JPellateParser.P_IDENTIFICADORES, i);
		}
		public TerminalNode P_S_DE_COMPA() { return getToken(JPellateParser.P_S_DE_COMPA, 0); }
		public C_P_TEXTO_izContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_P_TEXTO_iz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterC_P_TEXTO_iz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitC_P_TEXTO_iz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitC_P_TEXTO_iz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_P_TEXTO_izContext c_P_TEXTO_iz() throws RecognitionException {
		C_P_TEXTO_izContext _localctx = new C_P_TEXTO_izContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_c_P_TEXTO_iz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(P_COMILLAS);
			setState(473);
			match(P_IDENTIFICADORES);
			setState(474);
			match(P_COMILLAS);
			setState(475);
			match(P_S_DE_COMPA);
			setState(476);
			match(P_IDENTIFICADORES);
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

	public static class C_P_TEXTO_deContext extends ParserRuleContext {
		public List<TerminalNode> P_IDENTIFICADORES() { return getTokens(JPellateParser.P_IDENTIFICADORES); }
		public TerminalNode P_IDENTIFICADORES(int i) {
			return getToken(JPellateParser.P_IDENTIFICADORES, i);
		}
		public TerminalNode P_S_DE_COMPA() { return getToken(JPellateParser.P_S_DE_COMPA, 0); }
		public List<TerminalNode> P_COMILLAS() { return getTokens(JPellateParser.P_COMILLAS); }
		public TerminalNode P_COMILLAS(int i) {
			return getToken(JPellateParser.P_COMILLAS, i);
		}
		public C_P_TEXTO_deContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_P_TEXTO_de; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterC_P_TEXTO_de(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitC_P_TEXTO_de(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitC_P_TEXTO_de(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_P_TEXTO_deContext c_P_TEXTO_de() throws RecognitionException {
		C_P_TEXTO_deContext _localctx = new C_P_TEXTO_deContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_c_P_TEXTO_de);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(P_IDENTIFICADORES);
			setState(479);
			match(P_S_DE_COMPA);
			setState(480);
			match(P_COMILLAS);
			setState(481);
			match(P_IDENTIFICADORES);
			setState(482);
			match(P_COMILLAS);
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

	public static class C_num_izContext extends ParserRuleContext {
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public TerminalNode P_S_DE_COMPA() { return getToken(JPellateParser.P_S_DE_COMPA, 0); }
		public TerminalNode P_NUMERO() { return getToken(JPellateParser.P_NUMERO, 0); }
		public C_num_izContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_num_iz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterC_num_iz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitC_num_iz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitC_num_iz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_num_izContext c_num_iz() throws RecognitionException {
		C_num_izContext _localctx = new C_num_izContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_c_num_iz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(P_IDENTIFICADORES);
			setState(485);
			match(P_S_DE_COMPA);
			setState(486);
			match(P_NUMERO);
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

	public static class C_num_deContext extends ParserRuleContext {
		public TerminalNode P_NUMERO() { return getToken(JPellateParser.P_NUMERO, 0); }
		public TerminalNode P_S_DE_COMPA() { return getToken(JPellateParser.P_S_DE_COMPA, 0); }
		public TerminalNode P_IDENTIFICADORES() { return getToken(JPellateParser.P_IDENTIFICADORES, 0); }
		public C_num_deContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_num_de; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).enterC_num_de(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JPellateListener ) ((JPellateListener)listener).exitC_num_de(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JPellateVisitor ) return ((JPellateVisitor<? extends T>)visitor).visitC_num_de(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_num_deContext c_num_de() throws RecognitionException {
		C_num_deContext _localctx = new C_num_deContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_c_num_de);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(P_NUMERO);
			setState(489);
			match(P_S_DE_COMPA);
			setState(490);
			match(P_IDENTIFICADORES);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u01ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3o\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b0\n\f\f\f\16\f\u00b3\13\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u00bd\n\r\f\r\16\r\u00c0\13\r\3\r\3\r\3\r\3\r\7"+
		"\r\u00c6\n\r\f\r\16\r\u00c9\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u00d3\n\16\f\16\16\16\u00d6\13\16\3\16\3\16\7\16\u00da\n\16\f\16"+
		"\16\16\u00dd\13\16\3\16\3\16\3\16\7\16\u00e2\n\16\f\16\16\16\u00e5\13"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ef\n\17\f\17\16\17"+
		"\u00f2\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00fc\n\20\f"+
		"\20\16\20\u00ff\13\20\3\20\3\20\3\20\7\20\u0104\n\20\f\20\16\20\u0107"+
		"\13\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u010f\n\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u0119\n\22\f\22\16\22\u011c\13\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0127\n\23\f\23\16\23\u012a"+
		"\13\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0135\n\24\f"+
		"\24\16\24\u0138\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0142"+
		"\n\25\f\25\16\25\u0145\13\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u014d"+
		"\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u0163\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\7\34\u016b\n\34\f\34\16\34\u016e\13\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\7\35\u0176\n\35\f\35\16\35\u0179\13\35\3\35\3\35\3\35\7\35"+
		"\u017e\n\35\f\35\16\35\u0181\13\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\7\36\u018b\n\36\f\36\16\36\u018e\13\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\7\37\u0198\n\37\f\37\16\37\u019b\13\37\3\37\3\37\3\37"+
		"\7\37\u01a0\n\37\f\37\16\37\u01a3\13\37\3\37\3\37\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01b5\n\"\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3*\3*\3*\3*\3*\2\2+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPR\2\3\4\2\"\"$$\u01f5\2T\3\2\2\2\4n\3\2\2\2\6"+
		"p\3\2\2\2\bt\3\2\2\2\nz\3\2\2\2\f\u0082\3\2\2\2\16\u008a\3\2\2\2\20\u0090"+
		"\3\2\2\2\22\u009a\3\2\2\2\24\u00a2\3\2\2\2\26\u00a9\3\2\2\2\30\u00b6\3"+
		"\2\2\2\32\u00cc\3\2\2\2\34\u00e8\3\2\2\2\36\u00f5\3\2\2\2 \u010e\3\2\2"+
		"\2\"\u0110\3\2\2\2$\u0120\3\2\2\2&\u012e\3\2\2\2(\u013b\3\2\2\2*\u014c"+
		"\3\2\2\2,\u014e\3\2\2\2.\u0152\3\2\2\2\60\u0156\3\2\2\2\62\u015a\3\2\2"+
		"\2\64\u0162\3\2\2\2\66\u0164\3\2\2\28\u0171\3\2\2\2:\u0184\3\2\2\2<\u0193"+
		"\3\2\2\2>\u01a8\3\2\2\2@\u01aa\3\2\2\2B\u01b4\3\2\2\2D\u01b6\3\2\2\2F"+
		"\u01ba\3\2\2\2H\u01c6\3\2\2\2J\u01d2\3\2\2\2L\u01da\3\2\2\2N\u01e0\3\2"+
		"\2\2P\u01e6\3\2\2\2R\u01ea\3\2\2\2TU\7\3\2\2UV\7\"\2\2VZ\7\34\2\2WY\5"+
		"\4\3\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]"+
		"^\7\35\2\2^\3\3\2\2\2_o\5\6\4\2`o\5\b\5\2ao\5\n\6\2bo\5\f\7\2co\5\16\b"+
		"\2do\5\20\t\2eo\5\22\n\2fo\5\24\13\2go\5\26\f\2ho\5\30\r\2io\5\32\16\2"+
		"jo\5\36\20\2ko\5&\24\2lo\5(\25\2mo\5\64\33\2n_\3\2\2\2n`\3\2\2\2na\3\2"+
		"\2\2nb\3\2\2\2nc\3\2\2\2nd\3\2\2\2ne\3\2\2\2nf\3\2\2\2ng\3\2\2\2nh\3\2"+
		"\2\2ni\3\2\2\2nj\3\2\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\5\3\2\2\2pq\7"+
		"\4\2\2qr\7\"\2\2rs\7\36\2\2s\7\3\2\2\2tu\7\4\2\2uv\7\"\2\2vw\7\26\2\2"+
		"wx\7$\2\2xy\7\36\2\2y\t\3\2\2\2z{\7\4\2\2{|\7\"\2\2|}\7\26\2\2}~\7!\2"+
		"\2~\177\7\"\2\2\177\u0080\7!\2\2\u0080\u0081\7\36\2\2\u0081\13\3\2\2\2"+
		"\u0082\u0083\7\5\2\2\u0083\u0084\7\32\2\2\u0084\u0085\7!\2\2\u0085\u0086"+
		"\7\"\2\2\u0086\u0087\7!\2\2\u0087\u0088\7\33\2\2\u0088\u0089\7\36\2\2"+
		"\u0089\r\3\2\2\2\u008a\u008b\7\5\2\2\u008b\u008c\7\32\2\2\u008c\u008d"+
		"\7\"\2\2\u008d\u008e\7\33\2\2\u008e\u008f\7\36\2\2\u008f\17\3\2\2\2\u0090"+
		"\u0091\7\5\2\2\u0091\u0092\7\32\2\2\u0092\u0093\7!\2\2\u0093\u0094\7\""+
		"\2\2\u0094\u0095\7!\2\2\u0095\u0096\7\27\2\2\u0096\u0097\7\"\2\2\u0097"+
		"\u0098\7\33\2\2\u0098\u0099\7\36\2\2\u0099\21\3\2\2\2\u009a\u009b\7\4"+
		"\2\2\u009b\u009c\7\"\2\2\u009c\u009d\7\26\2\2\u009d\u009e\7\6\2\2\u009e"+
		"\u009f\7\32\2\2\u009f\u00a0\7\33\2\2\u00a0\u00a1\7\36\2\2\u00a1\23\3\2"+
		"\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00a4\7\26\2\2\u00a4\u00a5\7\6\2\2\u00a5"+
		"\u00a6\7\32\2\2\u00a6\u00a7\7\33\2\2\u00a7\u00a8\7\36\2\2\u00a8\25\3\2"+
		"\2\2\u00a9\u00aa\7\7\2\2\u00aa\u00ab\7\32\2\2\u00ab\u00ac\5B\"\2\u00ac"+
		"\u00ad\7\33\2\2\u00ad\u00b1\7\34\2\2\u00ae\u00b0\5\4\3\2\u00af\u00ae\3"+
		"\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\35\2\2\u00b5\27\3\2\2"+
		"\2\u00b6\u00b7\7\7\2\2\u00b7\u00b8\7\32\2\2\u00b8\u00b9\5B\"\2\u00b9\u00ba"+
		"\7\33\2\2\u00ba\u00be\7\34\2\2\u00bb\u00bd\5\4\3\2\u00bc\u00bb\3\2\2\2"+
		"\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\35\2\2\u00c2\u00c3\7\t\2\2"+
		"\u00c3\u00c7\7\34\2\2\u00c4\u00c6\5\4\3\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cb\7\35\2\2\u00cb\31\3\2\2\2\u00cc\u00cd\7\7\2"+
		"\2\u00cd\u00ce\7\32\2\2\u00ce\u00cf\5B\"\2\u00cf\u00d0\7\33\2\2\u00d0"+
		"\u00d4\7\34\2\2\u00d1\u00d3\5\4\3\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3"+
		"\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00db\7\35\2\2\u00d8\u00da\5\34\17\2\u00d9\u00d8"+
		"\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7\t\2\2\u00df\u00e3\7\34"+
		"\2\2\u00e0\u00e2\5\4\3\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e6\u00e7\7\35\2\2\u00e7\33\3\2\2\2\u00e8\u00e9\7\b\2\2\u00e9\u00ea"+
		"\7\32\2\2\u00ea\u00eb\5B\"\2\u00eb\u00ec\7\33\2\2\u00ec\u00f0\7\34\2\2"+
		"\u00ed\u00ef\5\4\3\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f4\7\35\2\2\u00f4\35\3\2\2\2\u00f5\u00f6\7\n\2\2\u00f6\u00f7\7\32"+
		"\2\2\u00f7\u00f8\7\"\2\2\u00f8\u00f9\7\33\2\2\u00f9\u00fd\7\34\2\2\u00fa"+
		"\u00fc\5 \21\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0101\7\r\2\2\u0101\u0105\7\26\2\2\u0102\u0104\5\4\3\2\u0103\u0102\3"+
		"\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7\f\2\2\u0109\u010a\7\36"+
		"\2\2\u010a\u010b\7\35\2\2\u010b\37\3\2\2\2\u010c\u010f\5\"\22\2\u010d"+
		"\u010f\5$\23\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f!\3\2\2\2"+
		"\u0110\u0111\7\13\2\2\u0111\u0112\7\32\2\2\u0112\u0113\7!\2\2\u0113\u0114"+
		"\7\"\2\2\u0114\u0115\7!\2\2\u0115\u0116\7\33\2\2\u0116\u011a\7\26\2\2"+
		"\u0117\u0119\5\4\3\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u011e\7\f\2\2\u011e\u011f\7\36\2\2\u011f#\3\2\2\2\u0120\u0121\7\13\2"+
		"\2\u0121\u0122\7\32\2\2\u0122\u0123\7\"\2\2\u0123\u0124\7\33\2\2\u0124"+
		"\u0128\7\26\2\2\u0125\u0127\5\4\3\2\u0126\u0125\3\2\2\2\u0127\u012a\3"+
		"\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012c\7\f\2\2\u012c\u012d\7\36\2\2\u012d%\3\2\2\2"+
		"\u012e\u012f\7\16\2\2\u012f\u0130\7\32\2\2\u0130\u0131\5B\"\2\u0131\u0132"+
		"\7\33\2\2\u0132\u0136\7\34\2\2\u0133\u0135\5\4\3\2\u0134\u0133\3\2\2\2"+
		"\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7\35\2\2\u013a\'\3\2\2\2\u013b"+
		"\u013c\7\17\2\2\u013c\u013d\7\32\2\2\u013d\u013e\5*\26\2\u013e\u013f\7"+
		"\33\2\2\u013f\u0143\7\34\2\2\u0140\u0142\5\4\3\2\u0141\u0140\3\2\2\2\u0142"+
		"\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7\35\2\2\u0147)\3\2\2\2\u0148\u014d"+
		"\5,\27\2\u0149\u014d\5.\30\2\u014a\u014d\5\60\31\2\u014b\u014d\5\62\32"+
		"\2\u014c\u0148\3\2\2\2\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b"+
		"\3\2\2\2\u014d+\3\2\2\2\u014e\u014f\7$\2\2\u014f\u0150\7\27\2\2\u0150"+
		"\u0151\7$\2\2\u0151-\3\2\2\2\u0152\u0153\7\"\2\2\u0153\u0154\7\27\2\2"+
		"\u0154\u0155\7$\2\2\u0155/\3\2\2\2\u0156\u0157\7$\2\2\u0157\u0158\7\27"+
		"\2\2\u0158\u0159\7\"\2\2\u0159\61\3\2\2\2\u015a\u015b\7\"\2\2\u015b\u015c"+
		"\7\27\2\2\u015c\u015d\7\"\2\2\u015d\63\3\2\2\2\u015e\u0163\5\66\34\2\u015f"+
		"\u0163\58\35\2\u0160\u0163\5:\36\2\u0161\u0163\5<\37\2\u0162\u015e\3\2"+
		"\2\2\u0162\u015f\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163"+
		"\65\3\2\2\2\u0164\u0165\7\20\2\2\u0165\u0166\7\"\2\2\u0166\u0167\7\32"+
		"\2\2\u0167\u0168\7\33\2\2\u0168\u016c\7\34\2\2\u0169\u016b\5\4\3\2\u016a"+
		"\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\7\35\2\2\u0170"+
		"\67\3\2\2\2\u0171\u0172\7\20\2\2\u0172\u0173\7\"\2\2\u0173\u0177\7\32"+
		"\2\2\u0174\u0176\5@!\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a"+
		"\u017b\7\33\2\2\u017b\u017f\7\34\2\2\u017c\u017e\5\4\3\2\u017d\u017c\3"+
		"\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\7\35\2\2\u01839\3\2\2\2"+
		"\u0184\u0185\7\20\2\2\u0185\u0186\7\"\2\2\u0186\u0187\7\32\2\2\u0187\u0188"+
		"\7\33\2\2\u0188\u018c\7\34\2\2\u0189\u018b\5\4\3\2\u018a\u0189\3\2\2\2"+
		"\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f"+
		"\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7 \2\2\u0190\u0191\5> \2\u0191"+
		"\u0192\7\35\2\2\u0192;\3\2\2\2\u0193\u0194\7\20\2\2\u0194\u0195\7\"\2"+
		"\2\u0195\u0199\7\32\2\2\u0196\u0198\5@!\2\u0197\u0196\3\2\2\2\u0198\u019b"+
		"\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019c\u019d\7\33\2\2\u019d\u01a1\7\34\2\2\u019e\u01a0\5"+
		"\4\3\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7 "+
		"\2\2\u01a5\u01a6\5> \2\u01a6\u01a7\7\35\2\2\u01a7=\3\2\2\2\u01a8\u01a9"+
		"\t\2\2\2\u01a9?\3\2\2\2\u01aa\u01ab\7\"\2\2\u01abA\3\2\2\2\u01ac\u01b5"+
		"\5D#\2\u01ad\u01b5\5F$\2\u01ae\u01b5\5H%\2\u01af\u01b5\5J&\2\u01b0\u01b5"+
		"\5L\'\2\u01b1\u01b5\5N(\2\u01b2\u01b5\5P)\2\u01b3\u01b5\5R*\2\u01b4\u01ac"+
		"\3\2\2\2\u01b4\u01ad\3\2\2\2\u01b4\u01ae\3\2\2\2\u01b4\u01af\3\2\2\2\u01b4"+
		"\u01b0\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2"+
		"\2\2\u01b5C\3\2\2\2\u01b6\u01b7\7\"\2\2\u01b7\u01b8\7\25\2\2\u01b8\u01b9"+
		"\7\"\2\2\u01b9E\3\2\2\2\u01ba\u01bb\7\30\2\2\u01bb\u01bc\7\"\2\2\u01bc"+
		"\u01bd\7\25\2\2\u01bd\u01be\7\"\2\2\u01be\u01bf\7\31\2\2\u01bf\u01c0\7"+
		"\21\2\2\u01c0\u01c1\7\30\2\2\u01c1\u01c2\7\"\2\2\u01c2\u01c3\7\25\2\2"+
		"\u01c3\u01c4\7\"\2\2\u01c4\u01c5\7\31\2\2\u01c5G\3\2\2\2\u01c6\u01c7\7"+
		"\30\2\2\u01c7\u01c8\7\"\2\2\u01c8\u01c9\7\25\2\2\u01c9\u01ca\7\"\2\2\u01ca"+
		"\u01cb\7\31\2\2\u01cb\u01cc\7\22\2\2\u01cc\u01cd\7\30\2\2\u01cd\u01ce"+
		"\7\"\2\2\u01ce\u01cf\7\25\2\2\u01cf\u01d0\7\"\2\2\u01d0\u01d1\7\31\2\2"+
		"\u01d1I\3\2\2\2\u01d2\u01d3\7!\2\2\u01d3\u01d4\7\"\2\2\u01d4\u01d5\7!"+
		"\2\2\u01d5\u01d6\7\25\2\2\u01d6\u01d7\7!\2\2\u01d7\u01d8\7\"\2\2\u01d8"+
		"\u01d9\7!\2\2\u01d9K\3\2\2\2\u01da\u01db\7!\2\2\u01db\u01dc\7\"\2\2\u01dc"+
		"\u01dd\7!\2\2\u01dd\u01de\7\25\2\2\u01de\u01df\7\"\2\2\u01dfM\3\2\2\2"+
		"\u01e0\u01e1\7\"\2\2\u01e1\u01e2\7\25\2\2\u01e2\u01e3\7!\2\2\u01e3\u01e4"+
		"\7\"\2\2\u01e4\u01e5\7!\2\2\u01e5O\3\2\2\2\u01e6\u01e7\7\"\2\2\u01e7\u01e8"+
		"\7\25\2\2\u01e8\u01e9\7$\2\2\u01e9Q\3\2\2\2\u01ea\u01eb\7$\2\2\u01eb\u01ec"+
		"\7\25\2\2\u01ec\u01ed\7\"\2\2\u01edS\3\2\2\2\33Zn\u00b1\u00be\u00c7\u00d4"+
		"\u00db\u00e3\u00f0\u00fd\u0105\u010e\u011a\u0128\u0136\u0143\u014c\u0162"+
		"\u016c\u0177\u017f\u018c\u0199\u01a1\u01b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}