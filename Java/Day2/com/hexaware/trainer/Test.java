package com.hexaware.trainer;
/**
* Program method Overloading.
* @author Prasanna.
*/

public class Test {
    public void show(int x) {
        System.out.println("Show w.r.t. Integer "+x);
    }
    public void show(String x) {
        System.out.println("Show w.r.t. String " +x);
    }
    public void show(boolean x) {
        System.out.println("Show w.r.t. Boolean " +x);
    }
    public static void main(String[] args) {
        Test obj = new Test();
        obj.show(12);
        obj.show("Hexaware"); 
        obj.show(true);
    }
}