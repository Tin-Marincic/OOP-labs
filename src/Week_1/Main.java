package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*1.// Create a program that prints your name to the screen. The program output should resemble the following:
        System.out.print("My name is Tin");
        */
        /*2. // Create a program that prints out the following:

        System.out.println("Hello World");
        System.out.println("(and all the people of the world)");
        /*
        /*3. // Create a program that counts and displays how many seconds there are in a year. You can assume that a year consists of 365 days (therefore the year is not a leap year).
        int year_to_seconds = 365*24*60*60;
        System.out.println("Assuming a year is 365 instead of 365.25, one year converted to seconds is, " + year_to_seconds);
        */

        //4. Create a program that asks the user for two integers and then prints their sum.
/*
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = Integer.parseInt(reader.nextLine());


        System.out.print("Enter the second integer: ");
        int num2 = Integer.parseInt(reader.nextLine());

        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        reader.close();
*/

        //5. Create a program that asks the user
        // for a number and tells if the number is positive (i.e. greater than zero).
/*
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num = Integer.parseInt(reader.nextLine());

        if(num > 0){
            System.out.print("Positive");
        }
        if(num == 0){
            System.out.print("Zero");
        }
        else{
            System.out.println("Negative");
        }

 */

        //6. Create a program that asks the user for two numbers and prints the greater of those two.
        // The program should also handle the case in which the two numbers are equal.
/*
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = reader.nextInt();
        System.out.println("Enter second number: ");
        int num2 = reader.nextInt();

        if(num1 > num2){
            System.out.println("The greater number is: " + num1);
        }
        else if(num1 < num2){
            System.out.println("The greater number is: " + num2);
        }
        else{
            System.out.println("They are the same");
        }
*/
    }
}
