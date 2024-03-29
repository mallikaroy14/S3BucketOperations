package com.bajaj.carFamily;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private Connection connection;

    public DBConnection(){
       try {
           Class.forName("org.postgresql.Driver");
           connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres","Mallika");

       } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
    }

    public Connection getConnection(){
        return connection;
    }
}
