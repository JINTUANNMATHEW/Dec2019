package com.hexaware.trainer;

class Emp {
    int empno;
    String name;
    double basic;

    public Emp() {
        empno=5;
        name="Deepika";
        basic=85222;
    }

    public Emp(int argEmpno, String argName,double argBasic) {
        this.empno=argEmpno;
        this.name=argName;
        this.basic=argBasic;
    }

    @Override
    public String toString() {
        return "Empno " +empno + " Name " +name+ " Basic " +basic;
    }
}    
public class ConEx 
{
    public static void main( String[] args )
    {
        Emp emp1 = new Emp();
        System.out.println(emp1);

        Emp emp2 = new Emp(9,"Jintu",88234);
        System.out.println(emp2);
    }
}
