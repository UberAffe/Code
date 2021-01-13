package com.revature.day02;

import java.util.StringTokenizer;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		System.out.println(s1 == s2);// true (because both refer to same instance)
		System.out.println(s1 == s3);// false(because s3 refers to instance created in nonpool)
		System.out.println(" ########## Equals Method ############### ");
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s2.charAt(2));
		stringBuilder();
	}
	
	public static void stringBuilder() {
		StringBuilder str2= new StringBuilder("String2");
		str2.append(":String3");
		StringTokenizer str1= new StringTokenizer(str2.toString(),":");
		while(str1.hasMoreTokens()) {
			System.out.println(str1.nextToken());
		}
		
	}
}