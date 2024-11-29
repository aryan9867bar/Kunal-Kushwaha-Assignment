package Intermediate;
// 15. Find Ncr & Npr
import java.util.*;

public class ncrandnpr15 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the Value of r: ");
        int r = sc.nextInt();

        int npr = (fact(n)) / (fact(n-r));
        int ncr = npr/fact(r);

        System.out.println("\nnCr = " +ncr);
        System.out.println("nPr = " +npr);
    }
    public static int fact(int num)
    {
        int fact=1;
        for(int i=1; i<=num; i++)
            fact *= i;
        return fact;
    }
}
