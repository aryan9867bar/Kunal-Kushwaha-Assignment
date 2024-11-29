package Intermediate;
// 9. Calculate Batting Average
import java.util.*;

public class batting09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long Matches,runs,innings,notout;
        double avg;
        System.out.println("Enter the number of matches played: ");
        Matches = sc.nextLong();
        while(true)
        {
            System.out.println("Enter the number innings batted: ");
            innings=sc.nextLong();
            if(innings<=Matches)
                break;
            System.out.println("Enter the number innings batted correctly <=matches: ");

        }
        while(true)
        {
            System.out.println("Enter number of times notout: ");
            notout = sc.nextLong();
            if(notout<=innings)
                break;
            System.out.println("Enter the number times became notout correctly <=innings: ");
        }
        System.out.println("Enter runs scored");
        runs=sc.nextLong();
        if(innings==notout)
            avg=runs;
        else
            avg=runs/(innings-notout);
        System.out.println("batting average="+avg);
    }
}
