package accounts;
import interfaces.Balanceable;
import interfaces.Depositable;
import interfaces.Withdrawable;

public class Account implements Withdrawable, Depositable, Balanceable {
	
	protected double balance;
	

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double amount) {
		this.balance = amount;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;

	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;

	}

}
