// 1. Write a program to print whether a number is even or odd, also take input from the user.
import java.util.*;

public class evenodd01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is the Even Number");
        }
        else{
            System.out.println(num+" is the Odd Number");
        }
    }
}
