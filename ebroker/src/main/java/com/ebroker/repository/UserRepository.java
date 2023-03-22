package com.ebroker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ebroker.model.UserDetails;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<UserDetails, Integer> {

    boolean existsByEmail(String email);

    UserDetails findByEmail(String email);
    
}
