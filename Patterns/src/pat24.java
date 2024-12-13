//24.    *        *
//       **      **
//       * *    * *
//       *  *  *  *
//       *   **   *
//       *   **   *
//       *  *  *  *
//       * *    * *
//       **      **
//       *        *
public class pat24 {
    public static void main(String[] args) {
        pattern24(5);
    }

    static void pattern24(int n) {
        // Upper part of the pattern
        for (int row = 1; row <= n; row++) {
            // Left stars
            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Spaces in the middle
            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }

            // Right stars
            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Lower part of the pattern
        for (int row = n; row >= 1; row--) {
            // Left stars
            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Spaces in the middle
            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }

            // Right stars
            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}