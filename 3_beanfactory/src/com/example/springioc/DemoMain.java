package com.example.springioc;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * This class explains usage of BeanFactory to get beans from spring container.
 * @author srinivasu
 *
 */
public class DemoMain {

	public static void main(String args[]) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("resources/beans.xml"));
		
		Course course = factory.getBean("myCourse", Course.class);
		System.out.println(course.getName());
		
	}
}
