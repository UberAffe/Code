package com.revature.day03.Assignment1;

public abstract class Animal {
	protected String picture;
	protected String food;
	protected int hunger;
	protected int[] boundaries;
	protected String location;
	
	public abstract void makeNoise();
	public abstract void eat();
	public void sleep() {
		System.out.println("Animal Sleep");
	}
	public abstract void roam();
}
