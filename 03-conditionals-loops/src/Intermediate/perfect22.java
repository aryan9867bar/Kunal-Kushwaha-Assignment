package Intermediate;
// 22. Perfect Number In Java
import java.util.*;

public class perfect22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        System.out.print("Enter the number: ");
        long n=sc.nextLong();
        int i=1;
        //executes until the condition becomes false
        while(i <= n/2)
        {
            if(n % i == 0)
            {
                //calculates the sum of factors
                sum = sum + i;
            }
            i++;
        }
        //compares sum with the number
        if(sum==n)
        {
            //prints if sum and n are equal
            System.out.println(n+" is a perfect number.");
        }
        else
            //prints if sum and n are not equal
            System.out.println(n+" is not a perfect number.");
    }
}
