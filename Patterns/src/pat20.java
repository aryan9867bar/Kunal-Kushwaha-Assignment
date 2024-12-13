//20.    ****
//       *  *
//       *  *
//       *  *
//       ****
public class pat20 {
    public static void main(String[] args) {
        pattern20(5);
    }

    static void pattern20(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                // Print '*' for the border
                if (row == 0 || row == n - 1 || col == 0 || col == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
