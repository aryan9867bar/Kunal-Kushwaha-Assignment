package Intermediate;
// 25. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
import java.util.*;

public class kunal25 {
    public static void main(String[] args) {
        int daysInAugust = 31;
        int evenDaysCount = 0;

        // Loop through the days of August
        for (int day = 1; day <= daysInAugust; day++) {
            if (day % 2 == 0) { // Check if the day is even
                evenDaysCount++;
            }
        }

        // Output the result
        System.out.println("Kunal can go out on " + evenDaysCount + " days in August.");
    }
}
