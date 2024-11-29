package Intermediate;
// 18. Future Investment Value
import java.util.*;

public class investment18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter present value: ");
        double p = sc.nextInt();
        System.out.print("Enter the interest rate: ");
        double r = sc.nextInt();
        System.out.print("Enter the time period in years: ");
        double t = sc.nextInt();
        double f = p*Math.pow((1+r/100),t);
        System.out.print("The Future Investment Value is: "+f);
    }
}
