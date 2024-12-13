//6.       *
//        **
//       ***
//      ****
//     *****

public class pat06 {
    public static void main(String[] args) {
        pattern6(5);
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            //inner loop --> space print
            int noOfSpaces = n - row;
            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print(" ");
            }
            //inner loop --> star print
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
