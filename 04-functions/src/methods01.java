// 1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.*;

public class methods01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int n2 = sc.nextInt();
        System.out.println("Enter third number : ");
        int n3 = sc.nextInt();

        int max = findMaximum(n1, n2, n3);
        int min = findMinimum(n1, n2, n3);

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }

    public static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int findMinimum(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
