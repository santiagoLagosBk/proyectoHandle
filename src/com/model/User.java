package com.model;

public class User {


    private String user;
    private String password;
    private String firstName;
    private String LastName;

    public User(String user, String password, String firstName, String lastName) {
        this.user = user;
        this.password = password;
        this.firstName = firstName;
        LastName = lastName;
    }
    public User(String user, String password){
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
