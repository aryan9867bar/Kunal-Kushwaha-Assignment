package Basic;
// 5. Area Of Parallelogram

import java.util.*;

public class areaofparallelogram05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width of Parallelogram: ");
        int b = sc.nextInt();
        System.out.println("Enter height of Parallelogram: ");
        int h = sc.nextInt();
        double area = b*h;
        System.out.println("Area of Parallelogram is : " + area);
    }
}
