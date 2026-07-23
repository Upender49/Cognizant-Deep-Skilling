package org.example.resourceserverdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureController {

    @GetMapping("/")
    public String home() {
        return "Welcome! This endpoint is public.";
    }

    @GetMapping("/secure")
    public String secure() {
        return "Congratulations! You accessed a protected endpoint.";
    }
}