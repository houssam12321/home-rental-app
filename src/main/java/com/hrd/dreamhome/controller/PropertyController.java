package com.hrd.dreamhome.controller;

import com.hrd.dreamhome.model.Property;
import com.hrd.dreamhome.service.PropertyService;
import com.hrd.dreamhome.service.impl.PropertyServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/properties")
@CrossOrigin(origins = "*") // useful for frontend later
public class PropertyController {
    private final PropertyServiceImpl propertyServiceImpl;

    public PropertyController(PropertyServiceImpl propertyServiceImpl) {
        this.propertyServiceImpl = propertyServiceImpl;
    }

    @GetMapping
    public List<Property> getAllProperties() {
        return propertyServiceImpl.getAllProperties();
    }

    @PostMapping
    public Property createProperty(@RequestBody Property property) {
        return propertyServiceImpl.createProperty(property);
    }
    @GetMapping("/{id}")
    public Property getPropertyById(@PathVariable Long id) {
        return propertyServiceImpl.getPropertyById(id);
    }
    @DeleteMapping("/{id}")
    public Property deleteProperty(@PathVariable Long id) {
        return propertyServiceImpl.deleteProperty(id);
    }
}
