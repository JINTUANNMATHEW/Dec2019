package com.hexaware.trainer;
import com.hexaware.model.Employ;
/**
* Program to == (vs) equals.
* @author Prasanna.
*/

public class EmployDAO {
    public static void main(String[] args) {
        Employ e1 = new Employ(1, "Aman", 84234);
        Employ e2 = new Employ(3, "Raj",84234);
        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));      

        Employ e3 = new Employ(1, "Aman",84234);
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());
             
    }
}