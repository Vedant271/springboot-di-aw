package com.javaproject.springbootdiaw.springboot_di_aw;

import com.javaproject.springbootdiaw.springboot_di_aw.model.Employee;
import com.javaproject.springbootdiaw.springboot_di_aw.model.Laptop;
import com.javaproject.springbootdiaw.springboot_di_aw.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootDiAwApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootDiAwApplication.class, args);

		LaptopService laptopService = context.getBean(LaptopService.class);
		Laptop laptop = context.getBean(Laptop.class);
		laptopService.addLaptop(laptop);
		System.out.println("Is Laptop Gaming: "+laptopService.isLaptopGaming(laptop));

		//		Employee e = context.getBean(Employee.class);
		//		e.task();
	}

}
