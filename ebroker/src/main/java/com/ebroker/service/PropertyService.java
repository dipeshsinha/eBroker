package com.ebroker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ebroker.model.PropertyDetails;

@Service
public interface PropertyService {

    PropertyDetails addProperty(PropertyDetails prop);

    List<PropertyDetails> fetchListedProperties(Integer id);

    boolean deletelisting(Integer id);

    List<PropertyDetails> fetchRentedProperties(Integer id);

    List<PropertyDetails> fetchProperties(Integer id);

    
}
