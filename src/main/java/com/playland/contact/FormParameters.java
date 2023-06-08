package com.playland.contact;

public class FormParameters {

    private static String firstname;
    private static String lastname;
    private static String email;
    private static String message;


    /**
     * Constructs an instance of setFormParameters with the provided values.
     *
     * @param firstname The firstname entered in the form
     * @param lastname The lastname entered in the form
     * @param email The email entered in the form
     * @param message The message entered in the form
     */
    public void setFormParameters(String firstname, String lastname, String email, String message){
        FormParameters.firstname = firstname;
        FormParameters.lastname = lastname;
        FormParameters.email = email;
        FormParameters.message = message;
    }

    /**
     * Retrieves the firstname entered in the form
     * @return The firstname as a string
     */
    public String getFirstname(){
        return firstname;
    }

    /**
     * Retrieves the lastname entered in the form
     * @return The lastname as a string
     */
    public String getLastname(){
        return lastname;
    }

    /**
     * Retrieves the email address entered in the form
     * @return The email address as a string
     */
    public String getEmail(){
        return email;
    }

    /**
     * Retrieves the message entered in the form
     * @return The message as a string
     */
    public String getMessage(){
        return message;
    }
}
