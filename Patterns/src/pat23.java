//23.        *      *
//         *   *  *   *
//       *      *      *
public class pat23 {
    public static void main(String[] args) {
        pattern23(3);
    }

    static void pattern23(int n) {
        for (int row = 1; row <= n; row++) {
            // Print leading spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Print first star
            System.out.print("*");

            // Print spaces between the first and second star
            for (int space = 1; space <= 2 * (row - 1) - 1; space++) {
                System.out.print(" ");
            }

            // Print second star if not the first row
            if (row > 1) {
                System.out.print("*");
            }

            // Print spaces between the second and third group
            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }

            // Print third star
            System.out.print("*");

            // Print spaces between the third and fourth star
            for (int space = 1; space <= 2 * (row - 1) - 1; space++) {
                System.out.print(" ");
            }

            // Print fourth star if not the first row
            if (row > 1) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
