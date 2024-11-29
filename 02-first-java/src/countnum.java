//10. Count Number given number from video
import java.util.*;
public class countnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int n = sc.nextInt(); //int n = 1385757879 ans = 3
        System.out.println("Enter your Number to be counted: ");
        int y = sc.nextInt();
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem==y){         // y = 7 y session removed
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
