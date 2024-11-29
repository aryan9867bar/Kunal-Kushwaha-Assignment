package Intermediate;
// 26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
import java.util.*;

public class negative26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        while (true) {
            System.out.println("Enter numbers or Enter 0 to stop :");
            int number = sc.nextInt();

            // Stop the loop if the user enters 0
            if (number == 0) {
                break;
            }

            // Check if the number is negative
            if (number < 0) {
                sumNegative += number;
            }
            // Check if the number is positive and even
            else if (number > 0 && number % 2 == 0) {
                sumPositiveEven += number;
            }
            // Check if the number is positive and odd
            else if (number > 0 && number % 2 != 0) {
                sumPositiveOdd += number;
            }
        }

        // Output the results
        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
    }
}
