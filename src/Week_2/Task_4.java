package Week_2;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner reader = new Scanner(System.in);

        // Ask the user for the first and last numbers
        System.out.print("Enter the first number: ");
        int first = reader.nextInt();

        System.out.print("Enter the last number: ");
        int last = reader.nextInt();

        if (first <= last) {
            int num = first;
            while (num <= last) {
                System.out.println(num);
                num++;
            }
        } else {
            int num = first;
            while (num >= last) {
                System.out.println(num);
                num--;
            }
        }
    }
}
