package newBankAccount;

public class BankAccount {
	private String name = "";
	private String accountNumber = "";
	private double balance = 0;
	
	BankAccount(String name, String accountNumber, double balance)
	{
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	BankAccount(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw (double amount) {
		
			balance=balance-amount;
	}
	public void deposit (double amount) {
		
		balance=balance+amount;
}
	public String toString()
	{
		return "Name: " + name + ", accountNumber " + accountNumber + ", Balance: " + balance;
	}
}
