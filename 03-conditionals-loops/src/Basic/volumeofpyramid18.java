package Basic;
// 18. Volume Of Pyramid

import java.util.*;

public class volumeofpyramid18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the Pyramid: ");
        int l = sc.nextInt();
        System.out.println("Enter base of the Pyramid: ");
        int b = sc.nextInt();
        System.out.println("Enter height of the Pyramid: ");
        int h = sc.nextInt();
        double volume = (l*b*h)/3;
        System.out.println("Volume of Pyramid is : " + volume);
    }
}
