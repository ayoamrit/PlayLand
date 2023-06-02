package com.playland.contact;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "contactServlet", value = "/contact-servlet")
public class ContactServlet extends HttpServlet{

    private static FormParameters formParameters;

    /**
     * Handles the HTTP POST request.
     *
     * @param request The HTTPServletRequest object containing the request parameters.
     * @param response The HTTPServletResponse object for sending the response.
     * @throws IOException If an I/P error occurs while processing the request.
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //Retrieving parameters from the request object
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        //Creating a new instance of FormParameters with the retrieved values
        formParameters = new FormParameters(firstname, lastname, email, message);

    }

}
