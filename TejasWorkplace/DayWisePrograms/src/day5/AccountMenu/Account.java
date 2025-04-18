package day5.AccountMenu;

public class Account {

	private static long noOfAccnts = 0;
	private static long baseAccNo = 65412000;
	private final long accNo;
	private String name;
	private double balance;

	Account() {
		noOfAccnts++;
		accNo = baseAccNo++;
		name = "";
		balance = 0.0;
		System.out.println("Account Created Successfully and your account number is " + accNo);
	}

	Account(String name, double balance) {
		accNo = baseAccNo++;
		noOfAccnts++;
		this.name = name;
		this.balance = balance;
		System.out.println("Account Created Successfully and your account number is " + accNo);
	}

	public static long getNoOfAccnts() {
		return noOfAccnts;
	}

	public long getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean Withdraw(double amt) {
		if (amt > balance) {
			System.out.println("Insufficient balance ");
			return false;
		}
		if (amt < 0) {
			System.out.println("Entered amount must be greater than 0");
			return false;
		}
		balance = balance - amt;
		System.out.println("Rs" + amt + " withdrawed, and your current balance is Rs" + balance);
		return true;
	}

	public void Deposit(double amt) {
		balance = balance + amt;
//		System.out.println("Rs"+amt+" Deposited Successfully, Your Current account balance is Rs"+balance);
//		return balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
}
