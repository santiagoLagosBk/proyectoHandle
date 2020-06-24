package com.controller.Dao;

import com.config.ConnectionDb;
import com.controller.tools.Encript;
import com.model.User;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {



    public Boolean Validate(User user){
            boolean ref=false;
        try {
            //create elements needs to the db connection
            Connection con= ConnectionDb.GetConnnection();
            PreparedStatement ps;
            ResultSet rs;
            //Write the query for the database
            String sqlSerchUser="select * from usuario where user=? and password=?";
            //Start with the query
            ps=con.prepareStatement(sqlSerchUser);
            ps.setString(1,user.getUser());
            ps.setString(2,user.getPassword());
            //Execute query
            rs=ps.executeQuery();
            Encript encript=new Encript();
            while (rs.next()){
                user.setFirstName(rs.getString("first_name"));
                user.setLastName(rs.getString("last_name"));
                user.setPassword(encript.decode(rs.getString("password")));
                user.setUser(rs.getString("user"));
                ref=true;

            }


        } catch (SQLException | UnsupportedEncodingException throwables) {
            throwables.printStackTrace();
        }

        return ref;
    }






}
