package com.hexaware.trainer;

public class Quiz6
{
    int x;
    public static void main( String[] args )
    {
        Quiz6 obj1 = new Quiz6();
        obj1.x=12;
        Quiz6 obj2 = obj1;
        obj2.x=13;
        System.out.println(obj1.x);
    }
}
