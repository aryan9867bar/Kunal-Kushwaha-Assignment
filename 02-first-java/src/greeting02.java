// 2. Take name as input and print a greeting message for that particular name.

import java.util.Scanner;
public class greeting02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Namaste, "+name+" Welcome to the Restaurant");
    }
}
