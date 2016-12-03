package com.live.APPPP;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.live.model.Person;

@Path("person")
public class PersonController {

	@Path("/add")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Person addPerson() {
		Person person = new Person();
		person.setFirstName("Shahzad");
		person.setLastName("Hussain");

		return person;

	}
}
