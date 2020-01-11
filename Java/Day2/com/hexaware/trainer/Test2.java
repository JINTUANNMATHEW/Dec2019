package com.hexaware.trainer;
/**
* Program to Boxing and Unboxing.
* @author Prasanna.
*/
public class Test2 {
    public void check(Object ob) {
        if(ob=="XYZ") {
            System.out.println("Hi");
        } else {
            System.out.println("Bye");
        }
    }
    public static void main(String[] args) {
        String a="XYZ";
        Test1 obj = new Test1();
        obj.check(a);
    }
}