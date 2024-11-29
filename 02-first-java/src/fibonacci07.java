// 7. To calculate Fibonacci Series up to n numbers. for printing from start
import java.util.*;

public class fibonacci07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        if (n >= 1) {
            System.out.print(a + "\n");
        }
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
            System.out.println(a);
        }
        System.out.println(b);
    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of terms: ");
//        int n = sc.nextInt();
//
//        int a = 0, b = 1;
//
//        System.out.println("Fibonacci Series:");
//        for (int i = 0; i <= n; i++) {
//            System.out.print(a + " ");
//            int temp = b;
//            b = b + a;
//            a = temp;
////            int next = a + b;
////            a = b;
////            b = next;
//        }
//    }
}
