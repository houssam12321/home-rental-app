package com.hrd.dreamhome.service.impl;


import com.hrd.dreamhome.model.Property;
import com.hrd.dreamhome.repository.PropertyRepository;
import com.hrd.dreamhome.service.PropertyService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PropertyServiceImpl implements PropertyService {

    private final PropertyRepository propertyRepository;

    public PropertyServiceImpl(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public List<Property> getAllProperties() {

        return propertyRepository.findAll();
    }

    @Override
    public Property createProperty(Property property) {
        return propertyRepository.save(property);
    }

    @Override
    public Property getPropertyById(Long id) {
        return propertyRepository.findById(id).orElse(null);
    }

    @Override
    public Property deleteProperty(Long id) {
        return propertyRepository.findById(id).map(property -> {
            propertyRepository.delete(property);
            return property;
        }).orElse(null);
    }
}
