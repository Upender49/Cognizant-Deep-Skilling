package org.example.springlearn.controller;


import org.example.springlearn.model.AuthenticationRequest;

import org.example.springlearn.model.AuthenticationResponse;

import org.example.springlearn.security.JwtUtil;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import org.springframework.web.bind.annotation.*;



@RestController
public class AuthenticationController {



    @Autowired
    private AuthenticationManager authenticationManager;



    @Autowired
    private JwtUtil jwtUtil;




    @PostMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestBody AuthenticationRequest request){



        authenticationManager.authenticate(

                new UsernamePasswordAuthenticationToken(

                        request.getUsername(),

                        request.getPassword()

                )

        );



        String token =
                jwtUtil.generateToken(
                        request.getUsername()
                );



        return new AuthenticationResponse(
                token
        );


    }


}