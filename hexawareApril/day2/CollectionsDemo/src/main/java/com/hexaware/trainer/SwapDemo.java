package com.hexaware.trainer;

class Demo<T>{
    public void swap(T a,T b) {
        T t;
        t=a;
        a=b;
        b=t;
        System.out.println("A value " +a+ " B value " +b);
    }
}
public class SwapDemo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        int a=5;
        int b=7;
        obj.swap(a,b);
        String s1="Sravan", s2="Rithin";
        obj.swap(s1,s2);
        boolean f1=true, f2=false;
        obj.swap(f1,f2);
    }
}