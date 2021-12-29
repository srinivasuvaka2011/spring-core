package com.example.springioc;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * This class explains usage of ApplicationContext to get beans from spring container.
 * 
 * @author srinivasu
 *
 */
public class DemoMain {

	public static void main(String args[]) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("classpath:resources/beans.xml");
		context.refresh();
		Course course = context.getBean("myCourse", Course.class);
		System.out.println(course.getName());
		context.close();
		
	}
}
