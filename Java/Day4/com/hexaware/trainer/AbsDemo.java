package com.hexaware.trainer;
/**
* Program to Abstract class Demo.
* @author Prasanna.
*/
abstract class Training {
    abstract void name();
    abstract void email();
}
class Keerthi extends Training {
    @Override 
    public void name() {
        System.out.println("Name is Keerthi...");
    }
    @Override
    public void email() {
        System.out.println("Email is Keerthi@gmail.com");
    }
}
class Niharika extends Training {
    @Override
    public void name() {
        System.out.println("Name is Niharika...");
    }
    @Override 
    public void email() {
        System.out.println("Email Niharika@gmail.com");
    }
}
public class AbsDemo {
    public static void main(String[] args) {
        Training[] arr=new Training[]{
            new Niharika(), new Keerthi()
        };
        for(Training t : arr) {
            t.name();
            t.email();
        }
    }
}