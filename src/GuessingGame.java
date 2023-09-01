import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        boolean runTheGame = true;

        while (runTheGame) {
            int numberToGuess = random.nextInt(10) + 1;
            System.out.println("Welcome to the guessing game!!");
            System.out.println("Guess an integer between 1 and 10");
            System.out.println("You get 3 tries. Good luck!!");
            int tries = 0;

            while (tries < 3) {
                int guessedNumber = keyboard.nextInt();
                tries++;
                if (guessedNumber < numberToGuess) {
                    System.out.println("My number is higher");
                } else if (guessedNumber > numberToGuess) {
                    System.out.println("My number is lower");
                } else {
                    System.out.println("You guessed the right number!!");
                    System.out.println("Do you want to play again? Type 'yes' to play again and 'no' to end the game.");

                    String playAgainChoice = keyboard.next();

                    if (playAgainChoice.equalsIgnoreCase("yes")) {
                        runTheGame = true;
                        break;
                    } else if (playAgainChoice.equalsIgnoreCase("no")) {
                        runTheGame = false;
                        System.out.println("Thanks for playing!");
                        break;
                    }
                }

                if (tries == 3) {
                    System.out.println("Out of tries. Sorry! The number was: " + numberToGuess);
                    System.out.println("Do you want to play again? Type 'yes' to play again and 'no' to end the game.");

                    String playAgainChoice = keyboard.next();
/*
                    if (playAgainChoice.equalsIgnoreCase("yes")) {
                        runTheGame = true;
                    } else */
                    if (playAgainChoice.equalsIgnoreCase("no")) {
                        runTheGame = false;
                        System.out.println("Thanks for playing!");
                    }
                }
            }
        }

        keyboard.close();
    }
}

