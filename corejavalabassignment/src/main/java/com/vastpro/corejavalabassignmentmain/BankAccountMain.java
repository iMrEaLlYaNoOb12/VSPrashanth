package com.vastpro.corejavalabassignmentmain;

import com.vastpro.corejavalabassignmentmodel.BankAccount;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		account1.setAccountNumber(543215243512L);
		account1.setBalance(200304.20);
		account1.setCustomerName("Naren");

		System.out.println("Account number : " + account1.getAccountNumber());
		System.out.println("Balance : " + account1.getBalance());
		System.out.println("Customer name : " + account1.getCustomerName());

	}

}
