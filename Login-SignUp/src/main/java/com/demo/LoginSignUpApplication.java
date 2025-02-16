package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.demo.entity")
public class LoginSignUpApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginSignUpApplication.class, args);
	}

}
