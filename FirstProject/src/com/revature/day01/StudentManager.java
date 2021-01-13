package com.revature.day01;

public class StudentManager{
	public static void main(String []args){
		int id= Integer.parseInt(args[0]);
		Student s1= new Student(id,args[1]);
		String c1[]= {"Java",new String("SQL")};
		s1.setCourses(c1);
		s1.displayData();
		System.out.println(s1);
}
}
