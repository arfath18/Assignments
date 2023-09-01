package com.shristi.inherdemo;

class Savings extends Account{
	public Savings(double balance) {
		super(balance);
	}
	@Override
	public void withdraw(double amount) {
		if(amount>this.balance*0.15) {
			System.out.println("the amount balance below 15% cant bw withdrawn ");
		}else {
			super.withdraw(amount);
		}
	}
		@Override
		public void deposit(double amount) {
			super.deposit(amount);
			System.out.println("added the 5% intrest your account");
			this.balance+=amount*0.05;
		}
	}

