package Azhar_problem1;

import java.util.Random;
import java.util.Scanner;
public class CAI4 {
	
	private int actualAns;
	private int response;
	
	public static void main(String args[]) {
		
		CAI4 initObject = new CAI4();
		initObject.quiz();
		
	}
	
	public void quiz() {
		
		int difficulty = readDifficulty();
		
		int storedResponses[] = new int[10];
		
		int i, counter = 0;
		for (i = 0; i < 10; i++) {
			
			int[] randomNumbers = new int[2];
			randomNumbers = generateQuestionArgument(difficulty);
			
			askQuestion(randomNumbers);
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
	
	public void askQuestion(int[] randomNum) {
		
		int x = randomNum[0];
		int y = randomNum[1];
		
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
	
	public int readDifficulty() {
		
		Scanner diffLevel = new Scanner(System.in);
		System.out.println("Enter a difficulty level between 1 - 4:");
		int responseLevel = diffLevel.nextInt();
		
		return responseLevel;
		
	}
	
	public int[] generateQuestionArgument(int difficulty) {
		
		int[] number = new int[2];
		
		if (difficulty == 1) {
			Random secureRandom1 = new Random();
			int num1 = secureRandom1.nextInt(10);
			int num2 = secureRandom1.nextInt(10);
			
			number[0] = num1;
			number[1] = num2;
			
		}
		
		else if (difficulty == 2) {
			Random secureRandom2 = new Random();
			int num1 = secureRandom2.nextInt(100);
			int num2 = secureRandom2.nextInt(100);

			number[0] = num1;
			number[1] = num2;
			
		}
		
		else if (difficulty == 3) {
			Random secureRandom3 = new Random();
			int num1 = secureRandom3.nextInt(1000);
			int num2 = secureRandom3.nextInt(1000);

			number[0] = num1;
			number[1] = num2;
			
		}
		
		else if (difficulty == 4) {
			Random secureRandom4 = new Random();
			int num1 = secureRandom4.nextInt(10000);
			int num2 = secureRandom4.nextInt(10000);

			number[0] = num1;
			number[1] = num2;
			
		}
		
		return number;
		
	}	
}