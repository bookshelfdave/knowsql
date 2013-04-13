package com.metadave.knowsql.parser;


import java.util.List;

public class EvalContext {
    private String bucket;
    private List<String> fields;
    private IndexWhereClause whereClause;

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public IndexWhereClause getWhereClause() {
        return whereClause;
    }

    public void setWhereClause(IndexWhereClause whereClause) {
        this.whereClause = whereClause;
    }
}
