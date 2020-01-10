package com.hexaware.util;
import com.hexaware.factory.EmployFactory;
import com.hexaware.model.Employ;
import java.util.List;
/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
 public class CliMain {
     public static void main(String[] args) {
         List<Employ> lstEmploy=EmployFactory.showEmploy();
         for(Employ e : lstEmploy) {
             System.out.println(e);
         }
     }
 }