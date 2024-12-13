//12.  * * * * *
//      * * * *
//       * * *
//        * *
//         *
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *

public class pat12 {
    public static void main(String[] args) {
        pattern12(5);
    }
    static void pattern12(int n) {
        // Upper part of the diamond
        for (int row = 0; row < n; row++) {
            int noOfSpaces = row;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            int totalColsInRow = n - row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int row = 0; row < n; row++) {
            int noOfSpaces = n - row - 1;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            int totalColsInRow = row + 1;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
