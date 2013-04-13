package com.metadave.knowsql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {
        try {
            Class.forName("com.metadave.knowsql.RiakDriver");
            Connection conn = DriverManager.getConnection("riak://127.0.0.1:10017");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from foo");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
