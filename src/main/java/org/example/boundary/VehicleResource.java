package org.example.boundary;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.example.control.VehicleRepository;

@Path("/vehicle")
public class VehicleResource {
    @Inject
    VehicleRepository vehicleRepository;

    @GET
    public Response getAll() {
        return Response.ok(vehicleRepository.listAll()).build();
    }
}
