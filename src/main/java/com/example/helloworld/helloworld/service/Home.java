package com.example.helloworld.helloworld.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Home {

    @Value("${DATABASE_PASSWORD}")
    private String dbPassword;

    @PostConstruct
    public void printPassword(){
        System.out.println(dbPassword);
        System.out.println("Password from Secrets");
    }
}
