package com.app.restws.person.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/personservice")
public interface PersonService {

	@GET
	@Path("/persons")
	String getPerson();
	
}
