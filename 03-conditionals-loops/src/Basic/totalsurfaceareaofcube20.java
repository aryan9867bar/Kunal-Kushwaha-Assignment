package Basic;
// 20. Total Surface Area Of Cube

import java.util.*;

public class totalsurfaceareaofcube20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side length of Cube: ");
        int a = sc.nextInt();
        double surfacearea = 6*a*a;
        System.out.println("Total Surface Area Of Cube is : " + surfacearea);
    }
}
