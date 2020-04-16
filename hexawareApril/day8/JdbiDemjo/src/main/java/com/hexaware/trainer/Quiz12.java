package com.hexaware.trainer;

class Demo {
    static {
        System.out.println("Demo Class Static ");
    }
}
public class Quiz12
{
    static {
        System.out.println("Static Constructor...");
    }
    Quiz12() {
        System.out.println("Instance Constructor...");
    }
    public static void main(String[] args) {
        new Quiz12();
    }
}
