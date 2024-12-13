//33.    a
//       B c
//       D e F
//       g H i J
//       k L m N o
public class pat33 {
    public static void main(String[] args) {
        pattern33(5);
    }

    static void pattern33(int n) {
        char ch = 'a'; // Starting character

        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                // Check if the position is odd or even for uppercase and lowercase
                if ((row + col) % 2 == 0) {
                    System.out.print(Character.toLowerCase(ch) + " ");
                } else {
                    System.out.print(Character.toUpperCase(ch) + " ");
                }
                ch++; // Move to the next character
            }
            System.out.println();
        }
    }
}