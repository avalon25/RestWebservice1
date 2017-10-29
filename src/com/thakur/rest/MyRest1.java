package com.thakur.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class MyRest1 {
    
    // The Java method will process HTTP GET requests
    @GET
    @Produces("text/plain")
    public String sayHello() {
        return "Hello World - The first Rest App";
    }
}