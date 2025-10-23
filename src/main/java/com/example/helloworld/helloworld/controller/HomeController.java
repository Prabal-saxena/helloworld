package com.example.helloworld.helloworld.controller;

import com.example.helloworld.helloworld.service.Home;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class HomeController {

    @Autowired
    private Home service;

    @GetMapping("/home")
    public ResponseEntity<String> home(){
        service.printPassword();
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
