package com.metadave.knowsql.parser;

import com.metadave.knowsql.RiakConnection;
import com.metadave.knowsql.RiakResultSet;
import com.metadave.knowsql.RiakStatement;

public class EvalContext {

    public RiakConnection conn;
    public RiakStatement stmt;
    public RiakResultSet rs;

}
