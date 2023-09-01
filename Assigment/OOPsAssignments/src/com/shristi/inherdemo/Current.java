package com.shristi.inherdemo;

class Current extends Account {
	public Current(double balance) {
	super(balance);
	}
	@Override
	public void withdraw(double amount) {
		super.withdraw(balance);
		System.out.println("You will be charge 100 for withdraw");
		this.balance-=100;
	}
}
