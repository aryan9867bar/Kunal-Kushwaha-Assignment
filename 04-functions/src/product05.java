// 5. Define a method that returns the product of two numbers entered by user.
import java.util.*;
public class product05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int a = sc.nextInt();
        System.out.println("Enter your second number : ");
        int b = sc.nextInt();

        int product = calculateProduct(a, b);
        System.out.println("The product is : " + product);
    }
    static int calculateProduct(int x, int y) {
        return x * y;
    }
}
