package com.live.APPPP;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("secured")
public class MyResource {

	@Path("message")
	@GET    
    @Produces(MediaType.TEXT_PLAIN)
    public String securedMethod() {
        return "Got it!";
    }
}
