package com.hexaware.trainer;
/**
* Program to Boxing and Unboxing.
* @author Prasanna.
*/
public class Test1 {

    public void check(Object ob) {
        if(ob==12) {
            System.out.println("Hi");
        } else {
            System.out.println("Bye");
        }
    }
    public static void main(String[] args) {
        int a=12;
        Test1 obj = new Test1();
        obj.check(a);
    }
}