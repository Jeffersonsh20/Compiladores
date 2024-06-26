// Generated from com/compiladores/practica1/interprete2024/JPellate.g4 by ANTLR 4.5.1
package com.compiladores.practica1.interprete2024;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JPellateLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"P_GRUPO", "P_VAR", "P_S", "P_E", "P_IF", "P_ELSE_IF", "P_ELSE", "P_SW", 
		"P_OTRO", "P_END", "P_DEF", "P_WHILE", "P_FOR", "P_FC", "P_AND", "P_OR", 
		"P_S_OPERACION", "P_S_NEGACION", "P_S_DE_COMPA", "S_ASI", "S_DO", "P_A", 
		"P_C", "P_COR_A", "P_COR_C", "P_LL_A", "P_LL_C", "P_PUN_P_COMA", "P_COMA", 
		"P_REGRESAR", "P_COMILLAS", "P_IDENTIFICADORES", "P_TEXTO", "P_NUMERO", 
		"WS"
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


	public JPellateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JPellate.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00eb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ae\n\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\7!\u00cb\n!\f!\16!\u00ce\13"+
		"!\3\"\6\"\u00d1\n\"\r\"\16\"\u00d2\3#\5#\u00d6\n#\3#\6#\u00d9\n#\r#\16"+
		"#\u00da\3#\3#\6#\u00df\n#\r#\16#\u00e0\5#\u00e3\n#\3$\6$\u00e6\n$\r$\16"+
		"$\u00e7\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\t\6\2\'\',-//\61\61\4\2>>@@\4\2"+
		"C\\c|\5\2\62;C\\c|\3\2//\3\2\62;\5\2\13\f\17\17\"\"\u00f5\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2"+
		"\5O\3\2\2\2\7X\3\2\2\2\t_\3\2\2\2\13g\3\2\2\2\rj\3\2\2\2\17r\3\2\2\2\21"+
		"w\3\2\2\2\23z\3\2\2\2\25\177\3\2\2\2\27\u0083\3\2\2\2\31\u0087\3\2\2\2"+
		"\33\u008d\3\2\2\2\35\u0091\3\2\2\2\37\u0099\3\2\2\2!\u009d\3\2\2\2#\u00a0"+
		"\3\2\2\2%\u00a2\3\2\2\2\'\u00ad\3\2\2\2)\u00af\3\2\2\2+\u00b1\3\2\2\2"+
		"-\u00b3\3\2\2\2/\u00b5\3\2\2\2\61\u00b7\3\2\2\2\63\u00b9\3\2\2\2\65\u00bb"+
		"\3\2\2\2\67\u00bd\3\2\2\29\u00bf\3\2\2\2;\u00c1\3\2\2\2=\u00c3\3\2\2\2"+
		"?\u00c6\3\2\2\2A\u00c8\3\2\2\2C\u00d0\3\2\2\2E\u00d5\3\2\2\2G\u00e5\3"+
		"\2\2\2IJ\7I\2\2JK\7t\2\2KL\7w\2\2LM\7r\2\2MN\7q\2\2N\4\3\2\2\2OP\7X\2"+
		"\2PQ\7c\2\2QR\7t\2\2RS\7k\2\2ST\7c\2\2TU\7d\2\2UV\7n\2\2VW\7g\2\2W\6\3"+
		"\2\2\2XY\7U\2\2YZ\7c\2\2Z[\7n\2\2[\\\7k\2\2\\]\7f\2\2]^\7c\2\2^\b\3\2"+
		"\2\2_`\7G\2\2`a\7p\2\2ab\7v\2\2bc\7t\2\2cd\7c\2\2de\7f\2\2ef\7c\2\2f\n"+
		"\3\2\2\2gh\7k\2\2hi\7h\2\2i\f\3\2\2\2jk\7g\2\2kl\7n\2\2lm\7u\2\2mn\7g"+
		"\2\2no\7\"\2\2op\7k\2\2pq\7h\2\2q\16\3\2\2\2rs\7g\2\2st\7n\2\2tu\7u\2"+
		"\2uv\7g\2\2v\20\3\2\2\2wx\7U\2\2xy\7y\2\2y\22\3\2\2\2z{\7Q\2\2{|\7v\2"+
		"\2|}\7t\2\2}~\7q\2\2~\24\3\2\2\2\177\u0080\7g\2\2\u0080\u0081\7p\2\2\u0081"+
		"\u0082\7f\2\2\u0082\26\3\2\2\2\u0083\u0084\7F\2\2\u0084\u0085\7g\2\2\u0085"+
		"\u0086\7h\2\2\u0086\30\3\2\2\2\u0087\u0088\7Y\2\2\u0088\u0089\7j\2\2\u0089"+
		"\u008a\7k\2\2\u008a\u008b\7n\2\2\u008b\u008c\7g\2\2\u008c\32\3\2\2\2\u008d"+
		"\u008e\7H\2\2\u008e\u008f\7q\2\2\u008f\u0090\7t\2\2\u0090\34\3\2\2\2\u0091"+
		"\u0092\7H\2\2\u0092\u0093\7w\2\2\u0093\u0094\7p\2\2\u0094\u0095\7e\2\2"+
		"\u0095\u0096\7k\2\2\u0096\u0097\7q\2\2\u0097\u0098\7p\2\2\u0098\36\3\2"+
		"\2\2\u0099\u009a\7C\2\2\u009a\u009b\7P\2\2\u009b\u009c\7F\2\2\u009c \3"+
		"\2\2\2\u009d\u009e\7Q\2\2\u009e\u009f\7T\2\2\u009f\"\3\2\2\2\u00a0\u00a1"+
		"\t\2\2\2\u00a1$\3\2\2\2\u00a2\u00a3\7#\2\2\u00a3&\3\2\2\2\u00a4\u00a5"+
		"\7>\2\2\u00a5\u00ae\7?\2\2\u00a6\u00a7\7@\2\2\u00a7\u00ae\7?\2\2\u00a8"+
		"\u00ae\t\3\2\2\u00a9\u00aa\7?\2\2\u00aa\u00ae\7?\2\2\u00ab\u00ac\7#\2"+
		"\2\u00ac\u00ae\7?\2\2\u00ad\u00a4\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ad\u00a8"+
		"\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae(\3\2\2\2\u00af"+
		"\u00b0\7?\2\2\u00b0*\3\2\2\2\u00b1\u00b2\7&\2\2\u00b2,\3\2\2\2\u00b3\u00b4"+
		"\7*\2\2\u00b4.\3\2\2\2\u00b5\u00b6\7+\2\2\u00b6\60\3\2\2\2\u00b7\u00b8"+
		"\7]\2\2\u00b8\62\3\2\2\2\u00b9\u00ba\7_\2\2\u00ba\64\3\2\2\2\u00bb\u00bc"+
		"\7}\2\2\u00bc\66\3\2\2\2\u00bd\u00be\7\177\2\2\u00be8\3\2\2\2\u00bf\u00c0"+
		"\7=\2\2\u00c0:\3\2\2\2\u00c1\u00c2\7.\2\2\u00c2<\3\2\2\2\u00c3\u00c4\7"+
		"/\2\2\u00c4\u00c5\7@\2\2\u00c5>\3\2\2\2\u00c6\u00c7\7$\2\2\u00c7@\3\2"+
		"\2\2\u00c8\u00cc\t\4\2\2\u00c9\u00cb\t\5\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cdB\3\2\2\2"+
		"\u00ce\u00cc\3\2\2\2\u00cf\u00d1\t\4\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3D\3\2\2\2\u00d4"+
		"\u00d6\t\6\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2"+
		"\2\2\u00d7\u00d9\t\7\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e2\3\2\2\2\u00dc\u00de\7\60"+
		"\2\2\u00dd\u00df\t\7\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00dc\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3F\3\2\2\2\u00e4\u00e6\t\b\2\2\u00e5\u00e4"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ea\b$\2\2\u00eaH\3\2\2\2\13\2\u00ad\u00cc\u00d2"+
		"\u00d5\u00da\u00e0\u00e2\u00e7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}