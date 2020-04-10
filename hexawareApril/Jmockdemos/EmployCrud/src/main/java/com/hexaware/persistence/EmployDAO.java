package com.hexaware.persistence;

import com.hexaware.model.Employ;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import com.hexaware.persistence.EmployMapper;

public interface EmployDAO {
      /**
     * @return the all the Employ records.
     */
    @SqlQuery("SELECT E.Empno, E.Name, E.Dept,"
    + " E.Desig, E.Basic FROM EMPLOY E;")
    @Mapper(EmployMapper.class)
    List<Employ> show();

       /**
     * @return the result of  Employ records.
     */
    @SqlQuery("SELECT E.Empno, E.Name, E.Dept,"
    + " E.Desig, E.Basic FROM EMPLOY E WHERE E.Empno=:empno")
    @Mapper(EmployMapper.class)
    Employ show(@Bind("empno") int empno);

    /**
     * @Add record to Employ Table.
     */
    @SqlUpdate("INSERT INTO EMPLOY(Empno,Name,Dept,Desig,Basic) "
     + " VALUES(:empno,:name,:dept,:desig,:basic)")
    void addEmploy(@BindBean Employ employ);
}
