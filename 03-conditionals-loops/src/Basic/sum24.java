package Basic;
// 24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.*;

public class sum24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = 1;
        while(num!=0){
            System.out.println("Enter all numbers to be sum up: ");
            num = sc.nextInt();
            sum = sum + num;
        }
        System.out.println(sum+ " is the sum of all numbers");
    }
}
