package Azhar_problem1;

import java.util.Random;
import java.util.Scanner;
public class CAI5 {
	
	// I made responses and answers 'float' instead of 'int' to include division as well to the calculation process.
	
	private double actualAns;
	private double response;
	
	public static void main(String args[]) {
		
		CAI5 initObject = new CAI5();
		initObject.quiz();
		
	}
	
	public void quiz() {
		
		int difficulty = readDifficulty();
		int problem = readProblemType();
		
		int i, counter = 0;
		for (i = 0; i < 10; i++) {
			
			double[] randomNumbers = new double[2];
			randomNumbers = generateQuestionArgument(difficulty);
			
			askQuestion(randomNumbers, problem);
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
	
	public void askQuestion(double[] randomNum, int problemTypeInput) {
		
		double x = randomNum[0], y = randomNum[1];
		
		switch (problemTypeInput) {
		case 1:
			System.out.printf("How much is %.0f plus %.0f?\n", x, y);
			
			actualAns = x + y;
			break;
			
		case 2:
			System.out.printf("How much is %.0f times %.0f?\n", x, y);
			
			actualAns = x * y;
			break;
			
		case 3:
			System.out.printf("How much is %.0f minus %.0f?\n", x, y);
			
			actualAns = x - y;
			break;
			
		case 4:
			System.out.printf("How much is %.0f divided by %.0f?\nRound to 2 decimal places.\n", x, y);
			
			actualAns = Math.round((x/y)*100) / 100.00;
			break;
			
		case 5:
			Random mixture = new Random();
			int randomMixtureNum = mixture.nextInt(4) + 1;
			
			switch (randomMixtureNum) {
			case 1:
				System.out.printf("How much is %.0f plus %.0f?\n", x, y);
				
				actualAns = x + y;
				break;
			
			case 2:
				System.out.printf("How much is %.0f times %.0f?\n", x, y);
				
				actualAns = x * y;
				break;
			
			case 3:
				System.out.printf("How much is %.0f minus %.0f?\n", x, y);
				
				actualAns = x - y;
				break;
				
			case 4:
				System.out.printf("How much is %.0f divided by %.0f?\nRound to 2 decimal places.\n", x, y);
				
				actualAns = Math.round((x/y)*100) / 100.00;
				break;
				
			}
			
			break;
			
		}
		
	}
	
	public double readResponse() {
		
		Scanner scanAns = new Scanner(System.in);
		double scan = scanAns.nextDouble();
		
		response = scan;
		return response;
		
	}
	
	private boolean isAnswerCorrect(double inputAns, double product) {
		
		if (inputAns != product) {
			return false;
		}
		else {
			return true;
		}
		
	}

	public void displayCorrectResponse() {
		
		Random correctRandMsg = new Random();
		int switchNum = correctRandMsg.nextInt(4) + 1;
		
		switch (switchNum) {
			case 1: System.out.println("Very Good!\n");
			break;
			case 2: System.out.println("Excellent!\n");
			break;
			case 3: System.out.println("Nice Work!\n");
			break;
			case 4: System.out.println("Keep up the good work!\n");
			break;
		}
	}

	public void displayIncorrectResponse() {
		
		Random correctRandMsg = new Random();
		int switchNum;
		switchNum = correctRandMsg.nextInt(4) + 1;
		
		switch (switchNum) {
			case 1: System.out.println("No. Please try again.\n");
			break;
			case 2: System.out.println("Wrong. Try once more.\n");
			break;
			case 3: System.out.println("Don’t give up!\n");
			break;
			case 4: System.out.println("No. Keep trying.\n");
			break;
		}
	}
	
	public void displayCompletionMessage(int score) {
		
		if (score < 75)
			System.out.printf("\nYour score is %d%%.\nPlease ask your teacher for help.", score);
		else
			System.out.printf("Your score is %d%%.\nCongratulations, you are ready to go to the next level!\n", score);
		
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
	
	public double[] generateQuestionArgument(int difficulty) {
		
		double[] number = new double[2];
		
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
	
	public int readProblemType() {
		
		System.out.println("Choose and enter the number for the respective problem type you wish to do.");
		System.out.println("1. Addition\n2. Multiplication\n3. Subtraction\n4. Division\n5. Random mixture of all of the above.");
		
		Scanner problemType = new Scanner(System.in);
		int problemResponse = problemType.nextInt();
		
		return problemResponse;
		
	}
	
}