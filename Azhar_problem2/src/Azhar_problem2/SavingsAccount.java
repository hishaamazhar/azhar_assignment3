package Azhar_problem2;

public class SavingsAccount {
	
	private static int annualInterestRate;
	private float savingsBalance;
	
	public SavingsAccount(int interestInput, float balanceInput) {
		
		annualInterestRate = interestInput;
		savingsBalance = balanceInput;
		
	}
	
	public void calculateMonthlyInterest() {
		
		savingsBalance += (savingsBalance * ((annualInterestRate/100) / 12));
		getSavingsBalance();
		
	}
	
	public float getSavingsBalance() {
		return savingsBalance;
	}
	
	public static void modifyInterestRate(int newInterestInput) {
		
		annualInterestRate = newInterestInput;
		
	}
	
}
