package Basic;
// 6. Area Of Rhombus

import java.util.*;

public class areaofrhombus06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Diagonal: ");
        int p = sc.nextInt();
        System.out.println("Enter Second Diagonal: ");
        int q = sc.nextInt();
        double area = 0.5*p*q;
        System.out.println("Area of Rhombus is : " + area);
    }
}
