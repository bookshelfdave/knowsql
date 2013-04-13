package com.metadave.knowsql.parser;


import com.basho.riak.client.RiakRetryFailedException;
import com.basho.riak.client.bucket.Bucket;
import com.basho.riak.client.bucket.FetchBucket;
import com.basho.riak.client.query.MapReduceResult;
import com.basho.riak.client.query.functions.NamedErlangFunction;
import com.basho.riak.client.query.indexes.BinIndex;
import com.basho.riak.client.query.indexes.IntIndex;
import com.basho.riak.client.raw.query.indexes.BinValueQuery;
import com.basho.riak.client.raw.query.indexes.IndexQuery;
import com.metadave.knowsql.RiakResultSet;

import java.util.List;

public class SelectContext {
    private String bucket;
    private List<String> fields;
    private IndexWhereClause whereClause;
    private ColumnSelect columnSelect;

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

    public ColumnSelect getColumnSelect() {
        return columnSelect;
    }

    public void setColumnSelect(ColumnSelect columnSelect) {
        this.columnSelect = columnSelect;
    }

    public RiakResultSet exec(EvalContext ctx) {
        if(this.whereClause == null) {
            try {
                Bucket bucket = ctx.conn.getRiakClient().fetchBucket(this.bucket).execute();
                Iterable<String> allKeys = bucket.keys();
                RiakResultSet rs = new RiakResultSet(ctx, bucket, allKeys);
                ctx.rs = rs;
                return rs;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if(this.whereClause instanceof WhereClauseExactMatch) {
            try {
                System.out.println("EXACT MATCH");
                Bucket bucket = ctx.conn.getRiakClient().fetchBucket(this.bucket).execute();
                WhereClauseExactMatch exact = (WhereClauseExactMatch)this.whereClause;
                List<String> results = null;
                if (exact.getIndex().endsWith("_bin")) {
                    results = bucket.fetchIndex(BinIndex.named(exact.getIndex())).withValue(exact.getValue().toString()).execute();
                } else if (exact.getIndex().endsWith("_int")) {
                    long val = 0;
                    try {
                        val = Long.parseLong(exact.getValue().toString());
                    } catch (Exception e) {
                        throw new RuntimeException("Invalid 2i query exact value");
                    }
                    results = bucket.fetchIndex(IntIndex.named(exact.getIndex())).withValue(val).execute();
                }
                Iterable<String> allKeys;
                RiakResultSet rs = new RiakResultSet(ctx, bucket, results);
                ctx.rs = rs;
                return rs;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if(this.whereClause instanceof WhereClauseRange) {
            System.out.println("Where Clause");
        }
        return null;
    }
}
