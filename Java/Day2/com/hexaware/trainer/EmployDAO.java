package com.hexaware.trainer;
import com.hexaware.model.Employ;

/**
* Program to Employ Details Class.
* @author Prasanna.
*/
public class EmployDAO {
    public static void main(String[] args) {
        Employ employ = new Employ();
        employ.empno=1;
        employ.name="Sougata";
        employ.basic=94333;
        System.out.println(employ);        
    }
}