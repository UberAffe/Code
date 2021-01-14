package com.revature.day03.Assignment3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		Employee []emps = {new Employee(), new Employee(), new Employee()};
		try {
			FileOutputStream fos = new FileOutputStream("serial.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(Employee emp:emps) {
				oos.writeObject(emp);
			}
			oos.flush();
			oos.close();
		}catch(Exception e) {
			System.out.println("Exception during serialization: " + e);
			System.exit(0);
		}
		try {
			Employee []emps2= new Employee[3];
			FileInputStream fis = new FileInputStream("serial.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			for(int i = 0;i<3;i++) {
				emps2[i]= (Employee)ois.readObject();
			}
			ois.close();
			int temp = 1;
			for(Employee emp:emps2) {
				System.out.println("object"+ temp++ +": " + emp);
			}
		}
		catch(Exception e) {
			System.out.println("Exception during deserialization: " + e);
			System.exit(0);
		}
	}
}
