package com.hexaware.trainer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("myresource")
public class MyResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Rest Service Hello World Program...";
    }
    @GET
    @Path("/company/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String company(@PathParam("name") String name) {
        String result = "Hello " +name+ " working in Hexaware";
        return result; 
    }
}
