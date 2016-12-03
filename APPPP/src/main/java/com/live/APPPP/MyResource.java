package com.live.APPPP;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.live.model.Person;

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
	
	@Path("/rest")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Person getData() {
		
		Person person = new Person();
		person.setFirstName("Shahzad");
		person.setLastName("Hussain");
		return person;
	}
	
	
	@Path("/rest1")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getdata() {
		
		Person person = new Person();
		person.setFirstName("Shahzad");
		person.setLastName("Hussain");
		return Response.status(Status.CREATED).entity(person).build();
	}
}
