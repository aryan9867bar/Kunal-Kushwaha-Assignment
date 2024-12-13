//35.    1      1
//       12    21
//       123  321
//       12344321
public class pat35 {
    public static void main(String[] args) {
        pattern35(5);
    }

    static void pattern35(int n) {
        for (int row = 1; row <= n; row++) {
            // Print the first sequence of numbers
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }

            // Print spaces in the middle
            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }

            // Print the second sequence of numbers in reverse
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println(); // Move to the next row
        }
    }
}
