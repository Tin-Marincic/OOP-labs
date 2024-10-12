package Week_2;

//Create a program that asks the user for three numbers and then prints their sum
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int suma = 0;
        for(int i = 0; i < 3; i++){
            System.out.println("Enter a number please ");
            Scanner reader = new Scanner(System.in);
            suma += reader.nextInt();
        }
        System.out.println("The sum of the numbers is: " + suma);
    }
}
