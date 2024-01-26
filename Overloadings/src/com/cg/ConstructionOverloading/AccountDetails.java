package com.cg.ConstructionOverloading;


public class AccountDetails {
	
	long accNumber;
	double balance;
	String name;
	
	public AccountDetails(long accNumber, double balance, String name) {
		this.accNumber= accNumber;
		this.balance= balance;
		this.name= name;
	}
	
	public AccountDetails(long accNumber) {
		this.accNumber = accNumber;
	}
	
	public AccountDetails() {
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountDetails ac = new AccountDetails( 8583557538557L, 1234567d, "HDFC");
		
		System.out.println(ac.accNumber+" "+ac.name+" "+ac.balance);
		
	}

}
