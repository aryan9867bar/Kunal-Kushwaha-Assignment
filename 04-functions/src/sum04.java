// 4. Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.*;
public class sum04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int a = sc.nextInt();
        System.out.println("Enter your second number : ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("The sum is : " + sum);
    }

    static int calculateSum(int x, int y) {
        return x + y;
    }
}
