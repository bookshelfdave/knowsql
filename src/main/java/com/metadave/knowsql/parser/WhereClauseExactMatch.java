package com.metadave.knowsql.parser;


public class WhereClauseExactMatch extends IndexWhereClause {
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
