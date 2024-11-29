package Basic;
// 17. Volume Of Sphere

import java.util.*;

public class volumeofsphere17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the Sphere: ");
        int r = sc.nextInt();
        double volume = (4/3)*3.14*(r*r*r);
        System.out.println("Volume of Sphere is : " + volume);
    }
}
