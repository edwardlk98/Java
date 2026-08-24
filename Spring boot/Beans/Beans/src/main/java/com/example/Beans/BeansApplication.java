package com.example.Beans;

import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication

public class BeansApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BeansApplication.class, args);

		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Parrot x = new Parrot();
		x.setName();
		Supplier<Parrot> parrotSupplier =  ()-> x;
		context.registerBean("parrot1", Parrot.class, parrotSupplier, bc -> bc.setPrimary(true));

		Parrot p = context.getBean(Parrot.class);
		System.out.println(p);
		System.out.println(p.getName());
		
	}

}
