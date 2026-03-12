package com.jb.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
//@Profile("dev")
public class Comp1 {

	@Value("${emp.profile}")
	private String profile;

	@Value("${emp.message}")
	private String message;

	public Comp1() {
		System.out.println("Comp1 constructed and it is ready to use now!");
	}

	@PostConstruct
	public void init() {
		System.out.println("This is a component with " + profile + " configuration!");
		System.out.println(message + "!");
	}
}