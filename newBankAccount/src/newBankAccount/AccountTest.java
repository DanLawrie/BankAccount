package newBankAccount;

public class AccountTest {

	public static void main(String[] args) {
	BankAccount first = new BankAccount("Nina Masters", "0001", 1000);
	CheckingAccount second = new CheckingAccount("John Smith", "0002", 500);
	SavingAccount third = new SavingAccount("Amy Smith", "0003", 15000, 3.5);
	
	
	System.out.println(first);
	System.out.println(second);
	System.out.println(third);
	
	
	second.deposit(10000);
	double averageBalance = ((500*15) +(second.getBalance()*15))/30;
	second.MonthEnd(averageBalance);
	
	third.withdraw(5000);
	averageBalance = ((15000*20)+(10000*10))/30;
	third.MonthEnd(averageBalance);
	
	System.out.println(first);
	System.out.println(second);
	System.out.println(third);
	}

}
