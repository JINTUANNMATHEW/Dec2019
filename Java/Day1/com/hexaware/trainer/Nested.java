package com.hexaware.trainer;
/**
* Program nested if.
* @author Prasanna.
*/
public class Nested {
    public void check(int a) {
        if(a==1) {
            System.out.println("Hi Its 1");
        } else if(a==2) {
            System.out.println("Hi Its 2");
        } else if(a==3) {
            System.out.println("Hi Its 3");
        } else if(a==4) {
            System.out.println("Hi Its 4");
        } else {
            System.out.println("Invalid No...");
        }
    }
    public static void main(String[] args) {
        int n=2;       
        new Nested().check(n);
    }
}