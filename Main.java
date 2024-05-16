import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hangman game = new Hangman("Rockets");

        System.out.println("Welcome to Hangman!\n");

        while (!game.isGameOver()) {
            System.out.println("Word: " + game.getCurrentGuess());
            System.out.println("Attempts remaining: " + game.getAttemptsLeft());
            System.out.print("Guess a letter: ");
            char guess = scanner.nextLine().charAt(0);

            if (!game.makeGuess(guess)) {
                System.out.println("Incorrect guess!\n");
            }
        }

        if (game.isGameWon()) {
            System.out.println("\nCongratulations! You've guessed the word: " + game.getCurrentGuess());
        } else {
            System.out.println("\nGame Over! The word was: " + "Rockets");
        }

        scanner.close();
    }
}
