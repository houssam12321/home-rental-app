package com.hrd.dreamhome.service;

import com.hrd.dreamhome.model.Property;
import com.hrd.dreamhome.repository.PropertyRepository;

import java.util.List;

public interface PropertyService {
    List<Property> getAllProperties();
    Property createProperty(Property property);
    Property getPropertyById(Long id);
    Property deleteProperty(Long id);

}
