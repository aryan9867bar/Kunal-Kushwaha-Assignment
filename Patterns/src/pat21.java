//21.    1
//       2  3
//       4  5  6
//       7  8  9  10
//       11 12 13 14 15
public class pat21 {
    public static void main(String[] args) {
        pattern21(5);
    }

    static void pattern21(int n) {
        int number = 1; // Initialize the number to print

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
