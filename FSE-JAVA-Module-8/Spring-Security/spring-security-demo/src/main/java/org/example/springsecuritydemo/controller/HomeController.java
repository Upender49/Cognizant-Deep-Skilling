package org.example.springsecuritydemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping
public class HomeController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @GetMapping("/")
    public String home(@AuthenticationPrincipal OAuth2User user) {

        String name = user.getAttribute("name").toString();
        String email = user.getAttribute("email").toString();
        String id = user.getAttribute("sub").toString();
        String picture = user.getAttribute("picture").toString();

        StringBuilder response = new StringBuilder();

        response.append("Welcome to Spring Security OAuth Login!\n\n");
        response.append("Name : ").append(name).append("\n");
        response.append("Email : ").append(email).append("\n");
        response.append("Google ID : ").append(id).append("\n");
        response.append("Profile Picture : ").append(picture);

        return response.toString();
    }


}
