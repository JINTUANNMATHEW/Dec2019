package com.hexaware.trainer;
import com.hexaware.model.Employ;
import java.util.Scanner;
import com.hexaware.factory.EmployFactory;


public class SearchEmployMain {

    public static void main(String[] args) {
        int empno;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employ Number  ");
        empno = sc.nextInt();
        Employ employ=EmployFactory.showEmploy(empno);
        if (employ != null) {
            System.out.println(employ);
        } else {
            System.out.println("Record Not Found...");
        }
        Runtime.getRuntime().halt(0);
    }
}