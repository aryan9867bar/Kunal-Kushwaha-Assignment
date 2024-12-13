//16.           1
//            1   1
//          1   2   1
//        1   3   3   1
//      1   4   6   4   1
public class pat16 {
    public static void main(String[] args) {
        pattern16(5);
    }

    static void pattern16(int n) {
        for (int row = 0; row < n; row++) {
            // Print leading spaces
            for (int space = 0; space < n - row - 1; space++) {
                System.out.print("  ");
            }

            // Print numbers in Pascal's Triangle format
            int value = 1;
            for (int col = 0; col <= row; col++) {
                System.out.print(value + "   ");
                value = value * (row - col) / (col + 1);
            }
            System.out.println();
        }
    }
}
