package com.playland.cart;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

@WebServlet(name = "purchaseServlet", value = "/purchaseServlet")
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
    }
}
