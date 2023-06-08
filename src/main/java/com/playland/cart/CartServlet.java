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

@WebServlet(name = "cartServlet", value = "/cart-servlet")
public class CartServlet extends HttpServlet {

    private static CartParameters cartParameters;

    public void doPost(@NotNull HttpServletRequest request, HttpServletResponse response) throws IOException{
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        double total = Double.parseDouble(request.getParameter("cart-total"));
        int quantity = Integer.parseInt(request.getParameter("cart-quantity"));

        cartParameters = new CartParameters();
        cartParameters.setCartParameters(firstname, lastname, email, total, quantity);

        PrintWriter out = response.getWriter();

        try{
            CartDataHandler cartDataHandler = new CartDataHandler();
            cartDataHandler.sendCartData();


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
        out.println("location='cart.html';");
        out.println("</script>");
    }
}
