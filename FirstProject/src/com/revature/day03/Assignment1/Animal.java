package com.revature.day03.Assignment1;

public abstract class Animal {
	private String picture;
	private String food;
	private int hunger;
	private int[] boundaries;
	private String location;
	
	public abstract void makeNoise();
	public abstract void eat();
	public void sleep() {
		System.out.println("Animal Sleep");
	}
	public abstract void roam();
}
