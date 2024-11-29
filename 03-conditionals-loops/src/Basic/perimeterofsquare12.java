package Basic;
// 12. Perimeter Of Square

import java.util.*;

public class perimeterofsquare12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of the Square: ");
        int a = sc.nextInt();
        double perimeter = 4*a;
        System.out.println("Perimeter of Square is : " + perimeter);
    }
}
