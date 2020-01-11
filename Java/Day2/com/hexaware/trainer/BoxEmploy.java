package com.hexaware.trainer;
import com.hexaware.model.Employ;
/**
* Program to Boxing and Unboxing.
* @author Prasanna.
*/
public class BoxEmploy {
    public void show(Object ob) {
        Employ e=(Employ)ob;
        System.out.println(e);
    }
    public static void main(String[] args) {
        Employ employ = new Employ();
        employ.empno = 1;
        employ.name = "Sougata";
        employ.basic = 88424;
        BoxEmploy obj = new BoxEmploy();
        obj.show(employ);
    }
}