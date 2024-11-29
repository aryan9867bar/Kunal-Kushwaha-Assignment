package Basic;
// 16. Volume Of Cylinder

import java.util.*;

public class volumeofcylinder16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the Cylinder: ");
        int r = sc.nextInt();
        System.out.println("Enter height of the Cylinder: ");
        int h = sc.nextInt();
        double volume = (3.14*r*r*h);
        System.out.println("Volume of Cylinder is : " + volume);
    }
}
