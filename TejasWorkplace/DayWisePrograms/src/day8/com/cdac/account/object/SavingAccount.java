package com.cdac.account.object;

import java.time.LocalDate;

public class SavingAccount extends Account {
	final double interest = 0.03;

	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(String accountName, String dateOfOpening, double balance) {
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
