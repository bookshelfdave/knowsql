package com.metadave.knowsql.parser;



public class WhereClauseRange extends IndexWhereClause {

    private Object from;
    private Object to;

    public Object getFrom() {
        return from;
    }

    public void setFrom(Object from) {
        this.from = from;
    }

    public Object getTo() {
        return to;
    }

    public void setTo(Object to) {
        this.to = to;
    }
}
