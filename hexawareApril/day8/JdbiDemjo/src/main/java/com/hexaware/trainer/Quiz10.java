package com.hexaware.trainer;

public class Quiz10
{
    static {
        System.out.println("Static Constructor...");
    }
    Quiz10() {
        System.out.println("Instance Constructor...");
    }
    public static void main(String[] args) {
        new Quiz10();
    }
}
