//8.      *
//       ***
//      *****
//     *******
//    *********

public class pat08 {
    public static void main(String[] args) {
        pattern8(5);
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            int noOfSpaces = n-row;
            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
