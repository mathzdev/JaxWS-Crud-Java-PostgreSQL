package com.github.matheus.jaxws.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static final Connection connection = construirConexao();

    private static Connection construirConexao() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(
                    "jdbc:postgresql://ec2-54-83-23-91.compute-1.amazonaws.com:5432/d9m8gtiapdrgrq?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory", // URI
                    "irzetteptzuqfm", // Login
                    "d3419d42ff7691a59a36dde0825f94fca7c239ccd157f662775424920a7fa074"); // Pass

        } catch (Exception ex) {
            System.err.println("Conexao falhou: " + ex.getMessage());
            ex.printStackTrace();
        }
        return null;
    }

    public static Connection getConnection() {
        return connection;
    }
}

