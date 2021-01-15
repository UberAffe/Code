package com.revature.day04.Assignment1;

public class Main {
	public static void main(String []args) {
		RunnableDemo R1 = new RunnableDemo( "Thread-1");
	    R1.start();
	    RunnableDemo R2 = new RunnableDemo( "Thread-2");
	    R2.start();
	    
	    PrintDemo PD = new PrintDemo();
	    
	    ThreadDemo T1 = new ThreadDemo( "Thread - 1 ", PD );
	    ThreadDemo T2 = new ThreadDemo( "Thread - 2 ", PD );
	    T1.start();
	    T2.start();
	    // wait for threads to end
	    try {
	    	T1.join();
	    	T2.join();
	    } catch ( Exception e) {
	    	System.out.println("Interrupted");
	    }
	}
}
