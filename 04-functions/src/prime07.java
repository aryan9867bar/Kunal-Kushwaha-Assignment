// 7. Define a method to find out if a number is prime or not.
import java.util.*;
public class prime07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
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
