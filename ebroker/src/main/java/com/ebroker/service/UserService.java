package com.ebroker.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ebroker.model.UserDetails;

@Service
public interface UserService {

    boolean checkEmail(String email);

    UserDetails createUser(UserDetails user);

    UserDetails findUser(UserDetails user);

    Optional<UserDetails> fetchOwner(Integer id);
    
}
