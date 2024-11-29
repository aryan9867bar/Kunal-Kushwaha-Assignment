// 1. Input a year and find whether it is a leap year or not.
import java.util.*;

public class leap01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int a = sc.nextInt();
        if(a%400==0){
            System.out.println("Leap Year");
        }
        else if(a%100==0){
            System.out.println("Not a Leap Year");
        }
        if(a%4==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
