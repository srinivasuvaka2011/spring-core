package com.example.springioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

	@Bean
	public Course myCourse() {
		return new JavaCourse();
	}
	
}
