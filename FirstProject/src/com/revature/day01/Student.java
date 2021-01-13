package com.revature.day01;

import java.util.Arrays;
import java.util.Date;

public class Student{
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + ", courses=" + Arrays.toString(courses) + "]";
	}

	private int id;
	private String name;
	private Date dob;
	private String []courses;
	
	public Student(int id,String name){
	this.id=id;
	this.name=name;
	this.dob=new Date();
}

public Student(int id, String name, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

public void displayData(){
	System.out.println("ID : "+id+" , Name : "+name+" , DOB : "+dob);
}

public String []getCourses() {
	return courses;
}

public void setCourses(String []courses) {
	this.courses = courses;
}
}