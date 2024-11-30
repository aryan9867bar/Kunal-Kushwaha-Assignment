// 11. Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
import java.util.*;
public class triplet11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = sc.nextInt();
        System.out.print("Enter the third number (c): ");
        int c = sc.nextInt();
        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println("The triplet (" + a + ", " + b + ", " + c + ") is a Pythagorean triplet.");
        } else {
            System.out.println("The triplet (" + a + ", " + b + ", " + c + ") is not a Pythagorean triplet.");
        }
    }
    static boolean isPythagoreanTriplet(int a, int b, int c) {
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
    }
}
