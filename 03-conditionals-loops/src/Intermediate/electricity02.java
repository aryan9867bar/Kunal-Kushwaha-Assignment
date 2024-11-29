package Intermediate;
// 2. Calculate Electricity Bill

import java.util.*;

public class electricity02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double billToPay = 0;
        System.out.println("Enter number of units for calculating electricity bill.");
        int units = sc.nextInt();
        if(units < 100)
        {
            billToPay = units * 1.20;
        }
        else if(units < 300){
            billToPay = 100 * 1.20 + (units - 100) * 2;
        }
        else if(units > 300)
        {
            billToPay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
        }
        System.out.println("The electricity bill for " +units+ " is : " + billToPay);
    }
}
