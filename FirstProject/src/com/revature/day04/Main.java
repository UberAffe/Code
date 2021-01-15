package com.revature.day04;

import java.util.ArrayList;

import com.revature.day03.Assignment3.Employee;

public class Main {
	public static void main(String []args) {
		ArrayList<Employee> emps = new ArrayList<Employee>();
		for(int i=1; i<5; i++) {
			emps.add(new Employee(i+""));
		}
		Main.<Employee>display(emps);
	}
	public static <E> void display(ArrayList<E> objects) {
		for(E obj:objects) {
			System.out.println(obj.toString());
		}
		System.out.println(objects);
	}
}
