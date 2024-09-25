package Entities;

public class Account {
	private String number;
	private String holder;
	private double balance = 0.0;
	
	
	public String toString() {
		return "Account "+ number + ", Holder: "+ holder +", Balance: $ "+ balance;
	}
	
	public Account() {
		
	}
	public Account(String number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	public Account(String number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double deposit) {
		balance += deposit;
	}
	public void withdraw(double withdraw) {
		if(balance >= (withdraw + 5)) {
			balance -= withdraw;
			balance -= 5;			
		}else {
			System.out.println("Saldo Insuficiente!");
		}

	}
	
	
	
	
}
