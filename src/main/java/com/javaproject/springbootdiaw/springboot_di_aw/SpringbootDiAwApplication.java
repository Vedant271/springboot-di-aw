package com.javaproject.springbootdiaw.springboot_di_aw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootDiAwApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootDiAwApplication.class, args);
		Employee e = context.getBean(Employee.class);
		e.task();
	}

}
