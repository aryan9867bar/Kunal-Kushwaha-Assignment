package Basic;
// 4. Area Of Isosceles Triangle

import java.util.*;

public class areaofisosceles04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of the Isosceles Triangle: ");
        int b = sc.nextInt();
        System.out.println("Enter height of the Isosceles Triangle: ");
        int h = sc.nextInt();
        double area = 0.5*(b*h);
        System.out.println("Area of Isosceles Triangle is : " + area);
    }
}
