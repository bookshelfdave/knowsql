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
            ResultSet rs = stmt.executeQuery("select * from Google where year_int = 2010");
            while(rs.next()) {
                System.out.println(rs.getString(0));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
