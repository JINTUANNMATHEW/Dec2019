package com.hexaware.model;
import com.hexaware.persistence.DbConnection;

public class Employ{
    private int empno;
    private String name;
    private String dept;
    private String desig;
    public int basic;

 /**
 * @param argEmpno to initialize employ No.
 * @param argName to initialize employ name.
 * @param argDept to initialize employ dept.
 * @param argDesig to initialize employ Desig.
 * @param argBasic to initialize employ basic.
 * used to get details through constructor.
 */
  public Employ(int argEmpno, String argName,
        String argDept,
        String argDesig,
        int argBasic) {
    this.empno = argEmpno;
    this.name = argName;
    this.dept = argDept;
    this.desig = argDesig;
    this.basic = argBasic;
  }
 
  @Override
  public String toString() {
      return String.format("%10s %10s %10s %10s %10s",
        empno, name, dept, desig, basic);
      
  }
}