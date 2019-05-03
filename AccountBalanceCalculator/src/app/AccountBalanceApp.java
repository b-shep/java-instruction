package app;
import java.text.NumberFormat;

import accounts.Account;
import accounts.CheckingAccount;
import accounts.SavingsAccount;
import presentation.Console;

public class AccountBalanceApp {

	public static void main(String[] args) {
		
		SavingsAccount savings = new SavingsAccount(1000, .01);
		CheckingAccount checking = new CheckingAccount(1000, 1);
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		
		displayBalances("Initial Account Balances:", savings, checking, currency);

		System.out.println("Enter Transactions for the Month\n");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			String checkOrSav = Console.getString("Checking or Savings? (c/s) ", "c", "s");
			if (checkOrSav.equalsIgnoreCase("c")) {
				withOrDep(checking);
			} else if (checkOrSav.equalsIgnoreCase("s")) {
				withOrDep(savings);
			}

			choice = Console.getString("\nMake another transaction? (y/n) ", "y", "n");	
		}
		checking.subtractMonthlyFee();
		System.out.println();
		Console.displayFees(checking, savings);
		displayBalances("Final Balances: ", checking, savings, currency);


	}
	
		
	
	public static void withOrDep(Account a) {
		String withOrDep = Console.getString("Withdraw or Deposit? (w/d) ", "w", "d");
		if (withOrDep.equalsIgnoreCase("w")) {
			withdrawAction(a);
		} else if (withOrDep.equalsIgnoreCase("d")) {
			depositAction(a);
		}
	}
	
	public static void withdrawAction(Account a) {
		Double amount = Console.getDouble("Enter Withdrawl Amount: ", 0, a.getBalance());
		a.withdraw(amount);
	}
	
	public static void depositAction(Account a) {
		Double amount = Console.getDouble("Enter Deposit Amount: "); 
		a.deposit(amount);
	}
	
	public static void displayBalances(String prompt, Account a, Account b, NumberFormat currency) {
    	System.out.println(prompt);
    	System.out.println("Checking: " + currency.format(a.getBalance()));
    	System.out.println("Savings:  " + currency.format(b.getBalance()) + "\n");
	}
}
