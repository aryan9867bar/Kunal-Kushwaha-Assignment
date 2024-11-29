// 5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.*;

public class inputsx05 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number : ");
//        int a = sc.nextInt();
//        int x = 0;
//        int count = 0;
//        while (a != x) {
//            count = count + a;
//            System.out.println("Enter number : ");
//            a = sc.nextInt();
//        }
//        System.out.println("The sum of all numbers is : " + count);
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String choice = "";
        int sum = 0;
        int product = 1;
        int count = 0;
        while(!choice.equals("q")) {
            System.out.println("Enter a number or q to quit");
            choice = sc.next();
            if (!choice.equals("q")) {
                int num = Integer.parseInt(choice);
                sum += num;
                product *= num;
                count++;
            }
        }
        System.out.println("The sum is : " + sum + "\nThe product is : " + product + "\nThe average is : " + ((float)sum/count));
    }
}
