package com.ebroker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ebroker.model.PropertyDetails;

@RepositoryRestResource
public interface PropertyRepository extends JpaRepository<PropertyDetails, Integer>{

    List<PropertyDetails> findAllByownerID(Integer id);

    List<PropertyDetails> findAllByrenterID(Integer id);

    @Query("select p from PropertyDetails p where p.ownerID != :i and p.renterID = 0")
    List<PropertyDetails> findAllProperties(@Param("i") Integer id);

    
}
