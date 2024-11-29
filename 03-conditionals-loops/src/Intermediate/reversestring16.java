package Intermediate;
// 16. Reverse A String In Java
import java.util.*;

public class reversestring16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String str = sc.nextLine();
        String reversed = "";
        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}
