package com.cagataygurturk.springbootboilerplate.controllers;


import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Component
@Path("/ping")
public class PingController {

    static class Entity {
        public int id = 1;
        public String name;

        public Entity(String name) {
            this.name = name;
        }
    }


    @GET
    @Produces("application/json")
    public Response ping() {


        return Response.status(200)
                .entity(new Entity("John Doe"))
                .build();
    }
}
