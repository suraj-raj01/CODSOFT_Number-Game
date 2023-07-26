//This is the Number Guessing Game 

import java.util.Scanner;

public class Main {

    // Function that implements the
    // number guessing game
    public static void guessingNumberGame() {
        // Scanner Class
        Scanner sc = new Scanner(System.in);

        // Generate the numbers
        int number = 1 + (int) (100
                * Math.random());

        // Given K trials
        int K = 5;

        int i, guess;

        System.out.println("--------------------------------------------------------------------");
        System.out.println("|    Welcome to number Guessing Game                               |");
        System.out.println("|    You have Maximum 5 Attempt Limit!                             |");
        System.out.println("|    If your guess number is Correct then you will win the Game    |");
        System.out.println("--------------------------------------------------------------------");

        // Iterate over K Trials
        for (i = 0; i < K; i++) {

            System.out.print("\t\tGuess the number: ");

            // Take input for guessing
            guess = sc.nextInt();
            // If the number is guessed
            if (number == guess) {
                System.out.println(
                        "\t\tCongratulations! You guessed the number.");
                break;
            } else if (number > guess
                    && i != K - 1) {
                System.out.println(
                        "\t\tThe number is greater than " + guess + "\n");
            } else if (number < guess
                    && i != K - 1) {
                System.out.println(
                        "\t\tThe number is less than " + guess + "\n");
            }
        }

        if (i == K) {
            System.out.println(
                    "\n\t\tYou have exhausted " + K + " trials.");

            System.out.println(
                    "\t\tThe number was " + number);
            System.out.println("\t\tThank you for show your interest with us!!\n\n");

        }
    }

    // Driver Code
    public static void main(String arg[]) {

        // Function Call
        guessingNumberGame();
    }
}

// ~ By Suraj Kumar