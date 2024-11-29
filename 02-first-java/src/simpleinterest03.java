// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.*;

public class simpleinterest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value Principal: ");
        float p = sc.nextFloat();
        System.out.println("Enter the value of Time: ");
        float t = sc.nextFloat();
        System.out.println("Enter the value of rate: ");
        float r = sc.nextFloat();
        float s = (p*t*r)/100;
        System.out.println("The value of Simple Interest is: "+s);
    }
}
