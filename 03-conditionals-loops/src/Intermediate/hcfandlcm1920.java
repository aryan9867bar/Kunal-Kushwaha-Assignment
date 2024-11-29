package Intermediate;
// 19. HCF Of Two Numbers Program
// 20. LCM Of Two Numbers
import java.util.*;

public class hcfandlcm1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n1 = a;
        int n2 = b;
        while(n2!=0){
            int temp = n2;
            n2 = n1%n2;
            n1 = temp;
        }
        int hcf = n1;
        int lcm = (a*b)/hcf;
        System.out.println("The HCF is "+hcf);
        System.out.println("The LCM is "+lcm);
    }
}
