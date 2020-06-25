package com.controller.Servlets;

import com.config.ConnectionDb;
import com.controller.Dao.UserDao;
import com.controller.tools.Encript;
import com.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet( "/ServletLogin")
public class ServletLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Encript encript=new Encript();
        UserDao dao=new UserDao();

        String user=request.getParameter("userName");
        String pass=request.getParameter("userPass");


        User user1Ob=new User(user,pass);
        Connection con=(Connection)getServletContext().getAttribute("connectionDb");

        if(dao.Validate(user1Ob,con)){
            HttpSession sesion=request.getSession();


                //set the username as an atribute
                sesion.setAttribute("username",user);


            RequestDispatcher requestDispatcher=request.getRequestDispatcher("employees.jsp");
            requestDispatcher.forward(request,response);

        }else{
            //check if the user is invalid and set up an error message
            String error="invalidate credentials, please login again";
            request.setAttribute("error",error);
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("login.jsp");
            requestDispatcher.forward(request,response);


        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher requestDispatcher=request.getRequestDispatcher("login.jsp");
        requestDispatcher.forward(request,response);

    }
}
