package com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {

    private static String USERNAME="user";
    private static String PASSWORD="123";
    private static final String URL="jdbc:mysql://localhost:3306/linkedin?useTimezone=true&serverTimezone=UTC";

    public static Connection GetConnnection(){


        Connection con=null;
        try{

            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(URL,USERNAME,PASSWORD);

        }catch (SQLException e){
            System.out.print("Connection Failed ¡Check out console");
            e.printStackTrace();
        }catch (ClassNotFoundException e1){
            System.out.print("Where is my jdbc driver");
        }


        return con;

    }

}
