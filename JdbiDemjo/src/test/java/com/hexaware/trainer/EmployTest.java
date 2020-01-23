package com.hexaware.trainer;

import com.hexaware.factory.EmployFactory;
import com.hexaware.model.Employ;
import com.hexaware.persistence.EmployDAO;
import mockit.MockUp;
import org.junit.runner.RunWith;
import mockit.Expectations;
import mockit.Mock;
import mockit.Mocked;
import java.util.ArrayList;
import mockit.integration.junit4.JMockit;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
@RunWith(JMockit.class) 
public class EmployTest 
{
  /**
  * tests that empty employee list is handled correctly.
  * @param dao mocking the dao class
  */
  @Test
  public final void testListById(@Mocked final EmployDAO dao) {
    final Employ e1 = new Employ(100, "Sougata", "Java", "Programmer", 844223);
    new Expectations() {
      {
        dao.show(100); result = e1;
      }
    };
    new MockUp<EmployFactory>() {
      @Mock
      EmployDAO dao() {
        return dao;
      }
    };
    Employ e = EmployFactory.showEmploy(100);
    assertNotNull(e);
  } 
  
 /**
  * tests that empty employee list is handled correctly.
  * @param dao mocking the dao class
  */
  @Test
  public final void testListAllEmpty(@Mocked final EmployDAO dao) {
      final ArrayList<Employ> elist = new ArrayList<Employ>();
    new Expectations() {
      {
        dao.show(); result = elist;
      }
    };
    new MockUp<EmployFactory>() {
      @Mock
      EmployDAO dao() {
        return dao;
      }
    };
    Employ[] es = EmployFactory.showEmploy();
    assertEquals(0, es.length);
  } 

  /**
  * tests that empty employee list is handled correctly.
  * @param dao mocking the dao class
  */
  @Test
  public final void testListCount(@Mocked final EmployDAO dao) {
      final ArrayList<Employ> elist = new ArrayList<Employ>();
      elist.add(new Employ(1, "Sougata", "Java", "Programmer", 844223));
      elist.add(new Employ(3, "Ram", "Angular", "Expert",58553));
    new Expectations() {
      {
        dao.show(); result = elist;
      }
    };
    new MockUp<EmployFactory>() {
      @Mock
      EmployDAO dao() {
        return dao;
      }
    };
    Employ[] es = EmployFactory.showEmploy();
    assertEquals(2, es.length);
  } 
}
