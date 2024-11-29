package Basic;
// 21. Fibonacci Series In Java Programs

import java.util.*;

public class fibonacci21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 1;
        while(count<=n){
            System.out.println(a);
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
    }
}
