package com.example.springioc;

public class JavaCourse implements Course{

	public JavaCourse() {
		System.out.println("This is JavaCourse constructor");
	}
	@Override
	public String getName() {
		return "this is java course";
	}

}
