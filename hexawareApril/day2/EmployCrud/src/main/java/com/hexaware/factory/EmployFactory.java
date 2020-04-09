package com.hexaware.factory;

//import com.hexaware.cms.persistence.OrdersDAO;
import com.hexaware.persistence.DbConnection;
import java.util.List;
import com.hexaware.model.Employ;
import com.hexaware.persistence.EmployDAO;

public class EmployFactory {

    public EmployFactory() {

    }

    /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static EmployDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(EmployDAO.class);
  }

  /**
   * Method to retrieve records from Employ table.
   * @return the array of Employ object.
   */
    public static Employ[] showEmploy() {
    List<Employ> employees = dao().show();
    return employees.toArray(new 
      Employ[employees.size()]);
  }

   /**
   * Method to retrieve particular Employ record.
   * @return Employ object.
   */
    public static Employ showEmploy(int empno) {
    Employ employ = dao().show(empno);
    return employ;
  }

  /**
   * Method to retrieve particular Employ record.
   * @return Employ object.
   */
    public static String addEmploy(Employ employ) {
        dao().addEmploy(employ);
        return "Record Inserted...";
    }

}