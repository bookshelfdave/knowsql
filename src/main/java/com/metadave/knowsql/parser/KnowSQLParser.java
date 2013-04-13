// Generated from ./src/main/java/com/metadave/knowsql/parser/KnowSQL.g4 by ANTLR 4.0
package com.metadave.knowsql.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KnowSQLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, BETWEEN=4, AND=5, AT=6, SPLAT=7, COMMA=8, LPAREN=9, 
		RPAREN=10, EQUALS=11, SEMI=12, TRUE=13, FALSE=14, ID=15, INT=16, STRING=17, 
		LINE_COMMENT=18, COMMENT=19, WS=20;
	public static final String[] tokenNames = {
		"<INVALID>", "'select'", "'from'", "'where'", "'between'", "'and'", "'@'", 
		"'*'", "','", "'('", "')'", "'='", "';'", "'true'", "'false'", "ID", "INT", 
		"STRING", "LINE_COMMENT", "COMMENT", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_select = 1, RULE_column_select = 2, RULE_where_clause = 3, 
		RULE_where_clause_exact = 4, RULE_where_clause_range = 5, RULE_where_value = 6, 
		RULE_bool = 7;
	public static final String[] ruleNames = {
		"prog", "select", "column_select", "where_clause", "where_clause_exact", 
		"where_clause_range", "where_value", "bool"
	};

	@Override
	public String getGrammarFileName() { return "KnowSQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public KnowSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public SelectContext select(int i) {
			return getRuleContext(SelectContext.class,i);
		}
		public List<SelectContext> select() {
			return getRuleContexts(SelectContext.class);
		}
		public TerminalNode EOF() { return getToken(KnowSQLParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowSQLListener ) ((KnowSQLListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowSQLListener ) ((KnowSQLListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16); select();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SELECT );
			setState(21); match(EOF);
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

	public static class SelectContext extends ParserRuleContext {
		public Token bucket;
		public TerminalNode WHERE() { return getToken(KnowSQLParser.WHERE, 0); }
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode ID() { return getToken(KnowSQLParser.ID, 0); }
		public TerminalNode FROM() { return getToken(KnowSQLParser.FROM, 0); }
		public TerminalNode SELECT() { return getToken(KnowSQLParser.SELECT, 0); }
		public Column_selectContext column_select() {
			return getRuleContext(Column_selectContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowSQLListener ) ((KnowSQLListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowSQLListener ) ((KnowSQLListener)listener).exitSelect(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); match(SELECT);
			setState(24); column_select();
			setState(25); match(FROM);
			setState(26); ((SelectContext)_localctx).bucket = match(ID);
			setState(29);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(27); match(WHERE);
				setState(28); where_clause();
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

	public static class Column_selectContext extends ParserRuleContext {
		public Token ID;
		public List<Token> cols = new ArrayList<Token>();
		public TerminalNode ID(int i) {
			return getToken(KnowSQLParser.ID, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(KnowSQLParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(KnowSQLParser.ID); }
		public List<TerminalNode> COMMA() { return getTokens(KnowSQLParser.COMMA); }
		public TerminalNode SPLAT() { return getToken(KnowSQLParser.SPLAT, 0); }
		public Column_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowSQLListener ) ((KnowSQLListener)listener).enterColumn_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowSQLListener ) ((KnowSQLListener)listener).exitColumn_select(this);
		}
	}

	public final Column_selectContext column_select() throws RecognitionException {
		Column_selectContext _localctx = new Column_selectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_column_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			switch (_input.LA(1)) {
			case SPLAT:
				{
				setState(31); match(SPLAT);
				}
				break;
			case ID:
				{
				{
				setState(32); ((Column_selectContext)_localctx).ID = match(ID);
				((Column_selectContext)_localctx).cols.add(((Column_selectContext)_localctx).ID);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(33); match(COMMA);
					setState(34); ((Column_selectContext)_localctx).ID = match(ID);
					((Column_selectContext)_localctx).cols.add(((Column_selectContext)_localctx).ID);
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Where_clauseContext extends ParserRuleContext {
		public Where_clause_rangeContext where_clause_range() {
			return getRuleContext(Where_clause_rangeContext.class,0);
		}
		public Where_clause_exactContext where_clause_exact() {
			return getRuleContext(Where_clause_exactContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowSQLListener ) ((KnowSQLListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowSQLListener ) ((KnowSQLListener)listener).exitWhere_clause(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_where_clause);
		try {
			setState(44);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); where_clause_exact();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43); where_clause_range();
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

	public static class Where_clause_exactContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(KnowSQLParser.EQUALS, 0); }
		public Where_valueContext where_value() {
			return getRuleContext(Where_valueContext.class,0);
		}
		public TerminalNode ID() { return getToken(KnowSQLParser.ID, 0); }
		public Where_clause_exactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause_exact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowSQLListener ) ((KnowSQLListener)listener).enterWhere_clause_exact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowSQLListener ) ((KnowSQLListener)listener).exitWhere_clause_exact(this);
		}
	}

	public final Where_clause_exactContext where_clause_exact() throws RecognitionException {
		Where_clause_exactContext _localctx = new Where_clause_exactContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_where_clause_exact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(ID);
			setState(47); match(EQUALS);
			setState(48); where_value();
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

	public static class Where_clause_rangeContext extends ParserRuleContext {
		public Where_valueContext where_from;
		public Where_valueContext where_to;
		public Where_valueContext where_value(int i) {
			return getRuleContext(Where_valueContext.class,i);
		}
		public List<Where_valueContext> where_value() {
			return getRuleContexts(Where_valueContext.class);
		}
		public TerminalNode AND() { return getToken(KnowSQLParser.AND, 0); }
		public TerminalNode ID() { return getToken(KnowSQLParser.ID, 0); }
		public TerminalNode BETWEEN() { return getToken(KnowSQLParser.BETWEEN, 0); }
		public Where_clause_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowSQLListener ) ((KnowSQLListener)listener).enterWhere_clause_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowSQLListener ) ((KnowSQLListener)listener).exitWhere_clause_range(this);
		}
	}

	public final Where_clause_rangeContext where_clause_range() throws RecognitionException {
		Where_clause_rangeContext _localctx = new Where_clause_rangeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_where_clause_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(ID);
			setState(51); match(BETWEEN);
			setState(52); ((Where_clause_rangeContext)_localctx).where_from = where_value();
			setState(53); match(AND);
			setState(54); ((Where_clause_rangeContext)_localctx).where_to = where_value();
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

	public static class Where_valueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(KnowSQLParser.INT, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode STRING() { return getToken(KnowSQLParser.STRING, 0); }
		public Where_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowSQLListener ) ((KnowSQLListener)listener).enterWhere_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowSQLListener ) ((KnowSQLListener)listener).exitWhere_value(this);
		}
	}

	public final Where_valueContext where_value() throws RecognitionException {
		Where_valueContext _localctx = new Where_valueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_where_value);
		try {
			setState(59);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(56); match(INT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(57); match(STRING);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(58); bool();
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(KnowSQLParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(KnowSQLParser.TRUE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnowSQLListener ) ((KnowSQLListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnowSQLListener ) ((KnowSQLListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\2\3\26B\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\3\2\6\2\24\n\2\r\2\16\2\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3 \n\3"+
		"\3\4\3\4\3\4\3\4\7\4&\n\4\f\4\16\4)\13\4\5\4+\n\4\3\5\3\5\5\5/\n\5\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b>\n\b\3\t\3\t\3\t"+
		"\2\n\2\4\6\b\n\f\16\20\2\3\3\17\20@\2\23\3\2\2\2\4\31\3\2\2\2\6*\3\2\2"+
		"\2\b.\3\2\2\2\n\60\3\2\2\2\f\64\3\2\2\2\16=\3\2\2\2\20?\3\2\2\2\22\24"+
		"\5\4\3\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\27"+
		"\3\2\2\2\27\30\7\1\2\2\30\3\3\2\2\2\31\32\7\3\2\2\32\33\5\6\4\2\33\34"+
		"\7\4\2\2\34\37\7\21\2\2\35\36\7\5\2\2\36 \5\b\5\2\37\35\3\2\2\2\37 \3"+
		"\2\2\2 \5\3\2\2\2!+\7\t\2\2\"\'\7\21\2\2#$\7\n\2\2$&\7\21\2\2%#\3\2\2"+
		"\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(+\3\2\2\2)\'\3\2\2\2*!\3\2\2\2*\"\3"+
		"\2\2\2+\7\3\2\2\2,/\5\n\6\2-/\5\f\7\2.,\3\2\2\2.-\3\2\2\2/\t\3\2\2\2\60"+
		"\61\7\21\2\2\61\62\7\r\2\2\62\63\5\16\b\2\63\13\3\2\2\2\64\65\7\21\2\2"+
		"\65\66\7\6\2\2\66\67\5\16\b\2\678\7\7\2\289\5\16\b\29\r\3\2\2\2:>\7\22"+
		"\2\2;>\7\23\2\2<>\5\20\t\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\17\3\2\2\2?"+
		"@\t\2\2\2@\21\3\2\2\2\b\25\37\'*.=";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}