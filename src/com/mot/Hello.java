package com.mot;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by linux on 16-7-19.
 */

@Path("/Hello")
public class Hello {
    @GET
    @Path("/Jersey")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello Jersey";
    }


}
