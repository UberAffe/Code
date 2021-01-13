package com.revature.day02;

public class MissingAccountException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -603626948387264878L;

	@Override
	public String getMessage() {
		return "You have not selected an account to add money to.";
	}
}
