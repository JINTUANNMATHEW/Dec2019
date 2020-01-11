package com.hexaware.trainer;
/**
* Program static method.
* @author Prasanna.
*/

public class Demo {
    public void show() {
        System.out.println("From Show Method...");
    }
    public static void display() {
        System.out.println("From Display Method...");
    }
    public static void main(String[] args) {
        Demo.display();
        new Demo().show();
    }
}