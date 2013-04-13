package com.metadave.knowsql.parser;


import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class KnowSQLWalker extends KnowSQLBaseListener {
    ParseTreeProperty<Object> values = new ParseTreeProperty<Object>();
    EvalContext evalCtx;

    public KnowSQLWalker(EvalContext ev) {
        this.evalCtx = ev;
    }

    public void setValue(ParseTree node, Object value) {
        values.put(node, value);
    }

    public Object getValue(ParseTree node) {
        return values.get(node);
    }


    @Override
    public void exitSelect(KnowSQLParser.SelectContext ctx) {
        System.out.println("exitSelect");
        IndexWhereClause wc = (IndexWhereClause)getValue(ctx.where_clause());
        this.evalCtx.setBucket(ctx.bucket.getText());
        this.evalCtx
    }


    @Override
    public void exitWhere_value(KnowSQLParser.Where_valueContext ctx) {
        if(ctx.INT() != null) {
            setValue(ctx, new Integer(ctx.INT().getText()));
        } else if(ctx.STRING() != null) {
            setValue(ctx, stripQuotes(ctx.STRING().getText()));
        } else if(ctx.bool() != null) {
            setValue(ctx, getValue(ctx.bool()));
        }
    }

    @Override
    public void exitBool(KnowSQLParser.BoolContext ctx) {
        setValue(ctx, new Boolean(ctx.getText()));
    }

    @Override
    public void exitColumn_select(KnowSQLParser.Column_selectContext ctx) {

    }

    @Override
    public void exitWhere_clause(KnowSQLParser.Where_clauseContext ctx) {
        if(ctx.where_clause_exact() != null) {
            IndexWhereClause wc = (IndexWhereClause)getValue(ctx.where_clause_exact());
            setValue(ctx, wc);
        } else if(ctx.where_clause_range()!= null) {
            IndexWhereClause wc = (IndexWhereClause)getValue(ctx.where_clause_range());
            setValue(ctx, wc);
        }
    }

    @Override
    public void exitWhere_clause_exact(KnowSQLParser.Where_clause_exactContext ctx) {
        WhereClauseExactMatch match = new WhereClauseExactMatch();
        match.setIndex(ctx.ID().getText());
        match.setValue(getValue(ctx.where_value()));
    }

    @Override
    public void exitWhere_clause_range(KnowSQLParser.Where_clause_rangeContext ctx) {
        WhereClauseRange range = new WhereClauseRange();
        range.setIndex(ctx.ID().getText());
        range.setFrom(getValue(ctx.where_from));
        range.setTo(getValue(ctx.where_to));
        setValue(ctx, range);
    }

    public static String stripQuotes(String rawVal) {
        // should probably check if it's an empty string and all that..
        if (rawVal.length() == 2) {
            return "";
        } else if (rawVal.length() == 3) {
            return rawVal.substring(1, 2);
        } else {
            String v = rawVal.substring(1, rawVal.length() - 1);
            if(v.contains("\\\"")) {
                v = v.replaceAll("\\\\\"","\"");
            }
            return v;
        }
    }
}
