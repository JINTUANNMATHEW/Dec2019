package com.hexaware.trainer;
/**
* Program Factorial.
* @author Prasanna.
*/

public class Fact {
    public void calc(int n) {
        int i=1;
        int f=1;
        while(i <= n) {
            f=f*i;
            i++;
        }
        System.out.println("Factorial " +f);
    }
    public static void main(String[] args) {
        int n=6;
        new Fact().calc(n);
    }
}