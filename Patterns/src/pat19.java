// 19.   *        *
//       **      **
//       ***    ***
//       ****  ****
//       **********
//       ****  ****
//       ***    ***
//       **      **
//       *        *
public class pat19 {
    public static void main(String[] args) {
        pattern19(5);
    }

    static void pattern19(int n) {
        // Upper part of the pattern
        for (int row = 0; row < n; row++) {
            // Print stars on the left
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }

            // Print spaces in the middle
            for (int space = 0; space < 2 * (n - row - 1); space++) {
                System.out.print(" ");
            }

            // Print stars on the right
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Lower part of the pattern
        for (int row = n - 2; row >= 0; row--) {
            // Print stars on the left
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int space = 0; space < 2 * (n - row - 1); space++) {
                System.out.print(" ");
            }

            // Print stars on the right
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
