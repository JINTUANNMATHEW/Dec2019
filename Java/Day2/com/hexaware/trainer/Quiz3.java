package com.hexaware.trainer;
/**
* Program to Overloading.
* @author Prasanna.
*/

public class Quiz3 {
    public void show(Object x) {
        System.out.println("Object " +x);
    }
    public void show(int x) {
        System.out.println("Int " +x);
    }
    public static void main(String[] args) {
        boolean flag=true;
        Quiz3 obj=new Quiz3();
        obj.show(flag);
    }
}