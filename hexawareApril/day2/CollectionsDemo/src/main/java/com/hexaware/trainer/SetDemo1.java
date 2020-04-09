package com.hexaware.trainer;
import java.util.Set;
import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> names=new HashSet<String>();
        names.add("Naina");
        names.add("Sravan");
        names.add("Sornambiga");
        names.add("Sandeep");
        names.add("Naina");
        names.add("Sravan");
        names.add("Sornambiga");
        names.add("Naina");
        names.add("Sravan");
        names.add("Sornambiga");
        names.add("Sravan");
        names.add("Sornambiga");
        names.add("Sandeep");
        names.add("Sravan");
        names.add("Sornambiga");
        names.add("Sandeep");
        names.add("Sravan");
        names.add("Sornambiga");
        names.add("Sandeep");

        for(String s : names) {
            System.out.println(s);
        }
    }
}