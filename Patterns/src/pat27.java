//27.   1 2 3 4  17 18 19 20
//        5 6 7  14 15 16
//          8 9  12 13
//            10 11
public class pat27 {
    public static void main(String[] args) {
        pattern27(4);
    }

    static void pattern27(int n) {
        int start = 1; // Starting number for the left side
        int totalNumbers = n * (n + 1) / 2; // Total numbers in the pattern
        int end = totalNumbers; // Last number for the right side

        for (int row = 0; row < n; row++) {
            // Print leading spaces for alignment
            for (int space = 0; space < row; space++) {
                System.out.print("  ");
            }

            // Print numbers on the left side
            for (int col = 0; col < n - row; col++) {
                System.out.print(start + " ");
                start++;
            }

            // Print numbers on the right side
            int tempEnd = end - (n - row - 1); // Adjust end for the current row
            for (int col = 0; col < n - row; col++) {
                System.out.print(tempEnd + " ");
                tempEnd++;
            }

            end -= (n - row); // Update the end for the next row
            System.out.println();
        }
    }
}
