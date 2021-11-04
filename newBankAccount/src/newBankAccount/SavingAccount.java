package newBankAccount;

public class SavingAccount extends BankAccount {
	double interestRate = 0;
	double interestRates = 0;
	
	SavingAccount(String name, String accountNumber, double balance, double interestRate){
		super(name, accountNumber, balance);
		this.interestRate = interestRate/100;
		
	}
	void MonthEnd(double averageDailyBalance)
	{
		deposit(averageDailyBalance*interestRate);
		
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public String toString()
	{
		interestRates =getInterestRate()*1000;
		return "Name: " + getName() + ", accountNumber " + getAccountNumber()  + ", Balance: " + getBalance() + ", interestRate: " + Math.round(interestRates*1)/10.0 + "%";
	}
}
