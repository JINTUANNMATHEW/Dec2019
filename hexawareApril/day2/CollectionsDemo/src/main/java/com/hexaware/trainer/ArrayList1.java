package com.hexaware.trainer;
import java.util.List;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("Amrit");
        names.add("Soujanya");
        names.add("Deepika");
        names.add("Naveen");
        names.add("Merry");
        for(Object ob : names) {
            System.out.println(ob);
        }
    }
}