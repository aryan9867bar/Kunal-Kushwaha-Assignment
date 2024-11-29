package Basic;
// 13. Perimeter Of Rhombus

import java.util.*;

public class perimeterofrhombus13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of the Rhombus: ");
        int a = sc.nextInt();
        double perimeter = 4*a;
        System.out.println("Perimeter of Rhombus is : " + perimeter);
    }
}
