package com.example.springioc;

public class Student {

	private String name;
	
	private long id;
	 
	private Course course;
	
	public Student(String name, long id, Course course) {
		this.name = name;
		this.id =  id;
		this.course = course;
		System.out.println("This is Student(String name, long id, Course course) constructor");
	}
	
	public Student(String name) {
		this.name = name;
		System.out.println("This is Student(String name) constructor");
	}
	
	public Student(long id) {
		this.id  = id;
		System.out.println("This is Student(long id) constructor");
	}
	
	public void printStudentDetails() {
		System.out.println("Student id:"+id);
		System.out.println("Student name:"+name);
		System.out.println("Student registered course name:"+course.getName());
	}
	
}
