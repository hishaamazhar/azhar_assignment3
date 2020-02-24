package Azhar_problem1;

import java.util.Random;
import java.util.Scanner;
public class CAI3 {
	
	private int actualAns;
	private int response;
	
	public static void main(String args[]) {
		
		CAI3 initObject = new CAI3();
		initObject.quiz();
		
	}
	
	public void quiz() {
		
		int storedResponses[] = new int[10];
		
		int i, counter = 0;
		for (i = 0; i < 10; i++) {
			
			askQuestion();
			readResponse();
			isAnswerCorrect(response, actualAns);
			boolean answer = isAnswerCorrect(response, actualAns);
			
			boolean correctOrNotResponses[] = new boolean[10];
			correctOrNotResponses[i] = answer;
			
			if (correctOrNotResponses[i] == true)
				counter++;
			
			if (isAnswerCorrect(response, actualAns) == true)
				displayCorrectResponse();
			
			if (isAnswerCorrect(response, actualAns) == false)
				displayIncorrectResponse();
			
		}
		
		int percentage;
		percentage = counter * 10;
		
		displayCompletionMessage(percentage);
		quizRedo();
		
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
	
	public void displayCompletionMessage(int score) {
		
		if (score < 75)
			System.out.printf("Your score is %d%%.\nPlease ask your teacher for help.", score);
		else
			System.out.printf("Your score is %d%%.\nCongratulations, you are ready to go to the next level!", score);
		
	}
	
	public void quizRedo() {
		
		Scanner redoOrNot = new Scanner(System.in);
		
		System.out.println("\nWould you like to redo the quiz?\n\n1. Yes\n2. No\n\nPlease enter the number for your choice:");
		int scan = redoOrNot.nextInt();
		
		switch (scan) {
		
		case 1:
			quiz();
			break;
		
		case 2:
			break;
		}
		
	}
	
}