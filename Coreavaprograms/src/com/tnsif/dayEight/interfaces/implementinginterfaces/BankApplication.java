package com.tnsif.dayEight.interfaces.implementinginterfaces;

public class BankApplication {

	public static void main(String[] args) {
		Bank bank = new  BankImpl();
		
		Account account = new Account(123456,"Adithiyaa",20000,bank);
		
		account.deposit(2000);
		 System.out.println(account);
	     
	     //withdraw money
	     account.withdraw(10000);
	     // Print the account details
	     System.out.println(account);
	}

}
