package com.spring.springanno.anno;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	public void showStudent(){
		System.out.println("descStudent...");
	}
}
