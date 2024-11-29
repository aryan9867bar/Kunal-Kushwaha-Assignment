package Intermediate;
// 8. Calculate Depreciation of Value
import java.util.*;

public class depriciation08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount");
        long amount = sc.nextLong();
        System.out.println("Enter Depreciation percentage");
        long deppercent = sc.nextLong();
        System.out.println("Enter number of years");
        long year=sc.nextLong();
        long temp = amount;
        for(int i=0;i<year;i++) {
            temp = ((100 - deppercent) * temp) / 100;
        }
        System.out.println("After Depreciation = "+temp);
    }
}
