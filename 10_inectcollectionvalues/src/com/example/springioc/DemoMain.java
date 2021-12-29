package com.example.springioc;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DemoMain {

	public static void main(String args[]) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("classpath:resources/beans.xml");
		context.refresh();
		
		CollectionValuesInjection obj = context.getBean(CollectionValuesInjection.class);
		obj.displayInfo();
	}
}
