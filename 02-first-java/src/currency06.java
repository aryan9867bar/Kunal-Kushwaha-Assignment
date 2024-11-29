// 6. Input currency in rupees and output in USD.
import java.util.*;

public class currency06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in Rupees: ");
        float rupees = sc.nextFloat();
        float dollars = rupees/84;
        System.out.println(dollars+" $");
    }
}
