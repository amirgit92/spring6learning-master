package com.amir.spring6learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring6learningApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring6learningApplication.class, args);
//		MyController myController = ctx.getBean(MyController.class);
//		System.out.println("in main method");
//		System.out.println(myController.sayyHello());

	}

}
