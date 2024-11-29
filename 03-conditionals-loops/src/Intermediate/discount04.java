package Intermediate;
// 4. Calculate Discount Of Product
import java.util.*;

public class discount04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the market price: ");
        double markedprice = sc.nextDouble();
        System.out.println("Enter discount percentage: ");
        double dis = sc.nextDouble();
        double s = 100-dis;
        double amount= (s*markedprice)/100;
        System.out.println("amount after discount is: "+amount);
    }
}
