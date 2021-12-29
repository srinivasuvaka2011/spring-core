package com.example.springioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = "classpath:resources/beans.xml")
@Configuration
public class BeansConfiguration {

	@Bean
	public Course myCourse() {
		return new JavaCourse();
	}
	
}
