package org.maha.lambda;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello")
public class HelloResource {

    @GET
    public String hello() {
        return "Hello from Quarkus on Java 21 + Lambda!";
    }
}