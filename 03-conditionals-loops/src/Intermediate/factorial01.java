package Intermediate;
// 1. Factorial Program In Java
import  java.util.*;
public class factorial01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }
}
