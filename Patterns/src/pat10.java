//10.      *
//        * *
//       * * *
//      * * * *
//     * * * * *

public class pat10 {
    public static void main(String[] args) {
        pattern10(5);
    }

    static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            int noOfSpaces = n - row;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
