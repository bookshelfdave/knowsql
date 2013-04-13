// Generated from ./src/main/java/com/metadave/knowsql/parser/KnowSQL.g4 by ANTLR 4.0
package com.metadave.knowsql.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class KnowSQLBaseListener implements KnowSQLListener {
	@Override public void enterProg(KnowSQLParser.ProgContext ctx) { }
	@Override public void exitProg(KnowSQLParser.ProgContext ctx) { }

	@Override public void enterWhere_clause(KnowSQLParser.Where_clauseContext ctx) { }
	@Override public void exitWhere_clause(KnowSQLParser.Where_clauseContext ctx) { }

	@Override public void enterSelect(KnowSQLParser.SelectContext ctx) { }
	@Override public void exitSelect(KnowSQLParser.SelectContext ctx) { }

	@Override public void enterWhere_value(KnowSQLParser.Where_valueContext ctx) { }
	@Override public void exitWhere_value(KnowSQLParser.Where_valueContext ctx) { }

	@Override public void enterBool(KnowSQLParser.BoolContext ctx) { }
	@Override public void exitBool(KnowSQLParser.BoolContext ctx) { }

	@Override public void enterWhere_clause_range(KnowSQLParser.Where_clause_rangeContext ctx) { }
	@Override public void exitWhere_clause_range(KnowSQLParser.Where_clause_rangeContext ctx) { }

	@Override public void enterColumn_select(KnowSQLParser.Column_selectContext ctx) { }
	@Override public void exitColumn_select(KnowSQLParser.Column_selectContext ctx) { }

	@Override public void enterWhere_clause_exact(KnowSQLParser.Where_clause_exactContext ctx) { }
	@Override public void exitWhere_clause_exact(KnowSQLParser.Where_clause_exactContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}