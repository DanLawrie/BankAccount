package newBankAccount;

public class CheckingAccount extends BankAccount {
	CheckingAccount(String name, String accountNumber, double balance)
	{
		super(name, accountNumber, balance);
	}

	void MonthEnd(double averageDailyBalance)
	{
		if(getBalance()<1500)
		{
			withdraw(20);
		}
	}
	
}
