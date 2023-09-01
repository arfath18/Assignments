package com.shristi.inherdemo;

public class Account {
	double balance;
	public Account(double balance) {
		this.balance=balance;
	}
	public void withdraw(double amount){
		this.balance-=amount;
	}
	public void deposit(double amount){
		this.balance+=amount;
	}
	public double getBalance(){return this.balance;}

}
