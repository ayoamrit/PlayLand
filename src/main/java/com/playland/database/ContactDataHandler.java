package com.playland.database;

import com.playland.contact.FormParameters;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.sql.SQLException;

public class ContactDataHandler extends SqlConnector{

    FormParameters formParameters = null;
    public void sendContactData() throws SQLException {

        //Initialize formParameters
        formParameters = new FormParameters();

        //Retrieve the form data from the formParameters object
        String firstname = formParameters.getFirstname();
        String lastname = formParameters.getLastname();
        String email = formParameters.getEmail();
        String message = formParameters.getMessage();

        //Create queries to insert data into the database
        String informationQuery = getInformationQuery(firstname, lastname, email);
        String contactQuery = getContactQuery(email, message);

        //Check if the customer information already exists in the database
        if(!checkInfoExistence(email)){

            //If the customer information doesn't exist, insert it into the database
            getStatement().executeUpdate(informationQuery);

            //Insert the contact form data into the database
            getStatement().executeUpdate(contactQuery);
        }
        else{
            //If the customer information exists, only insert the contact form data into the database
            getStatement().executeUpdate(contactQuery);
        }

    }

    //Check if the customer information exists in the database based on the email value
    private boolean checkInfoExistence(String value) throws SQLException{

        //Execute a SELECT query to check if any rows match the provided email value
        //If a row exists, it means the information already exists in the database
        return getStatement().executeQuery("SELECT * FROM customer_info WHERE EMAIL = '" + value + "'").next();
    }

    //Generate the query to insert customer information into the database
    @Contract(pure = true)
    private @NotNull String getInformationQuery(String firstname, String lastname, String email){
        //Create an INSERT query with the provided values for firstname, lastname, and email
        //The query will insert a new row into the customer_info table with the provided values
        return "INSERT INTO customer_info VALUES ('"+firstname+"', '"+lastname+"', '"+email+"')";
    }

    //Generate the query to insert contact form data into the database
    @Contract(pure = true)
    private @NotNull String getContactQuery(String email, String message){
        //Create an INSERT query with the provided values for email and message
        //The query will insert a new row into the contact_form table with the provided values
        return "INSERT INTO contact_form VALUES ('"+email+"', '"+message+"')";
    }

}
