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
		RULE_function_declaration = 3, RULE_function_params = 4, RULE_function_param = 5, 
		RULE_cwtype = 6, RULE_list_assignment = 7, RULE_list_push = 8, RULE_list_pop = 9, 
		RULE_var_assignment = 10, RULE_block = 11, RULE_main_function = 12, RULE_statement = 13, 
		RULE_function_statement = 14, RULE_arguments = 15, RULE_if_statement = 16, 
		RULE_else_statement = 17, RULE_while_statement = 18, RULE_do_while_statement = 19, 
		RULE_if_expr = 20, RULE_do_if_expr = 21, RULE_return_statement = 22, RULE_print_statement = 23, 
		RULE_expr = 24;
	public static final String[] ruleNames = {
		"compiwave", "var_declaration", "list_declaration", "function_declaration", 
		"function_params", "function_param", "cwtype", "list_assignment", "list_push", 
		"list_pop", "var_assignment", "block", "main_function", "statement", "function_statement", 
		"arguments", "if_statement", "else_statement", "while_statement", "do_while_statement", 
		"if_expr", "do_if_expr", "return_statement", "print_statement", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "';'", "'list'", "'('", "')'", "'function'", 
		"'void'", "','", "'['", "']'", "'{'", "'}'", "'main'", "'if'", "'else'", 
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
			setState(50);
			match(T__0);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING))) != 0)) {
				{
				setState(54);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_FLOAT:
				case T_INT:
				case T_BOOL:
				case T_STRING:
					{
					setState(51);
					var_declaration();
					}
					break;
				case T__3:
					{
					setState(52);
					list_declaration();
					}
					break;
				case T__6:
					{
					setState(53);
					function_declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			main_function();
			setState(60);
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
			setState(62);
			cwtype();
			setState(63);
			match(ID);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(64);
				match(ASSIGN);
				setState(65);
				expr(0);
				}
			}

			setState(68);
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
			setState(70);
			match(T__3);
			setState(71);
			match(ID);
			setState(72);
			match(T__4);
			setState(73);
			cwtype();
			setState(74);
			match(T__5);
			setState(75);
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
		enterRule(_localctx, 6, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__6);
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FLOAT:
			case T_INT:
			case T_BOOL:
			case T_STRING:
				{
				setState(78);
				cwtype();
				}
				break;
			case T__7:
				{
				setState(79);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(82);
			match(ID);
			setState(83);
			match(T__4);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING))) != 0)) {
				{
				setState(84);
				function_params();
				}
			}

			setState(87);
			match(T__5);
			setState(88);
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
		enterRule(_localctx, 8, RULE_function_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			((Function_paramsContext)_localctx).function_param = function_param();
			((Function_paramsContext)_localctx).numberOfParams.add(((Function_paramsContext)_localctx).function_param);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(91);
				match(T__8);
				setState(92);
				((Function_paramsContext)_localctx).function_param = function_param();
				((Function_paramsContext)_localctx).numberOfParams.add(((Function_paramsContext)_localctx).function_param);
				}
				}
				setState(97);
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
		enterRule(_localctx, 10, RULE_function_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			cwtype();
			setState(99);
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
		enterRule(_localctx, 12, RULE_cwtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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

	public static class List_assignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompiwaveParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(CompiwaveParser.ASSIGN, 0); }
		public List_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterList_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitList_assignment(this);
		}
	}

	public final List_assignmentContext list_assignment() throws RecognitionException {
		List_assignmentContext _localctx = new List_assignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_list_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(104);
			match(T__9);
			setState(105);
			expr(0);
			setState(106);
			match(T__10);
			setState(107);
			match(ASSIGN);
			setState(108);
			expr(0);
			setState(109);
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
		enterRule(_localctx, 16, RULE_list_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
			setState(112);
			match(PUSH);
			setState(113);
			expr(0);
			setState(114);
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
		enterRule(_localctx, 18, RULE_list_pop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ID);
			setState(117);
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
		enterRule(_localctx, 20, RULE_var_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(120);
			match(ASSIGN);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(121);
					match(ID);
					setState(122);
					match(ASSIGN);
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(128);
			expr(0);
			setState(129);
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
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__11);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(132);
				statement();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
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
		enterRule(_localctx, 24, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__13);
			setState(141);
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
		public List_assignmentContext list_assignment() {
			return getRuleContext(List_assignmentContext.class,0);
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
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				var_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				list_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				if_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				while_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				do_while_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
				return_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(150);
				print_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(151);
				var_assignment();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(152);
				list_assignment();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(153);
				list_push();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(154);
				list_pop();
				setState(155);
				match(T__2);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(157);
				function_statement();
				setState(158);
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
		enterRule(_localctx, 28, RULE_function_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ID);
			setState(163);
			match(T__4);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ID) | (1L << BOOLEAN) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(164);
				arguments();
				}
			}

			setState(167);
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
		enterRule(_localctx, 30, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			((ArgumentsContext)_localctx).expr = expr(0);
			((ArgumentsContext)_localctx).numberOfArguments.add(((ArgumentsContext)_localctx).expr);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(170);
				match(T__8);
				setState(171);
				((ArgumentsContext)_localctx).expr = expr(0);
				((ArgumentsContext)_localctx).numberOfArguments.add(((ArgumentsContext)_localctx).expr);
				}
				}
				setState(176);
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
		enterRule(_localctx, 32, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__14);
			setState(178);
			match(T__4);
			setState(179);
			if_expr();
			setState(180);
			match(T__5);
			setState(181);
			block();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(182);
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
		enterRule(_localctx, 34, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__15);
			setState(186);
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
		enterRule(_localctx, 36, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__16);
			setState(189);
			match(T__4);
			setState(190);
			if_expr();
			setState(191);
			match(T__5);
			setState(192);
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
		enterRule(_localctx, 38, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__17);
			setState(195);
			block();
			setState(196);
			match(T__16);
			setState(197);
			match(T__4);
			setState(198);
			do_if_expr();
			setState(199);
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
		enterRule(_localctx, 40, RULE_if_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
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
		enterRule(_localctx, 42, RULE_do_if_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
		enterRule(_localctx, 44, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__18);
			setState(206);
			expr(0);
			setState(207);
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
		enterRule(_localctx, 46, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__19);
			setState(210);
			match(T__4);
			setState(211);
			expr(0);
			setState(212);
			match(T__5);
			setState(213);
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
	public static class ListIndexContext extends ExprContext {
		public TerminalNode ID() { return getToken(CompiwaveParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListIndexContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).enterListIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompiwaveListener ) ((CompiwaveListener)listener).exitListIndex(this);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(216);
				function_statement();
				}
				break;
			case 2:
				{
				_localctx = new ListIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(ID);
				setState(218);
				match(T__9);
				setState(219);
				expr(0);
				setState(220);
				match(T__10);
				}
				break;
			case 3:
				{
				_localctx = new ListPopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				list_pop();
				}
				break;
			case 4:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new IntConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new FloatConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(FLOAT);
				}
				break;
			case 7:
				{
				_localctx = new BoolConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(BOOLEAN);
				}
				break;
			case 8:
				{
				_localctx = new StringConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(STRING);
				}
				break;
			case 9:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				match(T__4);
				setState(229);
				expr(0);
				setState(230);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(249);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(235);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(236);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(238);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(239);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new LTGTContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(241);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LEQUAL) | (1L << GEQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(242);
						expr(4);
						}
						break;
					case 4:
						{
						_localctx = new EqualityNotContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(243);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(244);
						_la = _input.LA(1);
						if ( !(_la==EQUALS || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(245);
						expr(3);
						}
						break;
					case 5:
						{
						_localctx = new AndOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(247);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(248);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(253);
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
		case 24:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u0101\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\5\3E\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5"+
		"S\n\5\3\5\3\5\3\5\5\5X\n\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6`\n\6\f\6\16\6c"+
		"\13\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f~\n\f\f\f\16\f\u0081\13\f\3"+
		"\f\3\f\3\f\3\r\3\r\7\r\u0088\n\r\f\r\16\r\u008b\13\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00a3\n\17\3\20\3\20\3\20\5\20\u00a8\n\20\3"+
		"\20\3\20\3\21\3\21\3\21\7\21\u00af\n\21\f\21\16\21\u00b2\13\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u00ba\n\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u00eb\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\7\32\u00fc\n\32\f\32\16\32\u00ff\13\32\3\32\2\3\62\33"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\b\3\2&)\3\2\34"+
		"\35\3\2\32\33\3\2 #\3\2\36\37\3\2$%\u010c\2\64\3\2\2\2\4@\3\2\2\2\6H\3"+
		"\2\2\2\bO\3\2\2\2\n\\\3\2\2\2\fd\3\2\2\2\16g\3\2\2\2\20i\3\2\2\2\22q\3"+
		"\2\2\2\24v\3\2\2\2\26y\3\2\2\2\30\u0085\3\2\2\2\32\u008e\3\2\2\2\34\u00a2"+
		"\3\2\2\2\36\u00a4\3\2\2\2 \u00ab\3\2\2\2\"\u00b3\3\2\2\2$\u00bb\3\2\2"+
		"\2&\u00be\3\2\2\2(\u00c4\3\2\2\2*\u00cb\3\2\2\2,\u00cd\3\2\2\2.\u00cf"+
		"\3\2\2\2\60\u00d3\3\2\2\2\62\u00ea\3\2\2\2\64:\7\3\2\2\659\5\4\3\2\66"+
		"9\5\6\4\2\679\5\b\5\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29<\3\2\2\2:8"+
		"\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\5\32\16\2>?\7\4\2\2?\3\3\2\2"+
		"\2@A\5\16\b\2AD\7*\2\2BC\7\31\2\2CE\5\62\32\2DB\3\2\2\2DE\3\2\2\2EF\3"+
		"\2\2\2FG\7\5\2\2G\5\3\2\2\2HI\7\6\2\2IJ\7*\2\2JK\7\7\2\2KL\5\16\b\2LM"+
		"\7\b\2\2MN\7\5\2\2N\7\3\2\2\2OR\7\t\2\2PS\5\16\b\2QS\7\n\2\2RP\3\2\2\2"+
		"RQ\3\2\2\2ST\3\2\2\2TU\7*\2\2UW\7\7\2\2VX\5\n\6\2WV\3\2\2\2WX\3\2\2\2"+
		"XY\3\2\2\2YZ\7\b\2\2Z[\5\30\r\2[\t\3\2\2\2\\a\5\f\7\2]^\7\13\2\2^`\5\f"+
		"\7\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\13\3\2\2\2ca\3\2\2\2de\5"+
		"\16\b\2ef\7*\2\2f\r\3\2\2\2gh\t\2\2\2h\17\3\2\2\2ij\7*\2\2jk\7\f\2\2k"+
		"l\5\62\32\2lm\7\r\2\2mn\7\31\2\2no\5\62\32\2op\7\5\2\2p\21\3\2\2\2qr\7"+
		"*\2\2rs\7\27\2\2st\5\62\32\2tu\7\5\2\2u\23\3\2\2\2vw\7*\2\2wx\7\30\2\2"+
		"x\25\3\2\2\2yz\7*\2\2z\177\7\31\2\2{|\7*\2\2|~\7\31\2\2}{\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0082\u0083\5\62\32\2\u0083\u0084\7\5\2\2\u0084\27\3\2\2\2\u0085"+
		"\u0089\7\16\2\2\u0086\u0088\5\34\17\2\u0087\u0086\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008d\7\17\2\2\u008d\31\3\2\2\2\u008e\u008f\7\20"+
		"\2\2\u008f\u0090\5\30\r\2\u0090\33\3\2\2\2\u0091\u00a3\5\30\r\2\u0092"+
		"\u00a3\5\4\3\2\u0093\u00a3\5\6\4\2\u0094\u00a3\5\"\22\2\u0095\u00a3\5"+
		"&\24\2\u0096\u00a3\5(\25\2\u0097\u00a3\5.\30\2\u0098\u00a3\5\60\31\2\u0099"+
		"\u00a3\5\26\f\2\u009a\u00a3\5\20\t\2\u009b\u00a3\5\22\n\2\u009c\u009d"+
		"\5\24\13\2\u009d\u009e\7\5\2\2\u009e\u00a3\3\2\2\2\u009f\u00a0\5\36\20"+
		"\2\u00a0\u00a1\7\5\2\2\u00a1\u00a3\3\2\2\2\u00a2\u0091\3\2\2\2\u00a2\u0092"+
		"\3\2\2\2\u00a2\u0093\3\2\2\2\u00a2\u0094\3\2\2\2\u00a2\u0095\3\2\2\2\u00a2"+
		"\u0096\3\2\2\2\u00a2\u0097\3\2\2\2\u00a2\u0098\3\2\2\2\u00a2\u0099\3\2"+
		"\2\2\u00a2\u009a\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2"+
		"\u009f\3\2\2\2\u00a3\35\3\2\2\2\u00a4\u00a5\7*\2\2\u00a5\u00a7\7\7\2\2"+
		"\u00a6\u00a8\5 \21\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00aa\7\b\2\2\u00aa\37\3\2\2\2\u00ab\u00b0\5\62\32\2\u00ac"+
		"\u00ad\7\13\2\2\u00ad\u00af\5\62\32\2\u00ae\u00ac\3\2\2\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1!\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b4\7\21\2\2\u00b4\u00b5\7\7\2\2\u00b5\u00b6\5"+
		"*\26\2\u00b6\u00b7\7\b\2\2\u00b7\u00b9\5\30\r\2\u00b8\u00ba\5$\23\2\u00b9"+
		"\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba#\3\2\2\2\u00bb\u00bc\7\22\2\2"+
		"\u00bc\u00bd\5\30\r\2\u00bd%\3\2\2\2\u00be\u00bf\7\23\2\2\u00bf\u00c0"+
		"\7\7\2\2\u00c0\u00c1\5*\26\2\u00c1\u00c2\7\b\2\2\u00c2\u00c3\5\30\r\2"+
		"\u00c3\'\3\2\2\2\u00c4\u00c5\7\24\2\2\u00c5\u00c6\5\30\r\2\u00c6\u00c7"+
		"\7\23\2\2\u00c7\u00c8\7\7\2\2\u00c8\u00c9\5,\27\2\u00c9\u00ca\7\b\2\2"+
		"\u00ca)\3\2\2\2\u00cb\u00cc\5\62\32\2\u00cc+\3\2\2\2\u00cd\u00ce\5\62"+
		"\32\2\u00ce-\3\2\2\2\u00cf\u00d0\7\25\2\2\u00d0\u00d1\5\62\32\2\u00d1"+
		"\u00d2\7\5\2\2\u00d2/\3\2\2\2\u00d3\u00d4\7\26\2\2\u00d4\u00d5\7\7\2\2"+
		"\u00d5\u00d6\5\62\32\2\u00d6\u00d7\7\b\2\2\u00d7\u00d8\7\5\2\2\u00d8\61"+
		"\3\2\2\2\u00d9\u00da\b\32\1\2\u00da\u00eb\5\36\20\2\u00db\u00dc\7*\2\2"+
		"\u00dc\u00dd\7\f\2\2\u00dd\u00de\5\62\32\2\u00de\u00df\7\r\2\2\u00df\u00eb"+
		"\3\2\2\2\u00e0\u00eb\5\24\13\2\u00e1\u00eb\7*\2\2\u00e2\u00eb\7,\2\2\u00e3"+
		"\u00eb\7-\2\2\u00e4\u00eb\7+\2\2\u00e5\u00eb\7.\2\2\u00e6\u00e7\7\7\2"+
		"\2\u00e7\u00e8\5\62\32\2\u00e8\u00e9\7\b\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00d9\3\2\2\2\u00ea\u00db\3\2\2\2\u00ea\u00e0\3\2\2\2\u00ea\u00e1\3\2"+
		"\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e3\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea"+
		"\u00e5\3\2\2\2\u00ea\u00e6\3\2\2\2\u00eb\u00fd\3\2\2\2\u00ec\u00ed\f\7"+
		"\2\2\u00ed\u00ee\t\3\2\2\u00ee\u00fc\5\62\32\b\u00ef\u00f0\f\6\2\2\u00f0"+
		"\u00f1\t\4\2\2\u00f1\u00fc\5\62\32\7\u00f2\u00f3\f\5\2\2\u00f3\u00f4\t"+
		"\5\2\2\u00f4\u00fc\5\62\32\6\u00f5\u00f6\f\4\2\2\u00f6\u00f7\t\6\2\2\u00f7"+
		"\u00fc\5\62\32\5\u00f8\u00f9\f\3\2\2\u00f9\u00fa\t\7\2\2\u00fa\u00fc\5"+
		"\62\32\4\u00fb\u00ec\3\2\2\2\u00fb\u00ef\3\2\2\2\u00fb\u00f2\3\2\2\2\u00fb"+
		"\u00f5\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\63\3\2\2\2\u00ff\u00fd\3\2\2\2\218:DRW"+
		"a\177\u0089\u00a2\u00a7\u00b0\u00b9\u00ea\u00fb\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}