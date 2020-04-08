package com.hexaware.trainer;

import java.util.Objects;

public class Employ {
    private int empno;
    private String name;
    private String dept;
    private String desig;
    private int basic;

    public Employ() {   
    }

    @Override
    public int hashCode() {
        return Objects.hash(empno, name, dept, desig, basic);
    }
    public Employ(int argEmpno, 
                  String argName,
                  String argDept, String argDesig,
                    int argBasic) {
        this.empno = argEmpno;
        this.name = argName;
        this.dept = argDept;
        this.desig = argDesig;
        this.basic = argBasic;
    }

    @Override
    public String toString() {
        return "Employ No " + empno + " Name " + name + " Department " + dept + 
            " Desination " + desig + " Salary " +basic;
    }
    @Override
    public boolean equals(Object obj) {
        Employ employ = (Employ)obj;
        if (employ.empno == empno &&
            employ.name == name && 
            employ.dept == dept && 
            employ.desig == desig && 
            employ.basic == basic
        ) {
            return true;
        }
        else {
            return false;
        }
    }
    public int getEmpno() {
        return empno;
    }
    public void setEmpno(int argEmpno) {
        this.empno = argEmpno;
    }
    public String getName() {
        return name;
    }
    public void setName(String argName) {
        this.name = argName;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String argDept) {
        this.dept = argDept;
    }
    public String getDesig() {
        return desig;
    }
    public void setDesig(String argDesig) {
        this.desig = argDesig;
    }
    public int getBasic() {
        return basic;
    }
    public void setBasic(int argBasic) {
        this.basic=argBasic;
    }
}