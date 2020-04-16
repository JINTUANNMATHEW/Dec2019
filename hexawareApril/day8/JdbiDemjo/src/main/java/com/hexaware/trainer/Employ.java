package com.hexaware.trainer;

public class Employ
{
    int empno;
    String name; 
    double basic;
    @Override
    public String toString() {
        return "Empno " +empno+ " Name " +name+ " Basic " +basic;
    }
    public static void main( String[] args )
    {
        Employ employ = new Employ();
        employ.empno=1;
        employ.name="Vedant";
        employ.basic=82344;

        System.out.println(employ);
    }
}
