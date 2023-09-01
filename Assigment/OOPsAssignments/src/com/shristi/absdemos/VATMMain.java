package com.shristi.absdemos;

import java.util.Scanner;

public class VATMMain {

	public static void main(String[] args) {
		Scanner sysObj=new Scanner(System.in);
		System.out.println("Enter the account type (Saving/Current) ");
		String accountType=sysObj.nextLine();
		
		Bank account;
		if(accountType.equals("Savings")) {
			account=new Savings(10000);
		}
		else {
			account=new Current(10000);
		}
		System.out.println("Enter the amount to withdraw or deposit ");
        double amount = sysObj.nextDouble();

        switch (accountType) {
        case "Savings":
            account.withdraw(amount);
            break;
        case "Current":
            account.deposit(amount);
            break;
        default:
            System.out.println("Invalid account type");
    }
        System.out.println("The balance is " + account.getBalance());

	}

}
