package Basic;
// 15. Volume Of Prism

import java.util.*;

public class volumeofprism15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of the Prism: ");
        int b = sc.nextInt();
        System.out.println("Enter height of the Prism: ");
        int h = sc.nextInt();
        double volume = b*h;
        System.out.println("Volume of Prism is : " + volume);
    }
}
