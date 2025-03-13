package com.testConflict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestConflictApplication {

	public static void main(String[] args) {
		int x=98;
		char ch='x';
		String s= "nitish";
		boolean b=true;
                String n="dimpal";
		SpringApplication.run(TestConflictApplication.class, args);
	}

}
