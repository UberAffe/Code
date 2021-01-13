package com.revature.day02.statics;

public class Student {
	private int id;
	private String name;
	public static String universityName= "UNT";
	public static int objCount=0;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		objCount+=1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
