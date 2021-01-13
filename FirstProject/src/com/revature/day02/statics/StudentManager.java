package com.revature.day02.statics;

public class StudentManager {
	public static void main(String[] args) {
		Student s1= new Student(1, "Johnny");
		Student s2= new Student(2, "David");
		Student s3= new Student(3, "Jasdhir");
		System.out.println(s1+" "+Student.universityName);
		System.out.println(s2+" "+Student.universityName);
		System.out.println(Student.objCount);
	}
}
