package com.ibm.quarkus.academy;

import java.util.List;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/persons")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {

    @GET    
    public List<Person> getData() {
        return Person.listAll();
    }


    @POST
    @Transactional
    public Person savePerson(Person person) {
        person.persist();
        return person;
    }

}
