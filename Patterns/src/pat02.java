//1.  *
//    **
//    ***
//    ****
//    *****

public class pat02 {
    public static void main(String[] args) {
        pattern2(5);
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }
}
