package com.jb.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("${student.name}")
	private String name;

	@Value("${student.age}")
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
