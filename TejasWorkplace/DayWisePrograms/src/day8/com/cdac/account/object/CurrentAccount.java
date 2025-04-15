package day8.com.cdac.account.object;

import java.time.LocalDate;

public class CurrentAccount extends Account {
	final double interest = 0.01;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(String accountName, String dateOfOpening, double balance) {
		super(accountName, dateOfOpening, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyInterest() {

		int years = (LocalDate.now()).compareTo(getDateOfOpening());
		for(int i=1;i<=years;i++) {
			setBalance(getBalance() + getBalance() * interest);
		}
	}
}
