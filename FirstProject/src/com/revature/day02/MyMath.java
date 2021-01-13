package com.revature.day02;

public class MyMath {
	public static int add(int a, int b) {
		return a+b;
	}
	public static int subtract(int a, int b) {
		return a-b;
	}
	public static int multiply(int a, int b) {
		return a*b;
	}
	public static float divide(int a, int b) {
		return (float) a/b;
	}
	public static int greatest(int a, int b, int c) {
		return a>b && a>c ? a : b>c ? b : c;
	}
	/**
	 * This method is a wrapper for a recursive method that uses a short-circuit statement to determine if it has finished.
	 * @param list
	 * @return int
	 */
	public static int greatest(int []list) { return greatest(list[0], 0, list);}
	private static int greatest(int highest, int position, int []list) {
		return position<list.length ? (highest<list[position] ? greatest(list[position], position+1, list) : greatest(highest, position+1, list)): highest;
	}
}
