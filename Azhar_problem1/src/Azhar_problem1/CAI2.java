package Azhar_problem1;

import java.util.Random;
import java.util.Scanner;
public class CAI2 {
	
	private int actualAns;
	private int response;
	
	public static void main(String args[]) {
		
		CAI2 initObject = new CAI2();
		initObject.quiz();
		
	}
	
	public void quiz() {
		
		askQuestion();
		readResponse();	
		isAnswerCorrect(response, actualAns);
		
		while (isAnswerCorrect(response, actualAns) == false) {
			displayIncorrectResponse();
			readResponse();	
			isAnswerCorrect(response, actualAns);			
		}
		
		if (isAnswerCorrect(response, actualAns) == true) {
			displayCorrectResponse();
		}
		
	}
	
	public void askQuestion() {
		
		Random SecureRandom = new Random();
		
		int x, y;
		
		x = SecureRandom.nextInt(10);
		y = SecureRandom.nextInt(10);
		
		System.out.printf("How much is %d times %d?\n", x, y);
		
		int z = x*y;
		
		actualAns = z;
		
	}
	
	public int readResponse() {
		
		Scanner scanAns = new Scanner(System.in);
		int scan = scanAns.nextInt();
		
		response = scan;
		return response;
		
	}
	
	private boolean isAnswerCorrect(int inputAns, int product) {
		
		if (inputAns != product) {
			return false;
		}
		else {
			return true;
		}
		
	}

	public void displayCorrectResponse() {
		
		Random correctRandMsg = new Random();
		int switchNum;
		switchNum = correctRandMsg.nextInt(4) + 1;
		
		switch (switchNum) {
			case 1: System.out.println("Very Good!");
			break;
			case 2: System.out.println("Excellent!");
			break;
			case 3: System.out.println("Nice Work!");
			break;
			case 4: System.out.println("Keep up the good work!");
			break;
		}
	}

	public void displayIncorrectResponse() {
		
		Random correctRandMsg = new Random();
		int switchNum;
		switchNum = correctRandMsg.nextInt(4) + 1;
		
		switch (switchNum) {
			case 1: System.out.println("No. Please try again.");
			break;
			case 2: System.out.println("Wrong. Try once more.");
			break;
			case 3: System.out.println("Don’t give up!");
			break;
			case 4: System.out.println("No. Keep trying.");
			break;
		}
	}
	
}