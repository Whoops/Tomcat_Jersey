/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glados.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 *
 * @author Walton Hoops
 */

@Path("/hello")
public class HelloResource extends Application {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello Jersey";
	}
}           