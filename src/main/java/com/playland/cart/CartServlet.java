package com.playland.cart;


import com.playland.database.CartDataHandler;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.DecimalFormat;

@WebServlet(name = "cartServlet", value = "/cart-servlet")
public class CartServlet extends HttpServlet {

    private static CartParameters cartParameters;

    /**
     * Handles the HTTP POST request.
     *
     * @param request The HTTPServletRequest object containing the request parameters.
     * @param response The HTTPServletResponse object for sending the response.
     * @throws IOException If an I/P error occurs while processing the request.
     */
    public void doPost(@NotNull HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Get the parameters from the request
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String total = request.getParameter("cart-total");

        //Parse the quantity parameters as an integers
        int quantity = Integer.parseInt(request.getParameter("cart-quantity"));

        //Create an instance of CartParameters and set the values
        cartParameters = new CartParameters();
        cartParameters.setCartParameters(firstname, lastname, email, Double.parseDouble(total), quantity);

        //Get the PrintWriter object to send response back to the client
        PrintWriter out = response.getWriter();

        try{
            //Create an instance of CartDataHandler to handle the cart data
            CartDataHandler cartDataHandler = new CartDataHandler();
            cartDataHandler.sendCartData();

            //Generate an alert for successful request submission
            generateAlert(out, "You're all set: Your purchase was successful.");
        }catch(SQLException e){
            //Generate an alert for database connection error
            generateAlert(out, "Error: Your purchase could not be completed.");
        }
    }

    //Generates an alert using JavaScript to display a message and redirect to 'contact.html'
    private void generateAlert(@NotNull PrintWriter out, String message){
        out.println("<script type=\"text/javascript\">");
        out.println("alert('"+message+"');");
        out.println("location='cart.html';");
        out.println("</script>");
    }
}
