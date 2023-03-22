package com.ebroker.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ebroker.model.UserDetails;
import com.ebroker.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;


    @Override
    public boolean checkEmail(String email) {
        return userRepo.existsByEmail(email);
    }

    @Override
    public UserDetails createUser(UserDetails user) {
        return userRepo.save(user);
    }

    @Override
    public UserDetails findUser(UserDetails user) {
        return userRepo.findByEmail(user.getEmail());
    }

    @Override
    public Optional<UserDetails> fetchOwner(Integer id) {
        return userRepo.findById(id);
    }
    
}
