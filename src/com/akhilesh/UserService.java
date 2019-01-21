package com.akhilesh;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/* * URI Pattern : “users/query?from=100&to=200&orderBy=age&orderBy=name”*/

@Path("/users")
public class UserService {

	@GET
	@Path("/query")
	@Produces(MediaType.TEXT_HTML)
	public Response getUsers(@QueryParam("from") int from, @QueryParam("to") int to,
			@QueryParam("orderBy") List<String> orderBy) {

		return Response.status(200)
				.entity("getUsers is called, from : " + from + ", to : " + to + ", orderBy" + orderBy.toString())
				.build();

	}

/*	URI Pattern : “users/query”*/
	
	@GET
	@Path("/queryDefault")
	@Produces(MediaType.TEXT_HTML)
	public Response getUsersDeafualtValue(@DefaultValue("1000") @QueryParam("from") int from,
			@DefaultValue("999") @QueryParam("to") int to,
			@DefaultValue("name") @QueryParam("orderBy") List<String> orderBy) {

		return Response.status(200)
				.entity("getUsers is called, from : " + from + ", to : " + to + ", orderBy" + orderBy.toString())
				.build();

	}

}