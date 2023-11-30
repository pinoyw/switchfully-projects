package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/welcome")
    public String welcome() {
        return String.format("Welcome endpoint");
    }

    @GetMapping("/users")
    public String user() {
        return String.format("User endpoint");
    }

    @GetMapping("/admins")
    public String admin() {
        return String.format("Admin endpoint");
    }

    @GetMapping("/profile")
    public String profile() {
        return String.format("Profile endpoint");
    }

    @GetMapping("/reports")
    public String reports() {
        return String.format("Reports endpoint");
    }
}

