package Basic;
// 14. Volume Of Cone Java Program

import java.util.*;

public class volumeofcone14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the Cone: ");
        int r = sc.nextInt();
        System.out.println("Enter height of the Cone: ");
        int h = sc.nextInt();
        double volume = (3.14*r*r*h)/3;
        System.out.println("Volume of Cone is : " + volume);
    }
}
