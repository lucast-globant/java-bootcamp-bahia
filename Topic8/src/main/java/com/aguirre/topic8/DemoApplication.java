package com.aguirre.topic8;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aguirre.topic8.controllers.StudentController;
import com.aguirre.topic8.models.Student;
import com.google.gson.Gson;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		
	}

}
