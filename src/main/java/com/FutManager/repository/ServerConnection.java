package com.FutManager.repository;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ServerConnection {
    private static final HikariDataSource DS;

    static {
        HikariConfig hikariConfig = new HikariConfig("/db.properties");
        DS = new HikariDataSource(hikariConfig);
        Runtime.getRuntime().addShutdownHook(new Thread(DS::close));
    }

    private ServerConnection() {}

    public static Connection get() throws SQLException {
        return DS.getConnection();
    }

}
