// 18.  **********
//      ****  ****
//      ***    ***
//      **      **
//      *        *
//      *        *
//      **      **
//      ***    ***
//      ****  ****
//      **********

public class pat18 {
    public static void main(String[] args) {
        pattern18(5);
    }

    static void pattern18(int n) {
        // Upper part of the pattern
        for (int row = 0; row < n; row++) {
            // Print stars on the left
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }

            // Print spaces in the middle
            for (int space = 0; space < 2 * row; space++) {
                System.out.print(" ");
            }

            // Print stars on the right
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Lower part of the pattern
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
    }
}
