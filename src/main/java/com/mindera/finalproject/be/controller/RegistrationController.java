package com.mindera.finalproject.be.controller;

import com.mindera.finalproject.be.dto.registration.RegistrationCreateDto;
import com.mindera.finalproject.be.service.RegistrationService;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

import java.util.UUID;

@Path("/api/v1/registration")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RegistrationController {

    @Inject
    RegistrationService registrationService;


    @Operation(summary = "Find all registrations")
    @APIResponse(responseCode = "200", description = "List of all registrations")
    @GET
    public Response getAll() {
        return Response.ok(registrationService.getAll()).build();
    }


    @Operation(summary = "Find registration by id")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "Registration found"),
            @APIResponse(responseCode = "404", description = "Registration not found")
    })
    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") String id) {
        return Response.ok(registrationService.getById(id)).build();
    }



    @Operation(summary = "Create a registration")
    @APIResponse(responseCode = "201", description = "Registration created")
    @POST
    public Response create(RegistrationCreateDto registrationCreateDto) {
        return Response.ok(registrationService.create(registrationCreateDto)).build();
    }



   @Operation(summary = "Update a registration")
   @APIResponses(value = {
           @APIResponse(responseCode = "200", description = "Registration updated"),
           @APIResponse(responseCode = "404", description = "Registration not found")
   })
    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") String id,@Valid @RequestBody RegistrationCreateDto registrationCreateDto) {
        return Response.ok(registrationService.update(id, registrationCreateDto)).build();
    }


    @Operation(summary = "Delete a registration")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "Registration deleted"),
            @APIResponse(responseCode = "404", description = "Registration not found")
    })
    @DELETE
    @Path("/{id}")
    public Response deleteRegistration(@PathParam("id") String id) { //Este id é personId#courseId, deve ser concatenado antes de chegar aqui
        return Response.ok().build();
    }

}