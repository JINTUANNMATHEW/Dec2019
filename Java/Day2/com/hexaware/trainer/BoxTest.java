package com.hexaware.trainer;
/**
* Program to Boxing and Unboxing.
* @author Prasanna.
*/
public class BoxTest {
    public void show(Object ob) {
        String type=ob.getClass().getSimpleName();
       // String type=ob.getClass().getName();
        System.out.println(type);
        if(type.equals("Integer")) {
            System.out.println("Integer Casting...");
            int x=(Integer)ob;
        }
        if(type.equals("Double")) {
            System.out.println("Double Casting...");
            double x=(Double)ob;
        }
        if(type.equals("String")) {
            System.out.println("String Casting...");
            String x=(String)ob;
        }
    }
    public static void main(String[] args) {
        int a=12;
        double b=12.5;
        String name="hexaware";
        BoxTest obj = new BoxTest();
        obj.show(a);
        obj.show(name);
        obj.show(b);
    }
}