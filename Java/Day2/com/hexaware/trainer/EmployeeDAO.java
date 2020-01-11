package com.hexaware.trainer;
import com.hexaware.model.Employee;
/**
* Program to Constructor Demo.
* @author Prasanna.
*/
public class EmployeeDAO {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Sivani",
          88543);
        System.out.println(employee);
    }
}