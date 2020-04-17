package com.hexaware.trainer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Welcome to Rest Webservices...";
    }

    @GET
    @Path("/lms")
    @Produces(MediaType.TEXT_PLAIN)
    public String lmsTeam() {
        return "Hi we are batch 3 we are doing LMS Project";
    }

    @GET
    @Path("/cms")
    @Produces(MediaType.TEXT_PLAIN)
    public String cmsTeam() {
        return "Hi we are batch 4 we are doing CMS Project";
    }
}
