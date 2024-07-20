import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set the difficulty (range of the number)
        int minNumber = 1;
        int maxNumber = 100;

        // Generate a random number
        int secretNumber = (int) (Math.random() * (maxNumber - minNumber + 1)) + minNumber;

        // Set the maximum number of attempts
        int maxAttempts = 5;

        // Game loop
        boolean guessed = false;
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.printf("Guess #%d: ", attempt);
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                guessed = true;
                break;
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }

        scanner.close();

        if (guessed) {
            System.out.println("Congratulations! You guessed the number!");
        } else {
            System.out.println("Sorry, you ran out of attempts. The number was: " + secretNumber);
        }
    }
}
