//34.    E D C B A
//       D C B A
//       C B A
//       B A
//       A
public class pat34 {
    public static void main(String[] args) {
        pattern34(5);
    }

    static void pattern34(int n) {
        for (int row = 0; row < n; row++) {
            char ch = (char) ('E' - row); // Starting character for the current row

            for (int col = 0; col < n - row; col++) {
                System.out.print(ch + " ");
                ch--; // Move to the previous character in the alphabet
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
