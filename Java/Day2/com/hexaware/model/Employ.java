package com.hexaware.model;

/**
* Program to Employ Model Class.
* @author Prasanna.
*/

public class Employ {
    public int empno;
    public String name;
    public double basic;

    @Override
    public String toString() {
        return "Empno " +empno+ " Name " +name+ 
                " Salary " +basic;
    }
}