package com.revature.day03.Assignment1;

public class Main {
	public static void main(String[] args) {
		Animal []animals = new Animal[6];
		animals[0] = new Wolf();
		animals[1] = new Dog();
		animals[2] = new Lion();
		animals[3] = new Tiger();
		animals[4] = new Cat();
		animals[5] = new Hippo();
		for(Animal animal:animals) {
			animal.makeNoise();
			animal.eat();
			animal.sleep();
			animal.roam();
		}
	}
}
