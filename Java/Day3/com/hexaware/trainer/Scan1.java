package com.hexaware.trainer;
import java.util.Scanner;

/**
* Program to Scanner Class.
* @author Prasanna.
*/
public class Scan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter Your Name  ");
        name=sc.next();
        System.out.println("Name is " +name);
    }
}