package com.example.springioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * This example class explains how you can use both java based configuration and xml based configuration
 * in your application.
 * 
 * Refer BeansConfiguration.java file to see how you can configure this.
 * 
 * @author srinivasu
 *
 */
public class DemoMain {

	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfiguration.class);
		Course course = context.getBean("myCourse", Course.class);
		System.out.println(course.getName());
		
		Student student = context.getBean("student",Student.class);
		student.printStudentDetails();
		context.close();
		
		
	}
}
