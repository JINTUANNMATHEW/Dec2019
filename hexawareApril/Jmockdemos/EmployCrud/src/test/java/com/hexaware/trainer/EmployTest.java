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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

@RunWith(JMockit.class) 
public class EmployTest {

  @Test
  public final void testAddEmploy(@Mocked final EmployDAO dao) {
      final Employ employ = new Employ(2000,"Naina","Java","Trainee",12233);
      final Employ employ1 = new Employ(-2,"Naina","Java","Trainee",12233);
      final Employ employ2 = new Employ(2000,"Naina chaurasia biswas parth","Java","Trainee",12233);
      final Employ employ3 = new Employ(2000,"Naina","SAP","Trainee",12233);
      final Employ employ4 = new Employ(2000,"Naina","Java","Trainee",-100);
      new Expectations() {
      {
        dao.addEmploy(employ);
      }
    };
    new MockUp<EmployFactory>() {
      @Mock
      EmployDAO dao() {
        return dao;
      }
    };
    String result1 = EmployFactory.addEmploy(employ);
    assertEquals("Record Inserted...", result1);
    String result2 = EmployFactory.addEmploy(employ1);
    assertEquals("Invalid EmployNumber...", result2);
    String result3 = EmployFactory.addEmploy(employ2);
    assertEquals("Invalid Name...", result3);
    String result4 = EmployFactory.addEmploy(employ3);
    assertEquals("Invalid Department...", result4);
    String result5 = EmployFactory.addEmploy(employ4);
    assertEquals("Invalid Basic...", result5);
  }
  @Test
  public final void testEmploySearchById(@Mocked final EmployDAO dao) {
      final Employ employMgr = new Employ(1000,"Murugan","Training","Manager",99999);
      final Employ employ = new Employ(2000,"Naina","Java","Trainee",12233);
      new Expectations() {
      {
        dao.show(1000); result = employMgr;
        dao.show(2000); result = employ;
        dao.show(3000); result = null;
      }
    };
    new MockUp<EmployFactory>() {
      @Mock
      EmployDAO dao() {
        return dao;
      }
    };
    assertNotNull(EmployFactory.showEmploy(1000));
    assertNotNull(EmployFactory.showEmploy(2000));
    assertNull(EmployFactory.showEmploy(3000));
  }
  
  @Test
  public final void testListByEmpty(@Mocked final EmployDAO dao) {
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