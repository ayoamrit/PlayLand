package com.playland.contact;

import java.io.*;
import java.sql.SQLException;

import com.playland.database.SqlDataHandler;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.jetbrains.annotations.NotNull;

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
    public void doPost(@NotNull HttpServletRequest request, HttpServletResponse response) throws IOException {

        //Retrieving parameters from the request object
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        //Creating a new instance of FormParameters with the retrieved values
        formParameters = new FormParameters();
        formParameters.setFormParameters(firstname, lastname, email, message);

        PrintWriter out = response.getWriter();

        try{
            SqlDataHandler sqlDataHandler = new SqlDataHandler();

            //Send contact data to the Sql database
            sqlDataHandler.sendContactData();

            //Generate an alert for successful request submission
            generateAlert(out, "Request Success: The request has been submitted.");
        }catch(SQLException e){
            //Generate an alert for database connection error
            generateAlert(out, "Request Error: Unable to connect to the server.");
        }
    }

    //Generates an alert using JavaScript to display a message and redirect to 'contact.html'
    private void generateAlert(@NotNull PrintWriter out, String message){
        out.println("<script type=\"text/javascript\">");
        out.println("alert('"+message+"');");
        out.println("location='contact.html';");
        out.println("</script>");
    }

}
