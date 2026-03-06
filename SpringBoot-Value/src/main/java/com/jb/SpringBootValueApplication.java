package com.jb;

import com.jb.model.Student;
import com.jb.service.CalculationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootValueApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootValueApplication.class, args);
		Student bean = ctx.getBean("student", Student.class);
		System.out.println("Student name: " + bean.getName());
		System.out.println("Student age: " + bean.getAge());

		CalculationService bean2 = ctx.getBean("calculationService", CalculationService.class);
		System.out.println(bean2.showCalculations());
	}

}
