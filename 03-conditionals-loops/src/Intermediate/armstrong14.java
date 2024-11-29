package Intermediate;
// 14. Armstrong Number In Java
import java.util.*;

public class armstrong14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number from you want : ");
        int x = sc.nextInt();
        System.out.println("Enter last Number: ");
        int y = sc.nextInt();
        for (int i = x; i < y; i++) {
            int check, rem, sum=0;
            check = i;
            while(check!=0){
                rem = check%10;
                sum = sum+(rem*rem*rem);
                check = check/10;
            }
            if(sum==i){
                System.out.println(""+i+"is an Armstrong Number");
            }
        }
    }
}
