package com.hexaware.trainer;
/**
* Program Array of strings.
* @author Prasanna.
*/
public class ArrayDemo2 {
    public void show() {
        String[] names=new String[] {
            "Niharika","Rahul","Raj","Chandana",
            "Aman"
        };
        for(String s : names) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        new ArrayDemo2().show();
    }
}