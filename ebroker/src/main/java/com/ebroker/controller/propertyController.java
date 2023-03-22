package com.ebroker.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebroker.model.PropertyDetails;
import com.ebroker.service.PropertyService;


@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class propertyController {

    @Autowired
    private PropertyService propertyServ;

    @PostMapping("/addproperty")
    public PropertyDetails addProperty(@ModelAttribute PropertyDetails prop) {

        PropertyDetails tempProp = propertyServ.addProperty(prop);


        return tempProp;
    }

    @PostMapping("/fetchproperties")
    private List<PropertyDetails> fetchProperties(@RequestBody Integer id) {
        return propertyServ.fetchListedProperties(id);
    }

    @PostMapping("/deletelisting")
    private boolean deletelisting(@RequestBody Integer id) {
        return propertyServ.deletelisting(id);
    }

    @PostMapping("/fetchRentedProperties")
    private List<PropertyDetails> fetchRentedProperties(@RequestBody Integer id) {
        return propertyServ.fetchRentedProperties(id);
    }

    @PostMapping("/fetchallproperties")
    private List<PropertyDetails> fetchallproperties(@RequestBody Integer id) {
        return propertyServ.fetchProperties(id);
    }

    

}
