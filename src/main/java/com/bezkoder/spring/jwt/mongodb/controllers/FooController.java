package com.bezkoder.spring.jwt.mongodb.controllers;

import com.bezkoder.spring.jwt.mongodb.security.jwt.AuthenticationDetailsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/foo")
public class FooController {


    @Autowired
    AuthenticationDetailsUtils authenticationDetailsUtils;

    @GetMapping("/all")
    public String allAccess() {

        UserDetails userDetails = authenticationDetailsUtils.getUserDetails();


        return "### Foo " + userDetails;
    }

}
