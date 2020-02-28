

import java.util.Random;
import java.util.Scanner;

public class CAI5 {
	static int Operator1;
	static int correctAnswer;
	static int problemResponse;
	static int ratingResponse;
	static double result = 10;
	static int a;
	static int b;
	static int c;

	public static void main(String[] args) {
		Quiz();
	}

	public static void Quiz() {
		String tryAgain;
		readDifficulty();
		readProblemType();
		for (int i = 10; i > 0; i--) {
			askQuestion();
			readResponse();
			isAnswerCorrect();
		}
		displayCompletionMessage();
		System.out.print("Would you like to try more problems? enter yes or no please");
		Scanner scan = new Scanner(System.in);
		tryAgain = scan.nextLine();
		if (tryAgain.equals("yes")) {
			Quiz();
		} else if (tryAgain.equals("no")) {
			System.exit(0);
		}
	}

	public static void displayIncorrectResponse() {
		int wrongResponse;
		Random rand = new Random();
		wrongResponse = rand.nextInt(3) + 1;

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
		correctResponse = rand.nextInt(3) + 1;
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
		Random rand = new Random();
		if (problemResponse == 1) {
			correctAnswer = a + b;

		} else if (problemResponse == 2) {
			correctAnswer = a * b;
		} else if (problemResponse == 3) {
			correctAnswer = a - b;
		} else if (problemResponse == 4) {
			correctAnswer = a / b;

		} else if (problemResponse == 5) {
			switch (Operator1) {
			case 1:
				Operator1 = 1;
				correctAnswer = a + b;
				break;
			case 2:
				Operator1 = 2;
				correctAnswer = a * b;
				break;
			case 3:
				Operator1 = 3;
				correctAnswer = a - b;
				break;
			case 4:
				Operator1 = 4;
				correctAnswer = a / b;
				break;
			}
		}
		if (correctAnswer == c) {
			displayCorrectResponse();
		} else if (correctAnswer != c) {
			displayIncorrectResponse();
			result = result - 1;
		}

	}

	public static void askQuestion() {
		Random rand = new Random();
		if (ratingResponse == 1) {
			a = rand.nextInt(9);
			b = rand.nextInt(9);
		} else if (ratingResponse == 2) {
			a = rand.nextInt(10);
			b = rand.nextInt(10);
		} else if (ratingResponse == 3) {
			a = rand.nextInt(100);
			b = rand.nextInt(100);
		} else if (ratingResponse == 4) {
			a = rand.nextInt(1000);
			b = rand.nextInt(1000);
		}
		switch (problemResponse) {
		case 1:
			problemResponse = 1;
			System.out.print("What is ");
			System.out.print("" + a);
			System.out.print(" + ");
			System.out.print("" + b);
			System.out.print("");
			break;
		case 2:
			problemResponse = 2;
			System.out.print("What is ");
			System.out.print("" + a);
			System.out.print(" times ");
			System.out.print("" + b);
			System.out.print("");
			break;
		case 3:
			problemResponse = 3;
			System.out.print("What is ");
			System.out.print("" + a);
			System.out.print(" - ");
			System.out.print("" + b);
			System.out.print("");
			break;
		case 4:
			problemResponse = 4;
			System.out.print("What is ");
			System.out.print("" + a);
			System.out.print(" divided by ");
			System.out.print("" + b);
			System.out.print("");
			break;
		}
		Operator1 = rand.nextInt(3) + 1;

		if (problemResponse == 5) {
			switch (Operator1) {
			case 1:
				Operator1 = 1;
				System.out.print("What is ");
				System.out.print("" + a);
				System.out.print(" + ");
				System.out.print("" + b);
				System.out.print("");
				break;
			case 2:
				Operator1 = 2;
				System.out.print("What is ");
				System.out.print("" + a);
				System.out.print(" times ");
				System.out.print("" + b);
				System.out.print("");
				break;
			case 3:
				Operator1 = 3;
				System.out.print("What is ");
				System.out.print("" + a);
				System.out.print(" - ");
				System.out.print("" + b);
				System.out.print("");
				break;
			case 4:
				Operator1 = 4;
				System.out.print("What is ");
				System.out.print("" + a);
				System.out.print(" divided by ");
				System.out.print("" + b);
				System.out.print("");
				break;

			}
		}
	}

	public static int readResponse() {
		Scanner studentAnswer = new Scanner(System.in);
		// scanning for user input

		return c = studentAnswer.nextInt();
		// returns the students answer to a variable c
	}

	public static void displayCompletionMessage() {
		System.out.print("You achieved a: " + result / 10 * 100);
		System.out.print("%");
		if (result < 7.5) {
			System.out.println(" Please ask your teacher for extra help.");
		} else {
			System.out.println(" Congratulations, you are ready to go to the next level!");
		}
	}

	public static int readDifficulty() {
		System.out.println("choose 1 for working with numbers 0 to 9");
		System.out.println("choose 2 for working with numbers 0 to 10");
		System.out.println("choose 3 for working with numbers 0 to 100");
		System.out.println("choose 4 for working with numbers 0 to 1000");
		Scanner difficultyRating = new Scanner(System.in);

		return ratingResponse = difficultyRating.nextInt();
	}

	public static int readProblemType() {
		System.out.println("choose 1 for addition problems");
		System.out.println("choose 2 for multiplication problems");
		System.out.println("choose 3 for subtraction problems");
		System.out.println("choose 4 for division problems");
		System.out.println("choose 5 for a mixture of all problems");
		Scanner problemType = new Scanner(System.in);

		return problemResponse = problemType.nextInt();
	}
}

// The problem should first give student a problem using ask question.
// Next the response should be read by the program
// next the program should check if the answer is correct
// The program should repeat 10 times while storing answers
// The program should take the percentage of correct answers from student input