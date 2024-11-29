package Basic;
// 8. Perimeter Of Circle

import java.util.*;

public class perimeterofcircle08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        int r = sc.nextInt();
        double perimeter = 2*3.14*r;
        System.out.println("Perimeter Of Circle is : " + perimeter);
    }
}
