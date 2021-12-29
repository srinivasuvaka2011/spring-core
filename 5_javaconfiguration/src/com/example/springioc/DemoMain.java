package com.example.springioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * This class explains usage of ApplicationContext to get beans from spring container.
 * Here we used java based configuration, instead of XML Configuration
 * 
 * @author srinivasu
 *
 */
public class DemoMain {

	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfiguration.class);
		Course course = context.getBean("myCourse", Course.class);
		System.out.println(course.getName());
		context.close();
	}
}
