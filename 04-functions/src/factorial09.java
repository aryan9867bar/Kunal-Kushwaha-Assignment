// 9. Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
//4! = 1 * 2 * 3 * 4 = 24
//3! = 3 * 2 * 1 = 6
//2! = 2 * 1 = 2
//Also,
//1! = 1
//0! = 1

import java.util.*;
public class factorial09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = fact(number);
            System.out.println("The factorial of " + number + " is: " + result);
        }
    }
    static long fact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        long factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
