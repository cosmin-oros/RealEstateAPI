package com.cosmin.app.realestateapi.Controller;

import com.cosmin.app.realestateapi.Models.Properties;
import com.cosmin.app.realestateapi.Repo.PropertiesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {
    @Autowired
    private PropertiesRepo propertiesRepo;

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome to the Real Estate API page";
    }

    @GetMapping(value = "/properties")
    public List<Properties> getProperties() {
        return propertiesRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveProperty(@RequestBody Properties property) {
        propertiesRepo.save(property);
        return "Saved property ... ";
    }

    @PutMapping(value = "/update/{id}")
    public String updateProperty(@PathVariable long id, @RequestBody Properties property) {
        Properties updatedProperty = propertiesRepo.findById(id).get();
        updatedProperty.setTypeOfProperty(property.getTypeOfProperty());
        updatedProperty.setAddress(property.getAddress());
        updatedProperty.setNrOfBathrooms(property.getNrOfBathrooms());
        updatedProperty.setNrOfBedrooms(property.getNrOfBedrooms());
        updatedProperty.setSquareFootage(property.getSquareFootage());
        updatedProperty.setPrice(property.getPrice());

        return "Updated property with id: " + id + " ...";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteProperty(@PathVariable long id) {
        Properties deleteProperty = propertiesRepo.findById(id).get();
        propertiesRepo.delete(deleteProperty);

        return "Deleted property with id: " + id + " ...";
    }
}
