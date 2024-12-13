//32.    E
//       D E
//       C D E
//       B C D E
//       A B C D E
public class pat32 {
    public static void main(String[] args) {
        pattern32(5);
    }

    static void pattern32(int n) {
        for (int row = 0; row < n; row++) {
            char ch = (char) ('E' - row); // Start character for the current row

            for (int col = 0; col <= row; col++) {
                System.out.print(ch + " ");
                ch++; // Move to the next character
            }

            System.out.println();
        }
    }
}