package com.example.springioc;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * This example class explains constructor injection
 * 
 * @author srinivasu
 *
 */
public class DemoMain {

	public static void main(String args[]) {
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfiguration.class);
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("classpath:resources/beans.xml");
		context.refresh();
		
		Student student1 = context.getBean("student1",Student.class);
		student1.printStudentDetails();
		
		Student student2 = context.getBean("student2",Student.class);
		student2.printStudentDetails();

		context.close();
		
		
		
	}
}
