

import java.util.Random;
import java.util.Scanner;

public class CAI2 {
// variable declaration
	static int a;
	static int b;
	static int c;

	public static void main(String[] args) {
// Calling Quiz
		Quiz();
	}

	public static void Quiz() {
		askQuestion();
		readResponse();
		isAnswerCorrect();
	}

	public static void displayIncorrectResponse() {
		int wrongResponse;
		Random rand = new Random();
		wrongResponse = rand.nextInt(4);
		if (wrongResponse == 0) {
			wrongResponse = +1;
		}
		switch (wrongResponse) {
		case 1:
			wrongResponse = 1;
			System.out.println("No. Please try again.");
			break;
		case 2:
			wrongResponse = 2;
			System.out.println("Wrong. Try once more.");
			break;
		case 3:
			wrongResponse = 3;
			System.out.println("Don’t give up!");
			break;
		case 4:
			wrongResponse = 4;
			System.out.println("No. Keep trying.");
			break;
		}
	}

	public static void displayCorrectResponse() {
		int correctResponse;
		Random rand = new Random();

		correctResponse = rand.nextInt(4);

		if (correctResponse == 0) {
			correctResponse = +1;
		}
		switch (correctResponse) {
		case 1:
			correctResponse = 1;
			System.out.println("Very good!");
			break;
		case 2:
			correctResponse = 2;
			System.out.println("Excellent!");
			break;
		case 3:
			correctResponse = 3;
			System.out.println("Nice work!");
			break;
		case 4:
			correctResponse = 4;
			System.out.println("Keep up the good work!");
			break;
		}
	}

	public static void isAnswerCorrect() {
		int placeHolder = a * b;
		if (placeHolder == c) {
			displayCorrectResponse();
		}
		while (placeHolder != c) {
			displayIncorrectResponse();
			readResponse();
			if (placeHolder == c) {
				displayCorrectResponse();

			}
		}

	}

	public static void askQuestion() {
		Random rand = new Random();
		a = rand.nextInt(9);
		b = rand.nextInt(9);
		System.out.print("What is ");
		System.out.print("" + a);
		System.out.print(" times ");
		System.out.print("" + b);

	}

	public static int readResponse() {
		Scanner studentAnswer = new Scanner(System.in);
		// scanning for user input

		return c = studentAnswer.nextInt();
		// returns the students answer to a variable c
	}

}
// The problem should first give student a problem using ask question.
//Next the response should be read by the program
// next the program should check if the answer is correct
