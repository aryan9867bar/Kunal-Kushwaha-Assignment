package Basic;
// 22. Subtract the Product and Sum of Digits of an Integer

import java.util.*;

public class sub22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        int x = product - sum;
        System.out.println(x);
    }
}
