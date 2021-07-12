package com.lahiru.demo.controller;

import com.lahiru.demo.dto.JwtRequestDto;
import com.lahiru.demo.dto.JwtResponseDto;
import com.lahiru.demo.service.AuthenticationService;
import com.lahiru.demo.utility.JwtUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/")
    public String home() {
        return "Welcome to JWT";
    }

    @PostMapping("/authenticate")
    public JwtResponseDto authenticate(@RequestBody JwtRequestDto jwtRequestDto) throws Exception{

        return authenticationService.authenticate(jwtRequestDto);
    }
}
