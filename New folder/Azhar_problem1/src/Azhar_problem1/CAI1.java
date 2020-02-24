package Azhar_problem1;

import java.util.Random;
import java.util.Scanner;
public class CAI1 {
	
	private int actualAns;
	private int response;
	
	public static void main(String args[]) {
		
		CAI1 initObject = new CAI1();
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
		System.out.println("Very good!");
	}

	public void displayIncorrectResponse() {
		System.out.println("No. Please try again.");
	}
	
}