package com.hexaware.trainer;
/**
* Program to Constructor Demo.
* @author Prasanna.
*/
public class ConDemo {
    static {
        System.out.println("Static Constructor...");
    }
    ConDemo() {
        System.out.println("General Constructor...");
    }
    public static void main(String[] args) {
        ConDemo obj = new ConDemo();
    }
}