package Week_2;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        // The correct password
        String password = "blabla";

        // Create a Scanner object to read user input
        Scanner reader = new Scanner(System.in);

        String input = ""; // Variable to store the user's input

        // Keep asking the user until they enter the correct password
        while (!input.equals(password)) {
            System.out.println("Enter your password: ");
            input = reader.nextLine(); // Read user input
        }

        // If the correct password is entered, display a secret message
        System.out.println("Access granted! Here is the secret message.");
        System.out.println("sike");
    }
}
