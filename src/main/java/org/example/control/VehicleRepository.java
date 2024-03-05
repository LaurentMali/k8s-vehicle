package org.example.control;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.example.entity.Vehicle;

@ApplicationScoped
public class VehicleRepository implements PanacheRepository<Vehicle> {
}
