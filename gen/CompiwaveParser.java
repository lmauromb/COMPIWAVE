// Generated from /home/luism/PycharmProjects/COMPIWAVE/Compiwave.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CompiwaveParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, PUSH=21, POP=22, ASSIGN=23, ADD=24, MINUS=25, 
		MULT=26, DIV=27, EQUALS=28, NOTEQUAL=29, LT=30, GT=31, LEQUAL=32, GEQUAL=33, 
		AND=34, OR=35, T_FLOAT=36, T_INT=37, T_BOOL=38, T_STRING=39, ID=40, BOOLEAN=41, 
		INT=42, FLOAT=43, STRING=44, WS=45, SL_COMMENT=46;
	public static final int
		RULE_compiwave = 0, RULE_var_declaration = 1, RULE_list_declaration = 2, 
		RULE_vector_declaration = 3, RULE_matrix_declaration = 4, RULE_function_declaration = 5, 
		RULE_function_params = 6, RULE_function_param = 7, RULE_cwtype = 8, RULE_vector_assignment = 9, 
		RULE_matrix_assignment = 10, RULE_list_push = 11, RULE_list_pop = 12, 
		RULE_var_assignment = 13, RULE_block = 14, RULE_main_function = 15, RULE_statement = 16, 
		RULE_function_statement = 17, RULE_arguments = 18, RULE_if_statement = 19, 
		RULE_else_statement = 20, RULE_while_statement = 21, RULE_do_while_statement = 22, 
		RULE_if_expr = 23, RULE_do_if_expr = 24, RULE_return_statement = 25, RULE_print_statement = 26, 
		RULE_expr = 27;
	public static final String[] ruleNames = {
		"compiwave", "var_declaration", "list_declaration", "vector_declaration", 
		"matrix_declaration", "function_declaration", "function_params", "function_param", 
		"cwtype", "vector_assignment", "matrix_assignment", "list_push", "list_pop", 
		"var_assignment", "block", "main_function", "statement", "function_statement", 
		"arguments", "if_statement", "else_statement", "while_statement", "do_while_statement", 
		"if_expr", "do_if_expr", "return_statement", "print_statement", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "';'", "'list'", "'('", "')'", "'['", "']'", 
		"'function'", "'void'", "','", "'{'", "'}'", "'main'", "'if'", "'else'", 
		"'while'", "'do'", "'return'", "'print'", "'<<'", "'>>'", "'='", "'+'", 
		"'-'", "'*'", "'/'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'&&'", 
		"'||'", "'float'", "'int'", "'boolean'", "'string'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "PUSH", "POP", "ASSIGN", 
		"ADD", "MINUS", "MULT", "DIV", "EQUALS", "NOTEQUAL", "LT", "GT", "LEQUAL", 
		"GEQUAL", "AND", "OR", "T_FLOAT", "T_INT", "T_BOOL", "T_STRING", "ID", 
		"BOOLEAN", "INT", "FLOAT", "STRING", "WS", "SL_COMMENT"
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
	public String getGrammarFileName() { return "Compiwave.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CompiwaveParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompiwaveContext extends ParserRuleContext {
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public List<Var_declarationContext> var_declaration() {
			return getRuleContexts(Var_declarationContext.class);
		}
		public Var_declarationContext var_declaration(int i) {
			return getRuleContext(Var_declarationContext.class,i);
		}
		public List<List_declarationContext> list_declaration() {
			return getRuleContexts(List_declarationContext.class);
		}
		public List_declarationContext list_declaration(int i) {
			return getRuleContext(List_declarationContext.class,i);
		}
		public List<Vector_declarationContext> vector_declaration() {
			return getRuleContexts(Vector_declarationContext.class);
		}
		public Vector_declarationContext vector_declaration(int i) {
			return getRuleContext(Vector_declarationContext.class,i);
		}
		public List<Matrix_declarationContext> matrix_declaration() {
			return getRuleContexts(Matrix_declarationContext.class);
		}
		public Matrix_declarationContext matrix_declaration(int i) {
			return getRuleContext(Matrix_declarationContext.class,i);
		}
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public CompiwaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compiwave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterCompiwave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitCompiwave(this);
		}
	}

	public final CompiwaveContext compiwave() throws RecognitionException {
		CompiwaveContext _localctx = new CompiwaveContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compiwave);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING))) != 0)) {
				{
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(57);
					var_declaration();
					}
					break;
				case 2:
					{
					setState(58);
					list_declaration();
					}
					break;
				case 3:
					{
					setState(59);
					vector_declaration();
					}
					break;
				case 4:
					{
					setState(60);
					matrix_declaration();
					}
					break;
				case 5:
					{
					setState(61);
					function_declaration();
					}
					break;
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			main_function();
			setState(68);
			match(T__1);
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

	public static class Var_declarationContext extends ParserRuleContext {
		public CwtypeContext cwtype() {
			return getRuleContext(CwtypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CompiwaveParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CompiwaveParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterVar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitVar_declaration(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			cwtype();
			setState(71);
			match(ID);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(72);
				match(ASSIGN);
				setState(73);
				expr(0);
				}
			}

			setState(76);
			match(T__2);
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

	public static class List_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompiwaveParser.ID, 0); }
		public CwtypeContext cwtype() {
			return getRuleContext(CwtypeContext.class,0);
		}
		public List_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterList_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitList_declaration(this);
		}
	}

	public final List_declarationContext list_declaration() throws RecognitionException {
		List_declarationContext _localctx = new List_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__3);
			setState(79);
			match(ID);
			setState(80);
			match(T__4);
			setState(81);
			cwtype();
			setState(82);
			match(T__5);
			setState(83);
			match(T__2);
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

	public static class Vector_declarationContext extends ParserRuleContext {
		public CwtypeContext cwtype() {
			return getRuleContext(CwtypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CompiwaveParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Vector_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterVector_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitVector_declaration(this);
		}
	}

	public final Vector_declarationContext vector_declaration() throws RecognitionException {
		Vector_declarationContext _localctx = new Vector_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vector_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			cwtype();
			setState(86);
			match(ID);
			setState(87);
			match(T__6);
			setState(88);
			expr(0);
			setState(89);
			match(T__7);
			setState(90);
			match(T__2);
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

	public static class Matrix_declarationContext extends ParserRuleContext {
		public CwtypeContext cwtype() {
			return getRuleContext(CwtypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CompiwaveParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Matrix_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterMatrix_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitMatrix_declaration(this);
		}
	}

	public final Matrix_declarationContext matrix_declaration() throws RecognitionException {
		Matrix_declarationContext _localctx = new Matrix_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matrix_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			cwtype();
			setState(93);
			match(ID);
			setState(94);
			match(T__6);
			setState(95);
			expr(0);
			setState(96);
			match(T__7);
			setState(97);
			match(T__6);
			setState(98);
			expr(0);
			setState(99);
			match(T__7);
			setState(100);
			match(T__2);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompiwaveParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CwtypeContext cwtype() {
			return getRuleContext(CwtypeContext.class,0);
		}
		public Function_paramsContext function_params() {
			return getRuleContext(Function_paramsContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__8);
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FLOAT:
			case T_INT:
			case T_BOOL:
			case T_STRING:
				{
				setState(103);
				cwtype();
				}
				break;
			case T__9:
				{
				setState(104);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(107);
			match(ID);
			setState(108);
			match(T__4);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING))) != 0)) {
				{
				setState(109);
				function_params();
				}
			}

			setState(112);
			match(T__5);
			setState(113);
			block();
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

	public static class Function_paramsContext extends ParserRuleContext {
		public Function_paramContext function_param;
		public List<Function_paramContext> numberOfParams = new ArrayList<Function_paramContext>();
		public List<Function_paramContext> function_param() {
			return getRuleContexts(Function_paramContext.class);
		}
		public Function_paramContext function_param(int i) {
			return getRuleContext(Function_paramContext.class,i);
		}
		public Function_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterFunction_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitFunction_params(this);
		}
	}

	public final Function_paramsContext function_params() throws RecognitionException {
		Function_paramsContext _localctx = new Function_paramsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((Function_paramsContext)_localctx).function_param = function_param();
			((Function_paramsContext)_localctx).numberOfParams.add(((Function_paramsContext)_localctx).function_param);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(116);
				match(T__10);
				setState(117);
				((Function_paramsContext)_localctx).function_param = function_param();
				((Function_paramsContext)_localctx).numberOfParams.add(((Function_paramsContext)_localctx).function_param);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Function_paramContext extends ParserRuleContext {
		public CwtypeContext cwtype() {
			return getRuleContext(CwtypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CompiwaveParser.ID, 0); }
		public Function_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterFunction_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitFunction_param(this);
		}
	}

	public final Function_paramContext function_param() throws RecognitionException {
		Function_paramContext _localctx = new Function_paramContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			cwtype();
			setState(124);
			match(ID);
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

	public static class CwtypeContext extends ParserRuleContext {
		public TerminalNode T_FLOAT() { return getToken(CompiwaveParser.T_FLOAT, 0); }
		public TerminalNode T_INT() { return getToken(CompiwaveParser.T_INT, 0); }
		public TerminalNode T_BOOL() { return getToken(CompiwaveParser.T_BOOL, 0); }
		public TerminalNode T_STRING() { return getToken(CompiwaveParser.T_STRING, 0); }
		public CwtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cwtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterCwtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitCwtype(this);
		}
	}

	public final CwtypeContext cwtype() throws RecognitionException {
		CwtypeContext _localctx = new CwtypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cwtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Vector_assignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompiwaveParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(CompiwaveParser.ASSIGN, 0); }
		public Vector_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterVector_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitVector_assignment(this);
		}
	}

	public final Vector_assignmentContext vector_assignment() throws RecognitionException {
		Vector_assignmentContext _localctx = new Vector_assignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vector_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(ID);
			setState(129);
			match(T__6);
			setState(130);
			expr(0);
			setState(131);
			match(T__7);
			setState(132);
			match(ASSIGN);
			setState(133);
			expr(0);
			setState(134);
			match(T__2);
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

	public static class Matrix_assignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompiwaveParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(CompiwaveParser.ASSIGN, 0); }
		public Matrix_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterMatrix_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitMatrix_assignment(this);
		}
	}

	public final Matrix_assignmentContext matrix_assignment() throws RecognitionException {
		Matrix_assignmentContext _localctx = new Matrix_assignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_matrix_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ID);
			setState(137);
			match(T__6);
			setState(138);
			expr(0);
			setState(139);
			match(T__7);
			setState(140);
			match(T__6);
			setState(141);
			expr(0);
			setState(142);
			match(T__7);
			setState(143);
			match(ASSIGN);
			setState(144);
			expr(0);
			setState(145);
			match(T__2);
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

	public static class List_pushContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompiwaveParser.ID, 0); }
		public TerminalNode PUSH() { return getToken(CompiwaveParser.PUSH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List_pushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterList_push(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitList_push(this);
		}
	}

	public final List_pushContext list_push() throws RecognitionException {
		List_pushContext _localctx = new List_pushContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_list_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(ID);
			setState(148);
			match(PUSH);
			setState(149);
			expr(0);
			setState(150);
			match(T__2);
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

	public static class List_popContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompiwaveParser.ID, 0); }
		public TerminalNode POP() { return getToken(CompiwaveParser.POP, 0); }
		public List_popContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_pop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterList_pop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitList_pop(this);
		}
	}

	public final List_popContext list_pop() throws RecognitionException {
		List_popContext _localctx = new List_popContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_list_pop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ID);
			setState(153);
			match(POP);
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

	public static class Var_assignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CompiwaveParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CompiwaveParser.ID, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CompiwaveParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CompiwaveParser.ASSIGN, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterVar_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitVar_assignment(this);
		}
	}

	public final Var_assignmentContext var_assignment() throws RecognitionException {
		Var_assignmentContext _localctx = new Var_assignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ID);
			setState(156);
			match(ASSIGN);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					match(ID);
					setState(158);
					match(ASSIGN);
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(164);
			expr(0);
			setState(165);
			match(T__2);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__11);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(168);
				statement();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(T__12);
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

	public static class Main_functionContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterMain_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitMain_function(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__13);
			setState(177);
			block();
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public List_declarationContext list_declaration() {
			return getRuleContext(List_declarationContext.class,0);
		}
		public Vector_declarationContext vector_declaration() {
			return getRuleContext(Vector_declarationContext.class,0);
		}
		public Matrix_declarationContext matrix_declaration() {
			return getRuleContext(Matrix_declarationContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public Var_assignmentContext var_assignment() {
			return getRuleContext(Var_assignmentContext.class,0);
		}
		public Vector_assignmentContext vector_assignment() {
			return getRuleContext(Vector_assignmentContext.class,0);
		}
		public Matrix_assignmentContext matrix_assignment() {
			return getRuleContext(Matrix_assignmentContext.class,0);
		}
		public List_pushContext list_push() {
			return getRuleContext(List_pushContext.class,0);
		}
		public List_popContext list_pop() {
			return getRuleContext(List_popContext.class,0);
		}
		public Function_statementContext function_statement() {
			return getRuleContext(Function_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				var_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				list_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				vector_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				matrix_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				if_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				while_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				do_while_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(187);
				return_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(188);
				print_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(189);
				var_assignment();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(190);
				vector_assignment();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(191);
				matrix_assignment();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(192);
				list_push();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(193);
				list_pop();
				setState(194);
				match(T__2);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(196);
				function_statement();
				setState(197);
				match(T__2);
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

	public static class Function_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompiwaveParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Function_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterFunction_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitFunction_statement(this);
		}
	}

	public final Function_statementContext function_statement() throws RecognitionException {
		Function_statementContext _localctx = new Function_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ID);
			setState(202);
			match(T__4);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ID) | (1L << BOOLEAN) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(203);
				arguments();
				}
			}

			setState(206);
			match(T__5);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExprContext expr;
		public List<ExprContext> numberOfArguments = new ArrayList<ExprContext>();
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			((ArgumentsContext)_localctx).expr = expr(0);
			((ArgumentsContext)_localctx).numberOfArguments.add(((ArgumentsContext)_localctx).expr);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(209);
				match(T__10);
				setState(210);
				((ArgumentsContext)_localctx).expr = expr(0);
				((ArgumentsContext)_localctx).numberOfArguments.add(((ArgumentsContext)_localctx).expr);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class If_statementContext extends ParserRuleContext {
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__14);
			setState(217);
			match(T__4);
			setState(218);
			if_expr();
			setState(219);
			match(T__5);
			setState(220);
			block();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(221);
				else_statement();
				}
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

	public static class Else_statementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitElse_statement(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__15);
			setState(225);
			block();
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

	public static class While_statementContext extends ParserRuleContext {
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__16);
			setState(228);
			match(T__4);
			setState(229);
			if_expr();
			setState(230);
			match(T__5);
			setState(231);
			block();
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

	public static class Do_while_statementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Do_if_exprContext do_if_expr() {
			return getRuleContext(Do_if_exprContext.class,0);
		}
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitDo_while_statement(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__17);
			setState(234);
			block();
			setState(235);
			match(T__16);
			setState(236);
			match(T__4);
			setState(237);
			do_if_expr();
			setState(238);
			match(T__5);
			setState(239);
			match(T__2);
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

	public static class If_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public If_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterIf_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitIf_expr(this);
		}
	}

	public final If_exprContext if_expr() throws RecognitionException {
		If_exprContext _localctx = new If_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_if_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			expr(0);
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

	public static class Do_if_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Do_if_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_if_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterDo_if_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitDo_if_expr(this);
		}
	}

	public final Do_if_exprContext do_if_expr() throws RecognitionException {
		Do_if_exprContext _localctx = new Do_if_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_do_if_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			expr(0);
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

	public static class Return_statementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__18);
			setState(246);
			expr(0);
			setState(247);
			match(T__2);
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

	public static class Print_statementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitPrint_statement(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__19);
			setState(250);
			match(T__4);
			setState(251);
			expr(0);
			setState(252);
			match(T__5);
			setState(253);
			match(T__2);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MatrixIndexContext extends ExprContext {
		public TerminalNode ID() { return getToken(CompiwaveParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MatrixIndexContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterMatrixIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitMatrixIndex(this);
		}
	}
	public static class ListPopContext extends ExprContext {
		public List_popContext list_pop() {
			return getRuleContext(List_popContext.class,0);
		}
		public ListPopContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterListPop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitListPop(this);
		}
	}
	public static class StringConstContext extends ExprContext {
		public TerminalNode STRING() { return getToken(CompiwaveParser.STRING, 0); }
		public StringConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterStringConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitStringConst(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CompiwaveParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(CompiwaveParser.MINUS, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitAddSub(this);
		}
	}
	public static class EqualityNotContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(CompiwaveParser.EQUALS, 0); }
		public TerminalNode NOTEQUAL() { return getToken(CompiwaveParser.NOTEQUAL, 0); }
		public EqualityNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterEqualityNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitEqualityNot(this);
		}
	}
	public static class IntConstContext extends ExprContext {
		public TerminalNode INT() { return getToken(CompiwaveParser.INT, 0); }
		public IntConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterIntConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitIntConst(this);
		}
	}
	public static class VectorIndexContext extends ExprContext {
		public TerminalNode ID() { return getToken(CompiwaveParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VectorIndexContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterVectorIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitVectorIndex(this);
		}
	}
	public static class FloatConstContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(CompiwaveParser.FLOAT, 0); }
		public FloatConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterFloatConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitFloatConst(this);
		}
	}
	public static class MultDivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(CompiwaveParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CompiwaveParser.DIV, 0); }
		public MultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitMultDiv(this);
		}
	}
	public static class VarReferenceContext extends ExprContext {
		public TerminalNode ID() { return getToken(CompiwaveParser.ID, 0); }
		public VarReferenceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterVarReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitVarReference(this);
		}
	}
	public static class BoolConstContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(CompiwaveParser.BOOLEAN, 0); }
		public BoolConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterBoolConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitBoolConst(this);
		}
	}
	public static class LTGTContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(CompiwaveParser.LT, 0); }
		public TerminalNode GT() { return getToken(CompiwaveParser.GT, 0); }
		public TerminalNode LEQUAL() { return getToken(CompiwaveParser.LEQUAL, 0); }
		public TerminalNode GEQUAL() { return getToken(CompiwaveParser.GEQUAL, 0); }
		public LTGTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterLTGT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitLTGT(this);
		}
	}
	public static class FunctionCallContext extends ExprContext {
		public Function_statementContext function_statement() {
			return getRuleContext(Function_statementContext.class,0);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitFunctionCall(this);
		}
	}
	public static class AndOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(CompiwaveParser.AND, 0); }
		public TerminalNode OR() { return getToken(CompiwaveParser.OR, 0); }
		public AndOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitAndOr(this);
		}
	}
	public static class ParenContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitParen(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(256);
				function_statement();
				}
				break;
			case 2:
				{
				_localctx = new VectorIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				match(ID);
				setState(258);
				match(T__6);
				setState(259);
				expr(0);
				setState(260);
				match(T__7);
				}
				break;
			case 3:
				{
				_localctx = new MatrixIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				match(ID);
				setState(263);
				match(T__6);
				setState(264);
				expr(0);
				setState(265);
				match(T__7);
				setState(266);
				match(T__6);
				setState(267);
				expr(0);
				setState(268);
				match(T__7);
				}
				break;
			case 4:
				{
				_localctx = new ListPopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				list_pop();
				}
				break;
			case 5:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new IntConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				match(INT);
				}
				break;
			case 7:
				{
				_localctx = new FloatConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				match(FLOAT);
				}
				break;
			case 8:
				{
				_localctx = new BoolConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				match(BOOLEAN);
				}
				break;
			case 9:
				{
				_localctx = new StringConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275);
				match(STRING);
				}
				break;
			case 10:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276);
				match(T__4);
				setState(277);
				expr(0);
				setState(278);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(297);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(282);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(283);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(284);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(285);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(286);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(287);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new LTGTContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(288);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(289);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LEQUAL) | (1L << GEQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(290);
						expr(4);
						}
						break;
					case 4:
						{
						_localctx = new EqualityNotContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(291);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(292);
						_la = _input.LA(1);
						if ( !(_la==EQUALS || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(293);
						expr(3);
						}
						break;
					case 5:
						{
						_localctx = new AndOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(294);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(295);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(296);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u0131\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2\7\2A"+
		"\n\2\f\2\16\2D\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3M\n\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7l\n\7\3\7\3\7\3\7\5\7q\n\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00a2"+
		"\n\17\f\17\16\17\u00a5\13\17\3\17\3\17\3\17\3\20\3\20\7\20\u00ac\n\20"+
		"\f\20\16\20\u00af\13\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u00ca\n\22\3\23\3\23\3\23\5\23\u00cf\n\23\3\23\3\23\3\24"+
		"\3\24\3\24\7\24\u00d6\n\24\f\24\16\24\u00d9\13\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u00e1\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u011b\n\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u012c\n\35\f\35\16"+
		"\35\u012f\13\35\3\35\2\38\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668\2\b\3\2&)\3\2\34\35\3\2\32\33\3\2 #\3\2\36\37\3\2"+
		"$%\u013f\2:\3\2\2\2\4H\3\2\2\2\6P\3\2\2\2\bW\3\2\2\2\n^\3\2\2\2\fh\3\2"+
		"\2\2\16u\3\2\2\2\20}\3\2\2\2\22\u0080\3\2\2\2\24\u0082\3\2\2\2\26\u008a"+
		"\3\2\2\2\30\u0095\3\2\2\2\32\u009a\3\2\2\2\34\u009d\3\2\2\2\36\u00a9\3"+
		"\2\2\2 \u00b2\3\2\2\2\"\u00c9\3\2\2\2$\u00cb\3\2\2\2&\u00d2\3\2\2\2(\u00da"+
		"\3\2\2\2*\u00e2\3\2\2\2,\u00e5\3\2\2\2.\u00eb\3\2\2\2\60\u00f3\3\2\2\2"+
		"\62\u00f5\3\2\2\2\64\u00f7\3\2\2\2\66\u00fb\3\2\2\28\u011a\3\2\2\2:B\7"+
		"\3\2\2;A\5\4\3\2<A\5\6\4\2=A\5\b\5\2>A\5\n\6\2?A\5\f\7\2@;\3\2\2\2@<\3"+
		"\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3"+
		"\2\2\2DB\3\2\2\2EF\5 \21\2FG\7\4\2\2G\3\3\2\2\2HI\5\22\n\2IL\7*\2\2JK"+
		"\7\31\2\2KM\58\35\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\5\2\2O\5\3\2\2\2"+
		"PQ\7\6\2\2QR\7*\2\2RS\7\7\2\2ST\5\22\n\2TU\7\b\2\2UV\7\5\2\2V\7\3\2\2"+
		"\2WX\5\22\n\2XY\7*\2\2YZ\7\t\2\2Z[\58\35\2[\\\7\n\2\2\\]\7\5\2\2]\t\3"+
		"\2\2\2^_\5\22\n\2_`\7*\2\2`a\7\t\2\2ab\58\35\2bc\7\n\2\2cd\7\t\2\2de\5"+
		"8\35\2ef\7\n\2\2fg\7\5\2\2g\13\3\2\2\2hk\7\13\2\2il\5\22\n\2jl\7\f\2\2"+
		"ki\3\2\2\2kj\3\2\2\2lm\3\2\2\2mn\7*\2\2np\7\7\2\2oq\5\16\b\2po\3\2\2\2"+
		"pq\3\2\2\2qr\3\2\2\2rs\7\b\2\2st\5\36\20\2t\r\3\2\2\2uz\5\20\t\2vw\7\r"+
		"\2\2wy\5\20\t\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\17\3\2\2\2|z"+
		"\3\2\2\2}~\5\22\n\2~\177\7*\2\2\177\21\3\2\2\2\u0080\u0081\t\2\2\2\u0081"+
		"\23\3\2\2\2\u0082\u0083\7*\2\2\u0083\u0084\7\t\2\2\u0084\u0085\58\35\2"+
		"\u0085\u0086\7\n\2\2\u0086\u0087\7\31\2\2\u0087\u0088\58\35\2\u0088\u0089"+
		"\7\5\2\2\u0089\25\3\2\2\2\u008a\u008b\7*\2\2\u008b\u008c\7\t\2\2\u008c"+
		"\u008d\58\35\2\u008d\u008e\7\n\2\2\u008e\u008f\7\t\2\2\u008f\u0090\58"+
		"\35\2\u0090\u0091\7\n\2\2\u0091\u0092\7\31\2\2\u0092\u0093\58\35\2\u0093"+
		"\u0094\7\5\2\2\u0094\27\3\2\2\2\u0095\u0096\7*\2\2\u0096\u0097\7\27\2"+
		"\2\u0097\u0098\58\35\2\u0098\u0099\7\5\2\2\u0099\31\3\2\2\2\u009a\u009b"+
		"\7*\2\2\u009b\u009c\7\30\2\2\u009c\33\3\2\2\2\u009d\u009e\7*\2\2\u009e"+
		"\u00a3\7\31\2\2\u009f\u00a0\7*\2\2\u00a0\u00a2\7\31\2\2\u00a1\u009f\3"+
		"\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\58\35\2\u00a7\u00a8\7\5"+
		"\2\2\u00a8\35\3\2\2\2\u00a9\u00ad\7\16\2\2\u00aa\u00ac\5\"\22\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\17\2\2\u00b1"+
		"\37\3\2\2\2\u00b2\u00b3\7\20\2\2\u00b3\u00b4\5\36\20\2\u00b4!\3\2\2\2"+
		"\u00b5\u00ca\5\36\20\2\u00b6\u00ca\5\4\3\2\u00b7\u00ca\5\6\4\2\u00b8\u00ca"+
		"\5\b\5\2\u00b9\u00ca\5\n\6\2\u00ba\u00ca\5(\25\2\u00bb\u00ca\5,\27\2\u00bc"+
		"\u00ca\5.\30\2\u00bd\u00ca\5\64\33\2\u00be\u00ca\5\66\34\2\u00bf\u00ca"+
		"\5\34\17\2\u00c0\u00ca\5\24\13\2\u00c1\u00ca\5\26\f\2\u00c2\u00ca\5\30"+
		"\r\2\u00c3\u00c4\5\32\16\2\u00c4\u00c5\7\5\2\2\u00c5\u00ca\3\2\2\2\u00c6"+
		"\u00c7\5$\23\2\u00c7\u00c8\7\5\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00b5\3\2"+
		"\2\2\u00c9\u00b6\3\2\2\2\u00c9\u00b7\3\2\2\2\u00c9\u00b8\3\2\2\2\u00c9"+
		"\u00b9\3\2\2\2\u00c9\u00ba\3\2\2\2\u00c9\u00bb\3\2\2\2\u00c9\u00bc\3\2"+
		"\2\2\u00c9\u00bd\3\2\2\2\u00c9\u00be\3\2\2\2\u00c9\u00bf\3\2\2\2\u00c9"+
		"\u00c0\3\2\2\2\u00c9\u00c1\3\2\2\2\u00c9\u00c2\3\2\2\2\u00c9\u00c3\3\2"+
		"\2\2\u00c9\u00c6\3\2\2\2\u00ca#\3\2\2\2\u00cb\u00cc\7*\2\2\u00cc\u00ce"+
		"\7\7\2\2\u00cd\u00cf\5&\24\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\7\b\2\2\u00d1%\3\2\2\2\u00d2\u00d7\58\35\2"+
		"\u00d3\u00d4\7\r\2\2\u00d4\u00d6\58\35\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\'\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00db\7\21\2\2\u00db\u00dc\7\7\2\2\u00dc\u00dd\5"+
		"\60\31\2\u00dd\u00de\7\b\2\2\u00de\u00e0\5\36\20\2\u00df\u00e1\5*\26\2"+
		"\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1)\3\2\2\2\u00e2\u00e3\7"+
		"\22\2\2\u00e3\u00e4\5\36\20\2\u00e4+\3\2\2\2\u00e5\u00e6\7\23\2\2\u00e6"+
		"\u00e7\7\7\2\2\u00e7\u00e8\5\60\31\2\u00e8\u00e9\7\b\2\2\u00e9\u00ea\5"+
		"\36\20\2\u00ea-\3\2\2\2\u00eb\u00ec\7\24\2\2\u00ec\u00ed\5\36\20\2\u00ed"+
		"\u00ee\7\23\2\2\u00ee\u00ef\7\7\2\2\u00ef\u00f0\5\62\32\2\u00f0\u00f1"+
		"\7\b\2\2\u00f1\u00f2\7\5\2\2\u00f2/\3\2\2\2\u00f3\u00f4\58\35\2\u00f4"+
		"\61\3\2\2\2\u00f5\u00f6\58\35\2\u00f6\63\3\2\2\2\u00f7\u00f8\7\25\2\2"+
		"\u00f8\u00f9\58\35\2\u00f9\u00fa\7\5\2\2\u00fa\65\3\2\2\2\u00fb\u00fc"+
		"\7\26\2\2\u00fc\u00fd\7\7\2\2\u00fd\u00fe\58\35\2\u00fe\u00ff\7\b\2\2"+
		"\u00ff\u0100\7\5\2\2\u0100\67\3\2\2\2\u0101\u0102\b\35\1\2\u0102\u011b"+
		"\5$\23\2\u0103\u0104\7*\2\2\u0104\u0105\7\t\2\2\u0105\u0106\58\35\2\u0106"+
		"\u0107\7\n\2\2\u0107\u011b\3\2\2\2\u0108\u0109\7*\2\2\u0109\u010a\7\t"+
		"\2\2\u010a\u010b\58\35\2\u010b\u010c\7\n\2\2\u010c\u010d\7\t\2\2\u010d"+
		"\u010e\58\35\2\u010e\u010f\7\n\2\2\u010f\u011b\3\2\2\2\u0110\u011b\5\32"+
		"\16\2\u0111\u011b\7*\2\2\u0112\u011b\7,\2\2\u0113\u011b\7-\2\2\u0114\u011b"+
		"\7+\2\2\u0115\u011b\7.\2\2\u0116\u0117\7\7\2\2\u0117\u0118\58\35\2\u0118"+
		"\u0119\7\b\2\2\u0119\u011b\3\2\2\2\u011a\u0101\3\2\2\2\u011a\u0103\3\2"+
		"\2\2\u011a\u0108\3\2\2\2\u011a\u0110\3\2\2\2\u011a\u0111\3\2\2\2\u011a"+
		"\u0112\3\2\2\2\u011a\u0113\3\2\2\2\u011a\u0114\3\2\2\2\u011a\u0115\3\2"+
		"\2\2\u011a\u0116\3\2\2\2\u011b\u012d\3\2\2\2\u011c\u011d\f\7\2\2\u011d"+
		"\u011e\t\3\2\2\u011e\u012c\58\35\b\u011f\u0120\f\6\2\2\u0120\u0121\t\4"+
		"\2\2\u0121\u012c\58\35\7\u0122\u0123\f\5\2\2\u0123\u0124\t\5\2\2\u0124"+
		"\u012c\58\35\6\u0125\u0126\f\4\2\2\u0126\u0127\t\6\2\2\u0127\u012c\58"+
		"\35\5\u0128\u0129\f\3\2\2\u0129\u012a\t\7\2\2\u012a\u012c\58\35\4\u012b"+
		"\u011c\3\2\2\2\u012b\u011f\3\2\2\2\u012b\u0122\3\2\2\2\u012b\u0125\3\2"+
		"\2\2\u012b\u0128\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e9\3\2\2\2\u012f\u012d\3\2\2\2\21@BLkpz\u00a3\u00ad"+
		"\u00c9\u00ce\u00d7\u00e0\u011a\u012b\u012d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}