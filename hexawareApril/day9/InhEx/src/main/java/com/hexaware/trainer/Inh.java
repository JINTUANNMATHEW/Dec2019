package com.hexaware.trainer;

/**
 * Hello world!
 *
 */

class First {
    public void show() {
        System.out.println("Show From Class First...");
    }
}

class Second extends First {
    public void show() {
        System.out.println("Show From Class Second...");
    }
}
public class Inh 
{
    public static void main( String[] args )
    {
        // First obj = new Second();
        // obj.show();
        // First obj = (First)new Second();
        // obj.show();
        First obj = (Second)new Second();
        obj.show();
    }
}
