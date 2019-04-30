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
			String withOrDep = Console.getString("Withdraw or Deposit? (w/d) ", "w", "d");
			String checkOrSav = Console.getString("Checking or Savings? (c/s) ", "c", "s");
			
 
			if (checkOrSav.equalsIgnoreCase("c")) {
				if (withOrDep.equalsIgnoreCase("w")){
					Double amount = Console.getDouble("Enter Checking Withdraw Amount: ", 0, checking.getBalance());
					checking.withdraw(amount);
				} else if (withOrDep.equalsIgnoreCase("d")) {
					Double amount = Console.getDouble("Enter Checking Deposit Amount: ");
					checking.deposit(amount);
				}
		
			} else if (checkOrSav.equalsIgnoreCase("s")) {
				if (withOrDep.equalsIgnoreCase("w")){
					Double amount = Console.getDouble("Enter Savings Withdrawl Amount: ", 0, savings.getBalance());
					savings.withdraw(amount);
				} else if (withOrDep.equalsIgnoreCase("d")) {
					Double amount = Console.getDouble("Enter Savings Deposit Amount: ");
					savings.deposit(amount);
				}
			}
			
			choice = Console.getString("\nContinue? (y/n) ", "y", "n");	
		}
		System.out.println();
		Console.displayResults(savings, checking);
	}

}
