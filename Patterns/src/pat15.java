//15.      *
//        * *
//       *   *
//      *     *
//     *       *
//      *     *
//       *   *
//        * *
//         *
public class pat15 {
    public static void main(String[] args) {
        pattern15(5);
    }

    static void pattern15(int n) {
        // Upper part of the diamond
        for (int row = 1; row <= n; row++) {
            // Print leading spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Print stars and spaces inside the hollow pyramid
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int row = n - 1; row >= 1; row--) {
            // Print leading spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Print stars and spaces inside the hollow pyramid
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
