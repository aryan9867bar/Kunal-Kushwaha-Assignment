// 2. Define a program to find out whether a given number is even or odd.
import java.util.*;

public class evenorodd02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        checkEvenOdd(num);
    }
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}
