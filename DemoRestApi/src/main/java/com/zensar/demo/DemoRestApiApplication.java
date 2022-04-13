package com.zensar.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.zensar.demo"})
public class DemoRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestApiApplication.class, args);
	}

}
