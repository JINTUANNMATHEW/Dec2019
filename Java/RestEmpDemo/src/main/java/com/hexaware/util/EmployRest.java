package com.hexaware.util;
import com.hexaware.factory.EmployFactory;
import com.hexaware.model.Employ;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
 @Path("/Emp")
 public class EmployRest {
     @GET
	  @Produces(MediaType.APPLICATION_JSON)
	  public Employ[] employeesList() {
	    Employ[] employees = EmployFactory.showEmploy();
	    return employees;
	  }
 }