package com.hexaware.trainer;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Enum2
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Paymode  ");
        String pm = sc.next();
        WalletType wt = WalletType.valueOf(pm);
        System.out.println(wt);
    }
}
