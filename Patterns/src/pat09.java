//9.  *********
//     *******
//      *****
//       ***
//        *

public class pat09 {
    public static void main(String[] args) {
        pattern9(5);
    }

    static void pattern9(int n) {
        for (int row = 0; row < n; row++) {
            int noOfSpaces = row;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2*(n-row) - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
