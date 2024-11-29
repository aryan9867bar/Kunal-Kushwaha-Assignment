package Basic;
// 11. Perimeter Of Rectangle

import java.util.*;

public class perimeterofrectangle11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the Rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter width of the Rectangle: ");
        int w = sc.nextInt();
        double perimeter = 2*(l+w);
        System.out.println("Perimeter of Rectangle is : " + perimeter);
    }
}
