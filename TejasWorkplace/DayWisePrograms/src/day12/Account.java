package day12;

import java.time.LocalDate;

public class Account {
	private static long baseAccntNo = 65430;
	private final long accNo;
	private String accName;
	private LocalDate dateOfOpening;
	private double balance;

	public Account(String accName, double balance) {
		this.accNo = generateAcountNumber();
		setAccName(accName);
		this.dateOfOpening = LocalDate.now();
		setBalance(balance);
	}

	private static synchronized long generateAcountNumber() {
		return baseAccntNo++;
	}

	// getters
	public long getAccNum() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}

	public double getBalance() {
		return balance;
	}

	// setters with validations

	public void setAccName(String accName) {
		if (accName == null || accName.trim().isEmpty()) {
			throw new IllegalArgumentException("Account Name can not be Empty");
		}
		this.accName = accName;
	}

	public void setBalance(double balance) {
		if (balance <= 1000)
			throw new IllegalArgumentException("Balance must be more than 1000");
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", dateOfOpening=" + dateOfOpening + ", balance="
				+ balance + "]";
	}

}
