package com.hexaware.trainer;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
* Program to Abstract class Demo.
* @author Prasanna.
*/
public class Div {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter 2 Nos ");
        Scanner sc=new Scanner(System.in);
        try {
            a=sc.nextInt();
            b=sc.nextInt();
            c=a/b;
            System.out.println("Division " +c);         
        } catch(InputMismatchException e) {
            System.out.println("Only Numbers...");
        } catch(ArithmeticException e) {
            System.out.println("Division by zero not possible");
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("From Maverics");
        }
        
    }
}