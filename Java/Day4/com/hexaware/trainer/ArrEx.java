package com.hexaware.trainer;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
* Program to ArrayExceptions.
* @author Prasanna.
*/
public class ArrEx {
    public static void main(String[] args) {
        int[] a={12,5};
        try {
            a[10]=67;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Size Small");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}