package com.hexaware.trainer;

/**
 * Hello world!
 *
 */

class First {
    public void show() {
        System.out.println("Show from Class First...");
    }
}
class Second extends First {
    public void display() {
        System.out.println("Display from Class Second...");
    }
}
public class Inh 
{
    public static void main( String[] args )
    {
        Second obj = new Second();
        obj.show();
        obj.display();
    }
}
