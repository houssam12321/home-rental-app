package com.hrd.dreamhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AuthController {
    //this is just a test hello endpoint
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);

    }
    @PostMapping
    public String postHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);

    }


}
