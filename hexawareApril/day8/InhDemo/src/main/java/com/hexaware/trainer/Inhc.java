package com.hexaware.trainer;

/**
 * Hello world!
 *
 */

class C1 {
    static {
        System.out.println("Base class Static...");
    }
    C1() {
        System.out.println("Base Class Constructor...");
    }
}
class C2 extends C1 {
    static {
        System.out.println("Derived class Static...");
    }

    C2() {
        System.out.println("Derived Class Constructor...");
    }
}
public class Inhc 
{
    public static void main( String[] args )
    {
        C2 obj = new C2();
      
    }
}
