package com.waylau.rest.resources;  
  
  
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.PathParam;  
import javax.ws.rs.core.MediaType;  
  
  
@Path("/hello")  
public class HelloResource {  
    @GET  
    @Produces(MediaType.TEXT_PLAIN)  
    public String sayHello() {  
        return "Hello World!" ;  
    }  
   
      
    @GET  
    @Path("/{param}")    
    @Produces("text/plain;charset=UTF-8")  
    public String sayHelloToUTF8(@PathParam("param") String username) {  
        return "Hello " + username;  
    }  
    @POST  
    @Path("/{param}")    
    @Produces("text/plain;charset=UTF-8")  
    public String sayHello(@PathParam("name") String name,@PathParam("age") String age) {  
        return "Hello " + name;  
    }  
      
}  