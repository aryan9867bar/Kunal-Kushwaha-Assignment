//3.  *****
//    ****
//    ***
//    **
//    *

public class pat03 {
    public static void main(String[] args) {
        pattern3(5);
    }

    static void pattern3(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n-row; col++) {   // if col = 1 then <= n-row+1
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
