// Generated from /Users/xzhang1/Desktop/state/formula/Formula.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FormulaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LBRACKET=1, RBRACKET=2, ELEMENT=3, NUMBER=4, WHITESPACE=5;
	public static final int
		RULE_formula = 0, RULE_group = 1, RULE_number = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"formula", "group", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LBRACKET", "RBRACKET", "ELEMENT", "NUMBER", "WHITESPACE"
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
	public String getGrammarFileName() { return "Formula.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FormulaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FormulaContext extends ParserRuleContext {
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FormulaParser.EOF, 0); }
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			group(0);
			setState(7);
			match(EOF);
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

	public static class GroupContext extends ParserRuleContext {
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
	 
		public GroupContext() { }
		public void copyFrom(GroupContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BrktGrpContext extends GroupContext {
		public TerminalNode LBRACKET() { return getToken(FormulaParser.LBRACKET, 0); }
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(FormulaParser.RBRACKET, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public BrktGrpContext(GroupContext ctx) { copyFrom(ctx); }
	}
	public static class LstGrpContext extends GroupContext {
		public List<GroupContext> group() {
			return getRuleContexts(GroupContext.class);
		}
		public GroupContext group(int i) {
			return getRuleContext(GroupContext.class,i);
		}
		public LstGrpContext(GroupContext ctx) { copyFrom(ctx); }
	}
	public static class EleNumGrpContext extends GroupContext {
		public TerminalNode ELEMENT() { return getToken(FormulaParser.ELEMENT, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public EleNumGrpContext(GroupContext ctx) { copyFrom(ctx); }
	}

	public final GroupContext group() throws RecognitionException {
		return group(0);
	}

	private GroupContext group(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GroupContext _localctx = new GroupContext(_ctx, _parentState);
		GroupContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_group, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELEMENT:
				{
				_localctx = new EleNumGrpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(10);
				match(ELEMENT);
				setState(12);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(11);
					number();
					}
					break;
				}
				}
				break;
			case LBRACKET:
				{
				_localctx = new BrktGrpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(14);
				match(LBRACKET);
				setState(15);
				group(0);
				setState(16);
				match(RBRACKET);
				setState(18);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(17);
					number();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(26);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LstGrpContext(new GroupContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_group);
					setState(22);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(23);
					group(2);
					}
					} 
				}
				setState(28);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumContext extends NumberContext {
		public TerminalNode NUMBER() { return getToken(FormulaParser.NUMBER, 0); }
		public NumContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class BrktNumContext extends NumberContext {
		public TerminalNode LBRACKET() { return getToken(FormulaParser.LBRACKET, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(FormulaParser.RBRACKET, 0); }
		public BrktNumContext(NumberContext ctx) { copyFrom(ctx); }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_number);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(NUMBER);
				}
				break;
			case LBRACKET:
				_localctx = new BrktNumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(LBRACKET);
				setState(31);
				number();
				setState(32);
				match(RBRACKET);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return group_sempred((GroupContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean group_sempred(GroupContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\'\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\3\3\3\3\3\5\3\17\n\3\3\3\3\3\3\3\3\3\5\3\25\n"+
		"\3\5\3\27\n\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\4\3\4\3\4\3\4\3\4"+
		"\5\4%\n\4\3\4\2\3\4\5\2\4\6\2\2\2(\2\b\3\2\2\2\4\26\3\2\2\2\6$\3\2\2\2"+
		"\b\t\5\4\3\2\t\n\7\2\2\3\n\3\3\2\2\2\13\f\b\3\1\2\f\16\7\5\2\2\r\17\5"+
		"\6\4\2\16\r\3\2\2\2\16\17\3\2\2\2\17\27\3\2\2\2\20\21\7\3\2\2\21\22\5"+
		"\4\3\2\22\24\7\4\2\2\23\25\5\6\4\2\24\23\3\2\2\2\24\25\3\2\2\2\25\27\3"+
		"\2\2\2\26\13\3\2\2\2\26\20\3\2\2\2\27\34\3\2\2\2\30\31\f\3\2\2\31\33\5"+
		"\4\3\4\32\30\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\5\3"+
		"\2\2\2\36\34\3\2\2\2\37%\7\6\2\2 !\7\3\2\2!\"\5\6\4\2\"#\7\4\2\2#%\3\2"+
		"\2\2$\37\3\2\2\2$ \3\2\2\2%\7\3\2\2\2\7\16\24\26\34$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}