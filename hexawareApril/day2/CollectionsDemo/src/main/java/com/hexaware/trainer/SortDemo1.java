package com.hexaware.trainer;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo1 {
    public static void main(String[] args) {
        SortedSet<String> names=new TreeSet<String>();
        names.add("Deepika");
        names.add("Charan");
        names.add("Ayushi");
        names.add("Jintu");
        names.add("Rithin");
        names.add("Manvesh");
        names.add("Amrit");
        System.out.println("Sorted Names ");
        for(String s : names) {
            System.out.println(s);
        }
    }
}