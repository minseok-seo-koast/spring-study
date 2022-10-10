package com.example.InterfaceSample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.InterfaceSample.chapter03.used.Greet;

@SpringBootApplication
public class InterfaceSampleApplication {
	
	@Autowired
	Greet greet;
	
	private void execute() {
		greet.greeting();
	}

	public static void main(String[] args) {
		SpringApplication.run(InterfaceSampleApplication.class, args)
			.getBean(InterfaceSampleApplication.class)
			.execute();
	}

}
