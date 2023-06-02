package com.playland.database;

import io.github.cdimascio.dotenv.Dotenv;

public class SqlServerConfig {

    //Dotenv object fir loading environment configurations from a file
    private final Dotenv dotenv = Dotenv.configure().directory("ref/.env").load();

    /**
     * Retrieves the URL from the environment configuration
     * @return The URL as a string.
     */
    public String getUrl(){
        return dotenv.get("URL");
    }

    /**
     * Retrieves the username from the environment configuration
     * @return The username as a string.
     */
    public String getUsername(){
        return dotenv.get("USERNAME");
    }

    /**
     * Retrieves the password from the environment configuration
     * @return The password as a string.
     */
    public String getPassword(){
        return dotenv.get("PASSWORD");
    }
}
