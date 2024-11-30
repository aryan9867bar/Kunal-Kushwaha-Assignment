// 12. Write a function that returns all prime numbers between two given numbers.
import java.util.*;
public class primebetween12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a start number to check if it's prime: ");
        int start = sc.nextInt();
        System.out.print("Enter a end number to check if it's prime: ");
        int end = sc.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        printPrimesBetween(start, end);
    }
    static void printPrimesBetween(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " "); // Print the prime number
            }
        }
        System.out.println(); // New line after the list of primes
    }
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) { // i <= Math.sqrt(num)
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
