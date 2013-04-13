package com.metadave.knowsql;


import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class RiakDriver implements Driver {
    static
    {
        RiakDriver riak = new RiakDriver();
        try {
            DriverManager.registerDriver(riak);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection connect(String url, Properties info) throws SQLException {
        String chunks[] = url.split(":");
        String host = chunks[1].substring(2);
        int port = Integer.parseInt(chunks[2]);
        return new RiakConnection(host, port);
    }

    public boolean acceptsURL(String url) throws SQLException {
        if(url.startsWith("riak:\\")) {
            return true;
        } else {
            return false;
        }
    }

    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        return new DriverPropertyInfo[0];
    }

    public int getMajorVersion() {
        return 1;
    }

    public int getMinorVersion() {
        return 3;
    }

    public boolean jdbcCompliant() {
        return false;
    }

    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
