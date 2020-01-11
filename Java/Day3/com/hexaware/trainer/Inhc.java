package com.hexaware.trainer;
import com.hexaware.model.Employ;
/**
* Program Inheritance Constructor.
* @author Prasanna.
*/
class C1 {
    C1() {
        System.out.println("Base class Constructor");
    }
}
class C2 extends C1 {
    C2() {
        System.out.println("Derived Class Constructor");
    }
}
public class Inhc {
    public static void main(String[] args) {
        C2 obj = new C2();
    }
}