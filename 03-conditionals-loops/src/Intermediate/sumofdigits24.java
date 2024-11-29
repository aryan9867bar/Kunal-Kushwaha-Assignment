package Intermediate;
// 24. Sum Of A Digits Of Number

import java.util.Scanner;

public class sumofdigits24 {
    public static void main(String[] args) {
        int num, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        num = sc.nextInt();
        while(num > 0)
        {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Sum of Digits: "+sum);
    }
}
