package Intermediate;
// 17. Find if a number is palindrome or not
import java.util.*;

public class palindrome17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str,rev = "";
        System.out.println("Enter Your String: ");
        str = sc.nextLine();
        int length = str.length();
        for(int i=length-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }
    }
}
