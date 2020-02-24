package Azhar_problem2;

public class SavingsAccountTest {
	
	public static void main(String args[]) {
	
		SavingsAccount saver1 = new SavingsAccount(4, 2000);
		SavingsAccount saver2 = new SavingsAccount(4, 3000);
		
		System.out.println("\t1st Savings\t|\t2nd Savings");
		int counter;
		for(counter = 1; counter <= 12; counter++) {
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.printf("\nMonth %d  %.2f\t|Month  %d %.2f", counter, saver1.getSavingsBalance(), counter, saver2.getSavingsBalance());
		}
		
		saver1.modifyInterestRate(5);
		saver2.modifyInterestRate(5);
		
		System.out.println("\n\n_____________________________________________\n\t1st Savings\t|\t2nd Savings");
		int counter2;
		for(counter2 = 1; counter2 <= 12; counter2++) {
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.printf("\nMonth %d  %.2f\t|Month  %d %.2f", counter2, saver1.getSavingsBalance(), counter2, saver2.getSavingsBalance());
		}
	
	}

}
