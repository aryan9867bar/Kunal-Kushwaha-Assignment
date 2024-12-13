//25.       *****
//         *   *
//        *   *
//       *   *
//      *****
public class pat25 {
    public static void main(String[] args) {
        pattern25(5);
    }

    static void pattern25(int n) {
        // Top part of the pattern
        for (int row = 1; row <= n; row++) {
            // Print leading spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Print the stars and spaces inside
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
