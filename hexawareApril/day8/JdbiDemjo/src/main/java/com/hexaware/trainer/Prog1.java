package com.hexaware.trainer;

/**
 * Hello world!
 *
 */
public class Prog1 
{
    public void show(int x) {
        System.out.println("Show w.r.t. Integer " +x);
    }
    public void show(double x) {
        System.out.println("Show w.r.t. Double " +x);
    }
    public void show(String x) {
        System.out.println("Show w.r.t. String " +x);
    }
    public static void main( String[] args )
    {
        Prog1 obj = new Prog1();
        obj.show(12);
        obj.show(12.6);
        obj.show("Vedant");
    }
}
