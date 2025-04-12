package com.cdac.account.object;

import java.time.LocalDate;

import com.cdac.account.util.UtilDate;

public abstract class Account {
	private int accountNumber;
	private String accountName;
	private LocalDate dateOfOpening;
	private double balance;
	private static int generateNumber = 1001001001;

	public Account() {
		super();
	}

	public Account(String accountName, String dateOfOpening, double balance) {
		super();
		this.accountNumber = generateNumber++;
		this.accountName = accountName;
		this.dateOfOpening = UtilDate.getDate(dateOfOpening);
		this.balance = balance;
	}

	public abstract void applyInterest();

	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * @return the dateOfOpening
	 */
	public String getDateStrOfOpening() {
		return UtilDate.getStringDate(dateOfOpening);
	}

	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}

	/**
	 * @param dateOfOpening the dateOfOpening to set
	 * @throws ParseException
	 */
	public void setDateOfOpening(String dateOfOpening) {
		this.dateOfOpening = UtilDate.getDate(dateOfOpening);
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", dateOfOpening="
				+ getDateStrOfOpening() + ", balance=" + balance + "]";
	}

}
