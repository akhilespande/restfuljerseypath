/*package com.akhilesh;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
@Path("/hello")
public class HelloService{
 	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 		String output = "Welcome : " + msg;
 		return Response.status(200).entity(output).build();
 	}
 	

}*/