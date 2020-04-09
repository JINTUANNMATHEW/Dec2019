package com.hexaware.trainer;
import java.util.List;
import java.util.ArrayList;

public class ArrayToList {
    public static void main(String[] args) {
        List<Employ> employList = new ArrayList<Employ>();
        employList.add(new Employ(1, "Sravan", "Java", "Programmer",84432));
        employList.add(new Employ(2, "Yashi", "SQL", "Expert",67432));
        employList.add(new Employ(3, "Narendar", "Angular", "Programmer",98887));
        employList.add(new Employ(4, "Nalin", "SQL", "Programmer",64432));
        employList.add(new Employ(5, "Sidarth", "Java", "Expert",90998));
        /* Convert ArrayList to an Array */

        Employ[] list=employList.toArray(new Employ[employList.size()]);
        for(Employ emp : list) {
            System.out.println(emp);
        }
    }
}