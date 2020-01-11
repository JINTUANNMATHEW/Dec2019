package com.hexaware.model;
/**
* Program to Employee model class.
* @author Prasanna.
*/
public class Employee {
    int empno;
    String name;
    double basic;
 /**
  * Default Constructor.
 */
  public Employee() {
  }
  /**
 * @param argEmpno to initialize employ No.
 * @param argName to initialize employ name.
 * @param argBasic to initialize employ basic.
 * used to get details through constructor.
 */
  public Employee(int argEmpno, 
        String argName,
        double argBasic) {
    this.empno = argEmpno;
    this.name = argName;
    this.basic = argBasic;
  }

  @Override
  public String toString() {
      return "Empno " +empno+ " Name " +name+ 
        " Basic " +basic;
  }
}