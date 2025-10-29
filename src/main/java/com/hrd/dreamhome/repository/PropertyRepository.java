package com.hrd.dreamhome.repository;

import com.hrd.dreamhome.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropertyRepository extends JpaRepository<Property, Long> {
    List<Property> findByRental(boolean rental);
}
