package com.hexaware.trainer;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EmployTest {

    @Test 
    public void testHashCode() {
        Employ employ1 = new Employ(1, "Soujanya", "Java", "Programmer", 88322); 
        Employ employ2 = new Employ(1, "Soujanya", "Java", "Programmer", 88322); 
        assertEquals(employ1.hashCode(), employ2.hashCode());
    }
    @Test 
    public void testToString() {
        Employ employ = new Employ(1, "Soujanya", "Java", "Programmer", 88322);
        String result = "Employ No 1 Name Soujanya Department Java Desination Programmer Salary 88322";
        assertEquals(result, employ.toString());
    }
    @Test
    public void testEquals() {
        Employ employ1 = new Employ(1, "Soujanya", "Java", "Programmer", 88322); 
        Employ employ2 = new Employ(1, "Soujanya", "Java", "Programmer", 88322); 
        assertTrue(employ1.equals(employ2));
    }
    @Test 
    public void testConstructor() {
        Employ employ = new Employ(1, "Soujanya", "Java", "Programmer", 88322); 
        assertEquals(1, employ.getEmpno());
        assertEquals("Soujanya", employ.getName());
        assertEquals("Java", employ.getDept());
        assertEquals("Programmer", employ.getDesig());
        assertEquals(88322, employ.getBasic());
    }
    @Test 
    public void testGettersAndSetters() {
        Employ employ = new Employ();
        assertNotNull(employ);

        employ.setEmpno(1);
        assertEquals(1, employ.getEmpno());

        employ.setName("sidharth");
        assertEquals("sidharth", employ.getName());

        employ.setDept("Java");
        assertEquals("Java", employ.getDept());

        employ.setDesig("Programmer");
        assertEquals("Programmer", employ.getDesig());

        employ.setBasic(88333);
        assertEquals(88333, employ.getBasic());
    }
}