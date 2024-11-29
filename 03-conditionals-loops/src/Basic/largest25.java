package Basic;
// 25. Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.*;

public class largest25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = 0;
        int num = 1;
        while(num!=0) {
            System.out.println("Enter number to find largest among all: ");
            num = sc.nextInt();
            if(num>largest){
                largest = num;
            }
        }
        System.out.println(largest + " is the largest number from all.");
    }
}
