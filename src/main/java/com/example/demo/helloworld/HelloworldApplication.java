package com.example.demo.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {

		System.out.println("Prabal's Hello World");
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
