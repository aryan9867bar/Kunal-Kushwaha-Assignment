package Intermediate;
// 5. Calculate Distance Between Two Points
import java.util.*;

public class distance05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x1 point");
        int x1=sc.nextInt();
        System.out.println("Enter y1 point");
        int y1=sc.nextInt();
        System.out.println("Enter x2point");
        int x2=sc.nextInt();
        System.out.println("Enter y2 point");
        int y2=sc.nextInt();
        double dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("The distance between two points "+"("+x1+","+y1+"),"+"("+x2+","+y2+") ===> "+dis);
    }
}
