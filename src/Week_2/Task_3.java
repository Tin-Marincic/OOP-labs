package Week_2;
import java.util.Scanner;

public class Task_3 {
    //Create a program that reads numbers from the user and prints their sum.
    // The program should stop asking for numbers when the user enters the number 0.
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int suma = 0;
        int num = 1;

        while(num != 0){
            num = reader.nextInt();
            suma += num;
            System.out.println("Suma je " +suma);
        }
    }


}
