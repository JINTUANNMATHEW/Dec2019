package com.hexaware.trainer;

public class Quiz1 
{
    public void show(int x) {
        System.out.println("Show w.r.t. Integer " +x);
    }
    public void show(Object x) {
        System.out.println("Show w.r.t. Object " +x);
    }
   
    public static void main( String[] args )
    {
        Prog1 obj = new Prog1();
        obj.show(12);
      
    }
}
