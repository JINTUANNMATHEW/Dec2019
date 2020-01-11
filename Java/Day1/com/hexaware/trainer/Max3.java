package com.hexaware.trainer;
/**
* Program max of 3 nos.
* @author Prasanna.
*/
public class Max3 {
    public void check(int a,int b,int c) {
        int m=a;
        if (m < b) {
            m=b;
        }
        if (m < c) {
            m=c;
        }
        System.out.println("Max is " +m);
    }
    public static void main(String[] args) {
        int a, b, c;
        a = 5;
        b = 7;
        c= 3;
        new Max3().check(a,b,c);
    }
}