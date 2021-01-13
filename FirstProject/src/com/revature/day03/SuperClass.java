package com.revature.day03;

public class SuperClass {
	private int x;
	
	public SuperClass() {
		super();
		System.out.println("Default Constructor Super Class");
	}
	public SuperClass(int x) {
		super();
		this.x=x;
		System.out.println("Param Constructor Super Class");
	}
}
