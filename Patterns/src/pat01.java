//1.  *****
//    *****
//    *****
//    *****
//    *****

public class pat01 {
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n) {
        for (int row = 0; row < n; row++) {     //if i = 1 then i is less than and equal to
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
