package com.ebroker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebroker.model.PropertyDetails;
import com.ebroker.repository.PropertyRepository;

@Service
public class PropertyServiceImpl implements PropertyService {
    
    @Autowired
    private PropertyRepository propertyRepo;

    @Override
    public PropertyDetails addProperty(PropertyDetails prop) {
        return propertyRepo.save(prop);
    }

    @Override
    public List<PropertyDetails> fetchListedProperties(Integer id) {
        return propertyRepo.findAllByownerID(id);
    }

    @Override
    public boolean deletelisting(Integer id) {
        propertyRepo.deleteById(id);
        return true;
    }

    @Override
    public List<PropertyDetails> fetchRentedProperties(Integer id) {
        return propertyRepo.findAllByrenterID(id);
    }

    @Override
    public List<PropertyDetails> fetchProperties(Integer id) {
        return propertyRepo.findAllProperties(id);
    }


}
