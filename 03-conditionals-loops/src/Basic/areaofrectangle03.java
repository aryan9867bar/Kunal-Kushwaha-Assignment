package Basic;

import java.util.*;

// 3. Area Of Rectangle Program

public class areaofrectangle03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter width of Rectangle: ");
        int b = sc.nextInt();
        double area = l*b;
        System.out.println("Area of Rectangle is : " + area);
    }
}
