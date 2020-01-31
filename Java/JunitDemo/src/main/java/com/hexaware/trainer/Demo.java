package com.hexaware.trainer;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static String propertyList(String key){
		Map<String,String> m=new
         HashMap<String,String>();
		m.put("Meena","Java");
		m.put("Bhargav","Reddy");
		m.put("Harish","K");
		m.put("Sai","Bharath");
		return m.get(key);
	}
    public static boolean evenodd(int n) {
        if (n%2==0) {
            return true;
        } else {
            return false;
        }
    }
    public static int max3(int a, int b, int c) {
        int m=a;
        if(m < b) {
            m=b;
        }
        if(m < c) {
            m=c;
        }
        return m;
    }
    public static int sum(int x,int y) {
        return x+y;
    }
    public static String sayHello() {
        return "Welcome to Junit 5.0";
    }
}