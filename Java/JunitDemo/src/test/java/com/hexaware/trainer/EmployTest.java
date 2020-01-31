package com.hexaware.trainer;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EmployTest {
    @Test
    public void testGettersAndSetters() {
        Employ employ = new Employ();
        employ.setEmpno(12);
        assertEquals(12, employ.getEmpno());
    }
    @Test
    public void testConstructor() {
        Employ employ = new Employ(1, "Sougata",
                "Java", "Programmer", 84422);
        assertEquals(1, employ.getEmpno());
        assertEquals("Sougata", employ.getName());
        assertEquals("Java", employ.getDept());
        assertEquals("Programmer", employ.getDesig());
        assertEquals(84422, employ.getBasic());
    }
}