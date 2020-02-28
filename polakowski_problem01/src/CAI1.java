

import java.util.Random;
import java.util.Scanner;

public class CAI1 {
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
		System.out.println("No. Please try again.");
	}

	public static void displayCorrectResponse() {
		System.out.println("Very good!");
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
// Next the response should be read by the program
// next the program should check if the answer is correct