package Azhar_problem2;

public class SavingsAccountTest {
	
	public static void main(String args[]) {
	
		SavingsAccount saver1 = new SavingsAccount(4, 2000);
		SavingsAccount saver2 = new SavingsAccount(4, 3000);
		//saver1.SavingsAccount(2000, 4);
		//saver2.SavingsAccount(3000, 4);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.printf("1st is %f.\n2nd is %f.", saver1.getSavingsBalance(), saver2.getSavingsBalance());
	
	}

}
