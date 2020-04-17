package com.hexaware.trainer;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Enum3
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter DayName  ");
        String pm = sc.next();
        Days d = Days.valueOf(pm);
        System.out.println(d);
    }
}
