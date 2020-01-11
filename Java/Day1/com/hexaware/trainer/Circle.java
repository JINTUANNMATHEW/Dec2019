package com.hexaware.trainer;
/**
* Program for area & circ of circle.
* @author Prasanna.
*/
public class Circle {
    public void calc(double radius) {
        double area,circ;
        area=Math.PI*radius*radius;
        circ=2*Math.PI*radius;
        System.out.println("Area of Circle " +area);
        System.out.println("Circumference " +circ);
    }
    public static void main(String[] args) {
        double radius = 12.5;
    }
}