package Basic;
// 7. Area Of Equilateral Triangle

import java.util.*;

public class areaofequilateral07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of the equilateral triangle: ");
        int a = sc.nextInt();
        double area = (1.732/4)*a*a;
        System.out.println("Area of Equilateral Triangle is : " + area);
    }
}
