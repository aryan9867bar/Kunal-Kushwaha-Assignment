//29.
//       *        *
//       **      **
//       ***    ***
//       ****  ****
//       **********
//       ****  ****
//       ***    ***
//       **      **
//       *        *
public class pat29 {
    public static void main(String[] args) {
        pattern29(5);
    }

    static void pattern29(int n) {
        // Upper half
        for (int row = 1; row <= n; row++) {
            // Left stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // Spaces in the middle
            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }

            // Right stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int row = n - 1; row >= 1; row--) {
            // Left stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // Spaces in the middle
            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }

            // Right stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
