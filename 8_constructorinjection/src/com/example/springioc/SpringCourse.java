package com.example.springioc;

public class SpringCourse implements Course{

	public SpringCourse() {
		System.out.println("This is SpringCourse constructor");
	}
	@Override
	public String getName() {
		return "This is spring course";
	}

}
