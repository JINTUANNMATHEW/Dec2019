package com.hexaware.trainer;

/**
* Program to Checked Exception.
* @author Prasanna.
*/

public class DbConnection {
    public void check() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }
    public static void main(String[] args) {
        
    }
}