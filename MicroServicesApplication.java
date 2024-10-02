package com.example.MicroServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EntityScan("com.example.entity")
@ComponentScan(basePackages = "com.example")
public class MicroServicesApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroServicesApplication.class, args);
	}
}
