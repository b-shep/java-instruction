package accounts;

public class CheckingAccount extends Account{
	private double monthlyFee;
	
	public CheckingAccount() {
		balance = 1000;
		monthlyFee = 1;
		withdraw(monthlyFee);
	} 
	public CheckingAccount(double monthlyFee) {
		this.monthlyFee = monthlyFee;
		withdraw(monthlyFee);
	}
	public double getMonthlyFee() {
		return monthlyFee;
	}
	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	

	

}
