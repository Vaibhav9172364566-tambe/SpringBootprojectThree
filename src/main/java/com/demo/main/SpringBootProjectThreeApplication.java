package com.demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProjectThreeApplication {

	public static void main(String[] args) {
		System.out.println("one");
		SpringApplication.run(SpringBootProjectThreeApplication.class, args);
		System.out.println("last");
	}

}
