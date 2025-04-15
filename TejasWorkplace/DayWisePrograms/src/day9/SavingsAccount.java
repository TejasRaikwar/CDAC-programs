package day9;

public class SavingsAccount extends Account {
	SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public double calculateMaturityAmount(double interestRate) {
		return (balance + (balance * interestRate));
	}
}
