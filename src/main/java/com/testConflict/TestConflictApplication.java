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
		int f=989;
                char d='n';
                String n="dimpal";
		String d="nitish";
		char k='f';
		int num=143;
		SpringApplication.run(TestConflictApplication.class, args);
	}

}
