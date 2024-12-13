// 13.     *
//        * *
//       *   *
//      *     *
//     *********
public class pat13 {
    public static void main(String[] args) {
        pattern13(5);
    }

    static void pattern13(int n) {
        for (int row = 1; row <= n; row++) {
            // Print leading spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Print stars and spaces inside the hollow pyramid
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1 || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
