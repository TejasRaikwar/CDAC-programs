package day13.Accounts;

import java.time.LocalDate;

public class Account {
	
	private static long baseAccntNo = 6540;
	private final long accNo;
	private String accName;
	private LocalDate dateOfOpening;
	private double balance;

	public Account(String accName, double balance) {
		this.accNo = generateAccountNumber();
		setAccName(accName);
		;
		this.dateOfOpening = LocalDate.now();
		this.balance = balance;
	}

	private static synchronized long generateAccountNumber() {
		return baseAccntNo++;
	}

	// getters

	long getAccNo() {
		return accNo;
	}

	String getAccName() {
		return accName;
	}

	LocalDate getDateOfOpening() {
		return dateOfOpening;
	}

	// setters

	void setAccName(String name) {
		if( name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name should not be null");
		}	
	}

	void setBalance(double balance) {
		if(balance <= 1000)
			throw new IllegalArgumentException("Balance must be grater than 1000");
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", dateOfOpening=" + dateOfOpening + ", balance="
				+ balance + "]";
	}

}
