package com.aguirre.topic6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class MeetingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetingsApplication.class, args);
	}
}
