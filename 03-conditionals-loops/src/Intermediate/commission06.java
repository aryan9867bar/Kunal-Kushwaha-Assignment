package Intermediate;
// 6. Calculate Commission Percentage
import java.util.*;

public class commission06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter amount:");
        double amount=sc.nextDouble();
        System.out.print("Enter Commission Percentage:");
        double commissionPercentage=sc.nextDouble();
        double commission=(commissionPercentage/100)*amount;
        System.out.println("Commission Amount is: "+commission);
    }
}
