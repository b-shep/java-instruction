
public class Account implements Withdraw, Depositable, Balanceable {
	
	protected double balance;
	
	public Account() {
		balance = 0;
	}
	
	public Account(double balance) {
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
