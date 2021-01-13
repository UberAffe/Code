package com.revature.day02;

public class Examples {
	public static void main(String[] args) {
		int [] ints= {5,12,6,25,37,16,22,78,84,81,15,9,32};
		String name;
		Customer []customers = new Customer[2];
		try{
			System.out.println("The highest number is: "+MyMath.greatest(ints[0], ints[1], ints[2]));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("The Highest number is: "+MyMath.greatest(ints));
		try{
			name = args[0];
		}catch(Exception e) {
			name= "Matt";
		}
		customers[0] = new Customer();
		customers[1] = new Customer(name, null);
		
	}
}
