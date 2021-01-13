package com.revature.day02;

import java.util.HashMap;

public class Customer {
	private String name;
	private HashMap<String, Float> accounts;
	private String currentAccount;
	
	public String getCurrentAccount() {
		return currentAccount;
	}

	public void setCurrentAccount(String currentAccount) {
		this.currentAccount = currentAccount;
	}

	public Customer() {
		accounts= new HashMap<String, Float>();
	}
	
	public Customer(String name, HashMap<String, Float> accounts) {
		this.setName(name);
		this.accounts= accounts!= null? accounts: new HashMap<String, Float>();
	}
	
	public float deposit(float amount) {
		float newAmount=-1;
		try{
			if(accounts.replace(currentAccount, accounts.get(currentAccount) + amount)==null) {
				throw new MissingAccountException();
			}
		}catch(MissingAccountException e) {
			System.out.println(e.getMessage());
		}
		finally{
			newAmount= accounts.get(currentAccount);
		}
		return newAmount;
	}
	
	public float deposit(String account, float amount) {
		accounts.replace(account, accounts.get(account)+amount);
		return accounts.get(account);
	}
	
	public boolean createAccount(String name, float amount) {
		return false;
	}
	
	public boolean createAccount(String name) {
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
