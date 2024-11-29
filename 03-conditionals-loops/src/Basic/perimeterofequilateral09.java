package Basic;

import java.util.*;

// 9. Perimeter Of Equilateral Triangle

public class perimeterofequilateral09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of the perimeter: ");
        int a = sc.nextInt();
        double perimeter = 3*a;
        System.out.println("Perimeter Of Equilateral Triangle is : " + perimeter);
    }
}
