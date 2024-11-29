package Intermediate;
// 7. Power In Java
import java.util.*;

public class power07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        double a = sc.nextDouble();
        System.out.println("Enter Second Number: ");
        double b = sc.nextDouble();
        System.out.println(Math.pow(a, b) + " is the power in java");
    }
}
