//7.   *****
//      ****
//       ***
//        **
//         *

public class pat07 {
    public static void main(String[] args) {
        pattern7(5);
    }

    static void pattern7(int n) {
        for (int row = 0; row < n; row++) {
            int noOfSpaces = row;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
