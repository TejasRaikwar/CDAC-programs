package day9;

public abstract class Account implements Depositable, Withdrawable, Maturable {

	protected String accountNumber;
	protected double balance;

	Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public double Deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
		return balance;
	}

	@Override
	public double withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= balance;
		}
		return balance;
	}

}
