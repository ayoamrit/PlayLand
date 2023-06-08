package com.playland.cart;

public class CartParameters {

    private static String firstname;
    private static String lastname;
    private static String email;
    private static double total;
    private static int quantity;
    public void setCartParameters(String firstname, String lastname, String email, double total, int quantity){
        CartParameters.firstname = firstname;
        CartParameters.lastname = lastname;
        CartParameters.email = email;
        CartParameters.total = total;
        CartParameters.quantity = quantity;
    }

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
