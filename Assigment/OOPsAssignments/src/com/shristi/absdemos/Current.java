package com.shristi.absdemos;

class Current extends Bank {
	public Current(double balance) {
	super(balance);
	}
	@Override
	public void withdraw(double amount) {
		//super.withdraw(balance);
		System.out.println("You will be charge 100 for withdraw");
		this.balance-=100;
	}
}
