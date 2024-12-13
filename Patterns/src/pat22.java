//22.    1
//       0 1
//       1 0 1
//       0 1 0 1
//       1 0 1 0 1
public class pat22 {
    public static void main(String[] args) {
        pattern22(5);
    }

    static void pattern22(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                // Print 1 if the sum of row and column indices is even, otherwise print 0
                if ((row + col) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
