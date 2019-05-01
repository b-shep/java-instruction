package accounts;

public class CheckingAccount extends Account{
	private double monthlyFee;
	
	
	public CheckingAccount(double balance, double monthlyFee) {
		super(balance);
		this.balance = balance;
		this.monthlyFee = monthlyFee;
	}
	public void subtractMonthlyFee() {
		withdraw(monthlyFee);
	}
	public double getMonthlyFee() {
		return monthlyFee;
	}
	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	

	

}
