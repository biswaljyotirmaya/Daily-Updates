package com.jb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jb.beans.BatsMan;

@SpringBootApplication
public class SpringBootCoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootCoreApplication.class, args);
		BatsMan bean = ctx.getBean("batsman", BatsMan.class);
		String batting = bean.batting();
		System.out.println(batting);
		((ConfigurableApplicationContext) ctx).close();
	}

}
