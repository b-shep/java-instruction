package app;
import accounts.Account;
import accounts.CheckingAccount;
import accounts.SavingsAccount;
import presentation.Console;

public class AccountBalanceApp {

	public static void main(String[] args) {
		
		SavingsAccount savings = new SavingsAccount();
		CheckingAccount checking = new CheckingAccount();
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			String checkOrSav = Console.getString("Checking or Savings? (c/s) ", "c", "s");
			if (checkOrSav.equalsIgnoreCase("c")) {
				withOrDep(checking);
			} else if (checkOrSav.equalsIgnoreCase("s")) {
				withOrDep(savings);
			}

			choice = Console.getString("\nContinue? (y/n) ", "y", "n");	
		}
		System.out.println();
		Console.displayResults(savings, checking);
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
		Double amount = Console.getDouble("Enter Savings Withdrawl Amount: ", 0, a.getBalance());
		a.withdraw(amount);
	}
	
	public static void depositAction(Account a) {
		Double amount = Console.getDouble("Enter Savings Deposit Amount: ");
		a.deposit(amount);
	}
}
