// 2. Take two numbers and print the sum of both.

import java.util.Scanner;

public class sum02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("The sum of both value is "+sum);
    }
}
