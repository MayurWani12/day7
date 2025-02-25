package com.servelet.dispatcher;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
        request.setAttribute("message", "Hello from FirstServlet!");

        // Forward the request to SecondServlet
        RequestDispatcher dispatcher = request.getRequestDispatcher("/second");
        dispatcher.forward(request, response);
    }
}
