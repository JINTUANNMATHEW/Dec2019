package com.hexaware.trainer;

/**
 * Hello world!
 *
 */

class C1 {
    public C1() {
        System.out.println("Hello");
    }
}

class C2 extends C1 {
    public  C2() {
        System.out.println("Hi");
    }
}
public class Quiz1 
{
    public static void main( String[] args )
    {
        new C2();
    }
}
