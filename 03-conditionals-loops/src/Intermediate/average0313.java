package Intermediate;
// 3. Calculate Average Of N Numbers
//13. Sum Of N Numbers
import java.util.*;

public class average0313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Limit: ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter The Number "+i+": ");
            int a = sc.nextInt();
            sum+=a;
        }
        System.out.println("The sum of given numbers is : "+sum);
        System.out.println("The Average of given numbers is : "+sum/n);
    }
}
