package day13.Accounts;

public class AccountNotFoundException extends Exception{
	public AccountNotFoundException(String prompt) {
		super(prompt);
	}
}
