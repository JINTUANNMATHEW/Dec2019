package com.hexaware.trainer;
import org.junit.Test;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class DemoTest {

    @Test 
    public void testPropertyList() {
        assertNull(Demo.propertyList("Ram"));
        assertNotNull(Demo.propertyList("Meena"));
    }
    @Test 
    public void testEvenOdd() {
        assertTrue(Demo.evenodd(4));
        assertFalse(Demo.evenodd(5));
    }
    @Test
    public void testMax3() {
        assertEquals(5, Demo.max3(2,3,5));
        assertEquals(5, Demo.max3(2,5,3));
        assertEquals(5, Demo.max3(5,3,2));
    }
    @Test
    public void testSum() {
        assertEquals(5, Demo.sum(2,3));
    }
    @Test
    public void testSayHello() {
        assertEquals("Welcome to Junit 5.0",
            Demo.sayHello());
    }
}