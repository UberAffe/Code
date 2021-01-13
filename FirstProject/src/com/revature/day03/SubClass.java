package com.revature.day03;

public class SubClass extends SuperClass{

	private int y;
	
	public SubClass() {
		super();
		System.out.println("Default Constructor Sub Class");
	}
	
	public SubClass(int y) {
		super();
		this.y = y;
		System.out.println("Param Constructor Sub Class");
	}
}
