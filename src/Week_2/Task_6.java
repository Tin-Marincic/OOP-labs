package Week_2;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many times do you want to print the text? ");
        int times = scanner.nextInt();
        printText(times);
        scanner.close();
    }

    public static void printText(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("In the beginning there were the swamp, the hoe and Java.");
        }
    }
}



