package com.hexaware.trainer;
/**
* Program Switch Case.
* @author Prasanna.
*/
public class Menu {
    public void show(int choice) {
        switch(choice) {
            case 1 : 
                System.out.println("Hi I am Sougata");
                break;
            case 2 : 
                System.out.println("HI I am Chandana");
                break;
            case 3 : 
                System.out.println("Hi I am Raj");
                break;
            case 4 : 
                System.out.println("Hi I am Aman");
                break;
            default : 
                System.out.println("Invalid Choice");
                break;
        }
    }
    public static void main(String[] args) {
        int choice=2;
        new Menu().show(choice);
    }
}