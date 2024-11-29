package Basic;
// 19. Curved Surface Area Of Cylinder

import java.util.*;

public class curvedsurfaceareaofcylinder19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the Cylinder: ");
        int r = sc.nextInt();
        System.out.println("Enter height of the Cylinder: ");
        int h = sc.nextInt();
        double curved = 2*3.14*r*h;
        System.out.println("Curved Surface Area Of Cylinder is : " + curved);
    }
}
