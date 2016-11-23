package com.live.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.live.model.Person;

public class Manager {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		// Response response =
		// client.target("http://localhost:8080/APPPP/webapi/secured/rest").request().get();
		// Person person = response.readEntity(Person.class);
		// System.out.println(person.getFirstName());
		//

		WebTarget target = client.target("http://localhost:8080/APPPP/webapi/secured/rest");
		Builder builder = target.request();
		Response response = builder.get();
		Person person = response.readEntity(Person.class);
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		

	}

}
