package accounts;

public class SavingsAccount extends Account{
	private double intRate;
	private double intPay;

	
	public SavingsAccount(double balance, double intRate){
		super(balance);
		this.intRate = intRate;
		intPay = setIntPay(intRate);
	}
	
	
	
	public double setIntPay(double intRate) {
		return balance * intRate;
	}
	

	public double getPayOut() {
		intPay = intRate * balance;
		balance += intPay;
		return intPay;
	}
	
}
