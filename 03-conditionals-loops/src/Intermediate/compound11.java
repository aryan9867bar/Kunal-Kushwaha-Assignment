package Intermediate;
// 11. Compound Interest Java Program
import java.util.*;

public class compound11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Principle number : ");
        double principle = sc.nextInt();
        System.out.print("Enter Interest rate : ");
        double rate = sc.nextInt();
        System.out.print("Enter a Time period in years : ");
        double time = sc.nextInt();
        double compound_interest = principle * (Math.pow((1 + rate / 100), time)) - principle;
        System.out.println("The Compound Interest is : " + compound_interest);
    }
}
