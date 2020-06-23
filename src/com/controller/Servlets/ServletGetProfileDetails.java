package com.controller.Servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletGetProfileDetails")
public class ServletGetProfileDetails extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.print("user name in profile :"+request.getSession().getAttribute("username"));

        RequestDispatcher requestDispatcher=request.getRequestDispatcher("perfile.jsp");
        requestDispatcher.forward(request,response);

    }
}
