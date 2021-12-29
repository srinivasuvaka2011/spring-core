package com.example.springioc;

public class JavaCourse implements Course{

	private String name;
	private String author;
	private int duration;
	private double cost;
	private boolean active;
	
	public JavaCourse() {
		System.out.println("This is JavaCourse constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public void printDetails() {
		System.out.println("*****Course Details*****");
		System.out.println("Name: "+name);
		System.out.println("Cost: "+cost);
		System.out.println("Duration: "+duration);
		System.out.println("Author: "+author);
		System.out.println("IsActive: "+active);
	}
	
	
}
