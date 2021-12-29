package com.example.springioc;

public class Student {

	private String name;
	
	private long id;
	
	private Course course;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Invoked setName(String name)");
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		System.out.println("Invoked setCourse(Course course)");
		this.course = course;
	}

	public void printStudentDetails() {
		System.out.println("Student id:"+id);
		System.out.println("Student name:"+name);
		System.out.println("Student registered course name:"+course.getName());
	}
	
}
