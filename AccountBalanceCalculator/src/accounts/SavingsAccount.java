package accounts;

public class SavingsAccount extends Account{
	private double intRate;
	private double intPay;

	public SavingsAccount(){
		balance = 1000;
		intRate = .012;
		intPay = setIntPay(intRate);
	}
	
	SavingsAccount(double intRate, double intPay){
		balance = 1000;
		this.intRate = intRate;
		this.intPay = setIntPay(intRate);
	}
	
	public double setIntPay(double intRate) {
		return balance * intRate;
	}
	
	public double getPayOut() {
		return intPay;
	}
	
	
}
