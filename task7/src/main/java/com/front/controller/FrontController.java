package com.front.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//The Front Controller Design Pattern is a design pattern commonly used in web applications.
//It centralizes request handling in a single controller, allowing for a more organized way to manage requests and responses.
//This pattern provides a uniform interface for handling
//all requests, making it easier to manage common tasks like authentication, logging, and response formatting

@WebServlet("/controller")
public class FrontController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        
        if ("home".equals(action)) {
            request.getRequestDispatcher("/home").forward(request, response);
        }
         else {
            response.getWriter().println("Invalid action!");
        }
    }
}