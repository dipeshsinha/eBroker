package com.ebroker.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebroker.model.UserDetails;
import com.ebroker.service.UserService;

import net.minidev.json.JSONObject;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class HomeController {

    @Autowired
    private UserService userServ;

    @PostMapping("/register")
    public JSONObject createUser(@ModelAttribute UserDetails user) {

        boolean emailFlag = userServ.checkEmail(user.getEmail());
        JSONObject result = new JSONObject();
        if(emailFlag){
            
            result.put("result", "user already registered");
            
        }else {
            UserDetails userDetails = userServ.createUser(user);
            if(userDetails != null) {
                
                result.put("result", "register successful");
            } else {
                
                result.put("result", "error on server");
            }
        }
        return result;

    }

    @PostMapping("/login")
    public JSONObject loginUser(@ModelAttribute UserDetails user){

        JSONObject result = new JSONObject();

        UserDetails tempUser = userServ.findUser(user);
        

        if (tempUser != null) {
            if (user.getPassword().equals(tempUser.getPassword())) {
                result.put("login", "successful");
                tempUser.setPassword(null);
                result.put("user", tempUser);
            } else {
                result.put("login", "unsuccessful");
                result.put("error", "password error");
            }
        } else {
            result.put("login", "unsuccessful");
            result.put("error", "user not found");
        }

        return result;
    }

    @PostMapping("/fetchowner")
    private Optional<UserDetails> fetchOwner(@RequestBody Integer id) {
        return userServ.fetchOwner(id);
    }
}
