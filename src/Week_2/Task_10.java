package Week_2;
import java.util.Scanner;
import java.util.Random;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(101);
        int numberOfGuesses = 0;
        int userGuess = -1;

        System.out.println("Guess the number: ");


        while (userGuess != numberToGuess) {
            userGuess = scanner.nextInt();
            numberOfGuesses++;

            if (userGuess < numberToGuess) {
                System.out.println("Higher!  -  This is your " + numberOfGuesses + ". guess !");
            } else if (userGuess > numberToGuess) {
                System.out.println("Lower!   -  This is your " + numberOfGuesses + ". guess !");
            } else {
                System.out.println("You are correct!");
            }
        }


        System.out.println("You made " + numberOfGuesses + " guesses!");

        scanner.close();
    }
}
