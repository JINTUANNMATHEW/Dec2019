package com.hexaware.trainer;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


public class DemoTest {

    static Demo objDemo=null;

    @BeforeClass
    public static void setUpBefore() {
        objDemo = new Demo();
    }
    @Before 
    public void executeBefore() {
        System.out.println("Test Case Execution Started...");
    }
    @After
    public void executeAfter() {
        System.out.println("Test Case Execution Completed...");
    }
    @AfterClass
    public static void shutdown() {
        objDemo = null;
    }
    @Test 
    public void testPropertyList() {
        assertNull(objDemo.propertyList("Ram"));
        assertNotNull(objDemo.propertyList("Meena"));
    }
    @Test 
    public void testArray() {
        int[] a=new int[]{1,2,3,4};
        int[] b=new int[]{1,2,3,4};
        assertArrayEquals("Both are not equal", a, b);
    }
    @Test 
    public void testValidate() {
        assertNotNull(objDemo.validate("Hexaware"));
        assertNull(objDemo.validate("Hello"));
    }
    @Test 
    public void testEvenOdd() {
        assertTrue(objDemo.evenodd(4));
        assertFalse(objDemo.evenodd(5));
    }
    @Test 
    public void testMinArray() {
        int[] a=new int[]{-1,5,33,788,3,4};
        assertEquals(-1, objDemo.minArray(a));
    }
    @Test
    public void testSayHello() {
        // Demo objDemo = new Demo();
        assertEquals("Welcome to Junit Programming...", objDemo.sayHello());
    }

    @Test
    public void testMax3() {
        // Demo objDemo = new Demo();
        assertEquals(5, objDemo.max3(5, 3, 2));
        assertEquals(5, objDemo.max3(3, 5, 2));
        assertEquals(5, objDemo.max3(3, 2, 5));
    }
    @Test 
    public void testSum() {
        // Demo objDemo = new Demo();
        assertEquals(5, objDemo.sum(2, 3));
    }
}