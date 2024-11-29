// 5. Take 2 numbers as input and print the largest number.
import java.util.*;

public class largest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        int max = Math.max(a,b);
        System.out.println(max + " is the Largest Number");
    }
}
