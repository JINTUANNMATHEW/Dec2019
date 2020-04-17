package com.hexaware.trainer;

/**
 * Hello world!
 *
 */
enum Test {
    A, B, X, Y, P, C;
    private Test() {
        System.out.println("Hi");
    }
}
public class EnumEx 
{
    public static void main( String[] args )
    {
        Test t = Test.Y;
    }
}
