package Basic;
// 26. Addition Of Two Numbers

import java.util.*;

public class addition26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println(sum + " is the addition of two numbers");
    }
}
