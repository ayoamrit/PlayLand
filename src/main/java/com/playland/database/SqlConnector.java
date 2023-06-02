package com.playland.database;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;

public class SqlConnector {

    private final SqlServerConfig sqlServerConfig = new SqlServerConfig();

    /**
     * Retrieves a database connection
     *
     * @return The established database connection, or null if connection fails.
     */
    @org.jetbrains.annotations.Nullable
    private Connection getConnection(){
        Connection connection = null;

        try{
            //Attempt to establish a connection using the SQL Server configuration settings
            connection = DriverManager.getConnection(sqlServerConfig.getUrl(), sqlServerConfig.getUsername(), sqlServerConfig.getPassword());
        }catch(SQLException e){
            //If an SQL exception occurs, return null to indicate a connection failure
            return null;
        }

        //Return the established connection
        return connection;
    }

    /**
     * Retrieves a statement object for executing SQL queries
     *
     * @return The created statement object, or null if statement creation fails
     */

    protected Statement getStatement(){
        Connection connection = getConnection();
        Statement statement = null;

        try{
            //Assert that the connection is not null
            assert connection != null;

            //Create a statement object from the connection
            statement = connection.createStatement();
        }catch(SQLException e){

            //If an SQL exception occurs, return null to indicate a statement creation failure
            return null;
        }

        //Return the created statement
        return statement;
    }

}
