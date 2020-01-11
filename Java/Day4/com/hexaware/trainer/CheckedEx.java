package com.hexaware.trainer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
* Program to ArrayExceptions.
* @author Prasanna.
*/
public class CheckedEx {
    public void check() throws FileNotFoundException {
        FileInputStream fin=new 
            FileInputStream("d:/hello.txt");
    }
    public static void main(String[] args) {
        CheckedEx obj = new CheckedEx();
        try {
            obj.check();
        } catch(FileNotFoundException e) {
            System.out.println("File Not Exist");
        }
        
    }
}