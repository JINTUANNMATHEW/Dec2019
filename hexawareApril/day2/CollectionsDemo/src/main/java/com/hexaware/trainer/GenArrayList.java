package com.hexaware.trainer;
import java.util.List;
import java.util.ArrayList;

public class GenArrayList {
    public static void main(String[] args) {
        List<String> names=new ArrayList<String>();
        names.add(new String("Rithin"));
        names.add(new String("Priya"));
        names.add(new String("Ravalithas"));
        names.add(new String("Sandeep"));
        names.add(new String("Soujanya"));
        names.add(new String("Shilpa"));
        // names.add(12);

        for(String s : names) {
            System.out.println(s);
        }
    }
}