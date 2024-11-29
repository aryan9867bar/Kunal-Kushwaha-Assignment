//11. Reverse number
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int n = sc.nextInt();                 // int n = 23597
        int ans = 0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            ans = ans*10+rem;
        }
        System.out.println(ans);
    }
}
