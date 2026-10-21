package com.demo.junitDEMO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JunitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunitDemoApplication.class, args);
		System.out.print("Hello");
	}

}
