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

//	@Path("/rest/{firstName}/{lastName}")
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public Person getData(@PathParam("firstName") String firstName, @PathParam("lastName") String lastName) {
//		
//		Person person = new Person();
//		person.setFirstName(firstName);
//		person.setLastName(lastName);
//		return person;
//	}
}
