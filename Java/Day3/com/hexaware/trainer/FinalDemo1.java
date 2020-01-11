package com.hexaware.trainer;
/**
* Program to final class example.
* @author Prasanna.
*/
final class Admin {
    void show() {
        System.out.println("Hi");
    }
}
class Sridhar extends Admin {

}
public class FinalDemo1 {
    public static void main(String[] args) {
        Sridhar obj = new Sridhar();
    }
}