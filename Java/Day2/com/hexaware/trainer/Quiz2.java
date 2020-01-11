package com.hexaware.trainer;
/**
* Program to Overloading.
* @author Prasanna.
*/

public class Quiz1 {
    public void show(Object x) {
        System.out.println("Object " +x);
    }
    public void show(int x) {
        System.out.println("Integer " +x);
    }
    public static void main(String[] args) {
        int a=12;        
        Quiz1 obj=new Quiz1();
        obj.show(a);
    }
}