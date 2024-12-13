//14.  *********
//      *     *
//       *   *
//        * *
//         *
public class pat14 {
    public static void main(String[] args) {
        pattern14(5);
    }

    static void pattern14(int n) {
        for (int row = 0; row < n; row++) {
            // Print leading spaces
            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }

            // Print stars and spaces inside the hollow inverted pyramid
            for (int col = 0; col < 2 * (n - row) - 1; col++) {
                if (col == 0 || col == 2 * (n - row) - 2 || row == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
