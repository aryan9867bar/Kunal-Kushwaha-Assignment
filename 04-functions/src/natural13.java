// 13. Write a function that returns the sum of first n natural numbers.
import java.util.*;
public class natural13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        int sum = sumOfNaturalNumbers(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
    static int sumOfNaturalNumbers(int n) {
        return (n * (n + 1)) / 2;
    }
}
