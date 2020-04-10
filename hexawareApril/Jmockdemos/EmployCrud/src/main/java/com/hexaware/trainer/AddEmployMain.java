package com.hexaware.trainer;
import com.hexaware.model.Employ;
import java.util.Scanner;
import com.hexaware.factory.EmployFactory;


public class AddEmployMain {

    public static void main(String[] args) {
        int empno;
        Scanner option = new Scanner(System.in);
        Employ employ = new Employ();
        System.out.println("Enter Employ No  ");
        employ.setEmpno(option.nextInt());
        System.out.println("Enter Name  ");
        employ.setName(option.next());
        System.out.println("Enter Department  ");
        employ.setDept(option.next());
        System.out.println("Enter Designation ");
        employ.setDesig(option.next());
        System.out.println("Enter Salary  ");
        employ.setBasic(option.nextInt());
        String result = EmployFactory.addEmploy(employ);
        System.out.println(result);
        Runtime.getRuntime().halt(0);
    }
}