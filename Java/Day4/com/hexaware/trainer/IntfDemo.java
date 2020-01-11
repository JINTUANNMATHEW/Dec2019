package com.hexaware.trainer;

interface Course {
    void mysql();
    void java();
}

class Raj implements Course {
    @Override
    public void mysql() {
        System.out.println("Mysql 8.0");
    }
    @Override 
    public void java() {
        System.out.println("Java 8");
    }
}

class Madhu implements Course {
    @Override
    public void mysql() {
        System.out.println("Mysql 8.0 for hexaware");
    }
    @Override 
    public void java() {
        System.out.println("Java 8 for maverics");
    }
}
public class IntfDemo {
    public static void main(String[] args) {
        Course[] arr=new Course[]{
            new Raj(),
            new Madhu()
        };
        for(Course c : arr) {
            c.mysql();
            c.java();
        }
    }
}