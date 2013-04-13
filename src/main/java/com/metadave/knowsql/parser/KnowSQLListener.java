// Generated from ./src/main/java/com/metadave/knowsql/parser/KnowSQL.g4 by ANTLR 4.0
package com.metadave.knowsql.parser;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface KnowSQLListener extends ParseTreeListener {
	void enterProg(KnowSQLParser.ProgContext ctx);
	void exitProg(KnowSQLParser.ProgContext ctx);

	void enterWhere_clause(KnowSQLParser.Where_clauseContext ctx);
	void exitWhere_clause(KnowSQLParser.Where_clauseContext ctx);

	void enterSelect(KnowSQLParser.SelectContext ctx);
	void exitSelect(KnowSQLParser.SelectContext ctx);

	void enterWhere_value(KnowSQLParser.Where_valueContext ctx);
	void exitWhere_value(KnowSQLParser.Where_valueContext ctx);

	void enterBool(KnowSQLParser.BoolContext ctx);
	void exitBool(KnowSQLParser.BoolContext ctx);

	void enterWhere_clause_range(KnowSQLParser.Where_clause_rangeContext ctx);
	void exitWhere_clause_range(KnowSQLParser.Where_clause_rangeContext ctx);

	void enterColumn_select(KnowSQLParser.Column_selectContext ctx);
	void exitColumn_select(KnowSQLParser.Column_selectContext ctx);

	void enterWhere_clause_exact(KnowSQLParser.Where_clause_exactContext ctx);
	void exitWhere_clause_exact(KnowSQLParser.Where_clause_exactContext ctx);
}