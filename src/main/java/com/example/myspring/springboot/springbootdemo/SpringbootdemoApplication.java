package com.example.myspring.springboot.springbootdemo;


import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.myspring.controller.MyFirstRESTController;

@SpringBootApplication (exclude=SecurityAutoConfiguration.class)
@ComponentScan(basePackageClasses = MyFirstRESTController.class)
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootdemoApplication.class, args);
		System.out.println("SprintBoot application has been initialised............");
		
		ApplicationContext ctx = SpringApplication.run(SpringbootdemoApplication.class, args);
		String[] beans = ctx.getBeanDefinitionNames();
		
/*		for(String bean: beans) {
			System.out.println("Spring beans automatically configured (unsorted): "+bean);
		}*/
		
		Arrays.sort(beans);
		
		for(String bean: beans) {
			System.out.println("Sorted list of Spring Boot beans: "+bean);
		}
		System.out.println("Springboot ends here");
		
	}
}
