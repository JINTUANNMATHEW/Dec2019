package com.hexaware.trainer;
import com.hexaware.model.Employ;
import com.hexaware.factory.EmployFactory;


public class ShowEmployMain {

    public static void main(String[] args) {
        Employ[] employList=EmployFactory.showEmploy();
        for(Employ employ : employList) {
            System.out.println(employ);
        }
        Runtime.getRuntime().halt(0);
    }
}