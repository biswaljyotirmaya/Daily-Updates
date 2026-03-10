package com.jb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import outer.OuterClass;
import config.Configue;

@EnableAutoConfiguration
@ComponentScan(basePackageClasses = { Application.class, OuterClass.class })
@Import(Configue.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
