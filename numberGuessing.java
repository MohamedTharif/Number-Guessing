import java.util.Random;
import java.util.Scanner;

class NumberGuessing {
    private static final int MAX_ATTEMPTS = 8;

    private static int generateRandomNumber(int high, int low) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\t\t\t****__Number Guessing Game__*****");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts to find the number.");

        System.out.println("Enter the Upper Bound (higher value) of the Guessing Number:");
        int upperBound = scanner.nextInt();

        System.out.println("Enter the Lower Bound (lower value) of the Guessing Number:");
        int lowerBound = scanner.nextInt();

        if (upperBound <= lowerBound) {
            System.out.println("Invalid range. Upper bound must be greater than lower bound.");
            return;
        }

        int actualNumber = generateRandomNumber(upperBound, lowerBound);

        int attempts = 0;
        int guess;

        while (attempts < MAX_ATTEMPTS) {
            System.out.println("Guess the Number:");
            guess = scanner.nextInt();
            attempts++;

            if (guess < lowerBound || guess > upperBound)
           {
                System.out.println("Your guess is out of range. It should be between " + lowerBound + " and " + upperBound);
            } else if (guess == actualNumber) 
            {
                System.out.println("Congratulations! You Guessed the Correct Number in " + attempts + " attempts.");
                return;
            } else
            {
                System.out.println("Wrong guess. Try again.");
                if (guess < actualNumber) {
                    System.out.println("Try guessing a higher number.");
                } else {
                    System.out.println("Try guessing a lower number.");
                }
            }
        }

        System.out.println("Sorry, you've used all " + MAX_ATTEMPTS + " attempts. The correct number was: " + actualNumber);
    }
}
