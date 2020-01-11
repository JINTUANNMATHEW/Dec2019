package com.hexaware.trainer;
/**
* Program to overloading.
* @author Prasanna.
*/
public class Demo {
    public int sum() {
        return 5;
    }
    public int sum(int x) {
        return x+5;
    }
    public int sum(int x,int y) {
        return x+y;
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println(obj.sum());
        System.out.println(obj.sum(53));
        System.out.println(obj.sum(567,33));
    }
}