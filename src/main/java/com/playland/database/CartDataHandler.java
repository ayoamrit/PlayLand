package com.playland.database;

import com.playland.cart.CartParameters;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import java.time.LocalDate;

import java.sql.SQLException;

public class CartDataHandler extends SqlConnector{

    CartParameters cartParameters = null;

    public void sendCartData() throws SQLException {
        cartParameters = new CartParameters();

        String firstname = cartParameters.getFirstname();
        String lastname = cartParameters.getLastname();
        String email = cartParameters.getEmail();
        double total = cartParameters.getTotal();
        int quantity = cartParameters.getQuantity();

        String informationQuery = getInformationQuery(firstname,lastname,email);
        String cartQuery = getCartQuery(email, total, quantity);

        if(!checkInfoExistence(email)){
            getStatement().executeUpdate(informationQuery);
            getStatement().executeUpdate(cartQuery);
        }else{
            getStatement().executeUpdate(cartQuery);
        }
    }

    private boolean checkInfoExistence(String value) throws SQLException{
        return getStatement().executeQuery("SELECT * FROM customer_info WHERE EMAIL = '" + value + "'").next();
    }

    //Generate the query to insert customer information into the database
    @Contract(pure = true)
    private @NotNull String getInformationQuery(String firstname, String lastname, String email){
        //Create an INSERT query with the provided values for firstname, lastname, and email
        //The query will insert a new row into the customer_info table with the provided values
        return "INSERT INTO customer_info VALUES ('"+firstname+"', '"+lastname+"', '"+email+"')";
    }

    @Contract(pure = true)
    private @NotNull String getCartQuery(String email, double total, int quantity){
        LocalDate localDate = LocalDate.now();

        return "INSERT INTO purchase_history VALUES ('"+email+"',"+quantity+","+localDate+","+total+")";
    }
}
