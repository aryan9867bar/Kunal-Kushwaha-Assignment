package Basic;
// 10. Perimeter Of Parallelogram

import java.util.*;

public class perimeterofparallelogram10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of the parallelogram: ");
        int b = sc.nextInt();
        System.out.println("Enter side of the parallelogram: ");
        int a = sc.nextInt();
        double perimeter = 2*(a+b);
        System.out.println("Perimeter of Parallelogram is : " + perimeter);
    }
}
