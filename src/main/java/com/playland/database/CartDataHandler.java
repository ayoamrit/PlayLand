package com.playland.database;

import com.playland.cart.CartParameters;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import java.time.LocalDate;

import java.sql.SQLException;

public class CartDataHandler extends SqlConnector{

    CartParameters cartParameters = null;

    //Send cart data to the database
    public void sendCartData() throws SQLException {
        cartParameters = new CartParameters();

        //Retrieve cart parameters from the CartParameters object
        String firstname = cartParameters.getFirstname();
        String lastname = cartParameters.getLastname();
        String email = cartParameters.getEmail();
        double total = cartParameters.getTotal();
        int quantity = cartParameters.getQuantity();

        //Generate queries for customer information and cart data
        String informationQuery = getInformationQuery(firstname,lastname,email);
        String cartQuery = getCartQuery(email, total, quantity);

        if(!checkInfoExistence(email)){
            //If the customer information does not exist, insert it into the database
            getStatement().executeUpdate(informationQuery);
            getStatement().executeUpdate(cartQuery);
        }else{
            //If customer information already exists, only insert the cart data into the database
            getStatement().executeUpdate(cartQuery);
        }
    }

    //Check if customer information already exists in the database
    private boolean checkInfoExistence(String value) throws SQLException{
        //Execute a SELECT query to check if a row with the given email exists in the customer_info table
        //If a row is returned, it means the customer information exists
        return getStatement().executeQuery("SELECT * FROM customer_info WHERE EMAIL = '" + value + "'").next();
    }

    //Generate the query to insert customer information into the database
    @Contract(pure = true)
    private @NotNull String getInformationQuery(String firstname, String lastname, String email){
        //Create an INSERT query with the provided values for firstname, lastname, and email
        //The query will insert a new row into the customer_info table with the provided values
        return "INSERT INTO customer_info VALUES ('"+firstname+"', '"+lastname+"', '"+email+"')";
    }

    //Generate the query to insert cart data into the database
    @Contract(pure = true)
    private @NotNull String getCartQuery(String email, double total, int quantity){
        //Get the current date
        LocalDate localDate = LocalDate.now();

        //Create an INSERT query with the provided values for email, total, quantity, and the current date
        //The query will insert a new row into the purchase_history table with the provided values
        return "INSERT INTO purchase_history VALUES ('"+email+"',"+quantity+", '"+localDate+"','"+total+"')";
    }
}
