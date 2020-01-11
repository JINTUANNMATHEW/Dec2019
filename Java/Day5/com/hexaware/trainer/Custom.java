package com.hexaware.trainer;

/**
* Program to Custom Exception class.
* @author Prasanna.
*/

class NegativeException extends Exception {
    NegativeException(String error) {
        super(error);
    }
}

class NumberZeroException extends Exception {
    NumberZeroException(String error) {
        super(error);
    }
}

public class Custom {
    public void calc(int a,int b) throws
            NumberZeroException, NegativeException {
        if(a < 0 || b < 0) {
            throw new 
       NegativeException("Negative Nos Not Allowed");
        } else if(a == 0 || b == 0) {
            throw new 
       NumberZeroException("Zero is Invalid Value");
        } else {
            int c = a+b;
            System.out.println("Sum is  " +c);
        }
    }
    public static void main(String[] args) {
        Custom obj = new Custom();
        try{
            obj.calc(12, 0);
        } catch(NegativeException 
            | NumberZeroException e) {
            e.printStackTrace();
        }
        
    }
}