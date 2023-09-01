package com.shristi.absdemos;

abstract class Bank {
	double balance;
	public Bank(double balance) {
        this.balance = balance;
    }

    abstract void withdraw(double amount);

    abstract void deposit(double amount);

    public double getBalance() {
        return this.balance;
    }
}


