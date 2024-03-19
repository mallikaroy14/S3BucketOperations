package com.example.jwtdemo.contollers;

import com.example.jwtdemo.ResponseHandler;
import com.example.jwtdemo.models.AuthRequest;
import com.example.jwtdemo.models.User;
import com.example.jwtdemo.repositories.UserRepository;
import com.example.jwtdemo.services.JwtServices;
import com.example.jwtdemo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    UserServices userServices;

    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtServices jwtServices;

//    @GetMapping("")
//    public String get() {
//        return "End Point";
//    }

    @PostMapping("")
    public Object create(@RequestBody User user) {
        Object user1 = userServices.create(user);
        if (user1 != null) {
            return ResponseHandler.createResponse("User added", HttpStatus.CREATED, user1);
        }
        return ResponseHandler.createResponse("User already existed", HttpStatus.CONFLICT, null);
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody AuthRequest authRequest) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));

        if (authentication.isAuthenticated()) {
            return jwtServices.generateToken(authRequest.getUsername());
        } else {
            return "Something wrong";
        }
    }

    @GetMapping("/protected")
    public String text(){
        return "All good";
    }

}

