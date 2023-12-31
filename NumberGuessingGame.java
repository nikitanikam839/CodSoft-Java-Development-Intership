import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Random rand = new Random();

		Scanner sc = new Scanner(System.in);

		int attempts = 0;
		int maxattempts = 5;
		int score = 0;
		do {

			int NumberGuess = rand.nextInt(100) + 1;

			System.out.println("Guess a random number between 1 to 100: ");

			while (attempts < maxattempts) {
				int guess = sc.nextInt();
				attempts++;

				if (guess == NumberGuess) {
					System.out.println("Congratulation You guessed the right number in " + attempts + " attempts");
					score++;
					System.out.println("Score: " + score);
					break;

				} else if (guess < NumberGuess) {
					System.out.println("Your guess is too low.Try again");
				} else {
					System.out.println("Your guess is too high.Try again");
				}
			}

			if (attempts == maxattempts) {
				System.out.println("Sorry, you've reached the maximum number of attempts." + " The correct number was: "
						+ NumberGuess);
				break;
			}

			System.out.println("\nDo you want to play again?(Yes/No): ");

		} while (sc.nextLine().equalsIgnoreCase("Yes"));
		sc.close();

		System.out.println("your final score is: " + score);
		System.out.println("Thanks for playing");
	}

}
