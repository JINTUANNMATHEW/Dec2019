package com.hexaware.trainer;
/**
* Program to super keyword example.
* @author Prasanna.
*/
class Agent {
    public void show() {
        System.out.println("Show From Agent Class...");
    }
}

class Nevesh extends Agent {
    public void show() {
        super.show();
        System.out.println("Show From Nevesh Class");
    }
}

public class SuperEx1 {
    public static void main(String[] args) {    
        new Nevesh().show();
    }
}