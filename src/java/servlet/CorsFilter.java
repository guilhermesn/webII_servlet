/*package servlet;


import java.io.IOException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilherme
 */
/*
@Provider
public class CorsFilter implements ContainerResponseFilter {
 
    @Override
    public void filter(ContainerRequestContext requestContext, 
      ContainerResponseContext responseContext) throws IOException {
        
          responseContext.getHeaders().add(
            "Access-Control-Allow-Origin", "*");
          responseContext.getHeaders().add(
            "Access-Control-Allow-Credentials", "true");
          responseContext.getHeaders().add(
           "Access-Control-Allow-Headers",
           "origin, content-type, accept, authorization");
          responseContext.getHeaders().add(
            "Access-Control-Allow-Methods", 
            "GET, POST, PUT, DELETE, OPTIONS, HEAD");
    }

    @GET
    @Path("/")
    @Produces({MediaType.TEXT_PLAIN})
    public Response index() {
        return Response
          .status(200)
                
          .header("Access-Control-Allow-Origin", "*")
          .header("Access-Control-Allow-Credentials", "true")
          .header("Access-Control-Allow-Headers",
            "origin, content-type, accept, authorization")
          .header("Access-Control-Allow-Methods", 
            "GET, POST, PUT, DELETE, OPTIONS, HEAD")
          .entity("")
          .build();
    }
}*/