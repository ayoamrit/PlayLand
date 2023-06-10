package com.playland.cart;

public class CartParameters {

    //Declare static variable to hold the cart parameters
    private static String firstname;
    private static String lastname;
    private static String email;
    private static double total;
    private static int quantity;

    //Setter method to set the cart parameters
    public void setCartParameters(String firstname, String lastname, String email, double total, int quantity){
        //Assign the parameters values to the corresponding static variables
        CartParameters.firstname = firstname;
        CartParameters.lastname = lastname;
        CartParameters.email = email;
        CartParameters.total = total;
        CartParameters.quantity = quantity;
    }

    //Getter methods to access the cart parameters
    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public String getEmail(){
        return email;
    }

    public double getTotal(){
        return total;
    }

    public int getQuantity(){
        return quantity;
    }
}
