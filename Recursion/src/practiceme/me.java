package practiceme;

public class me {
    public static void main(String[] args) {

        for(int i = 0; i <= 5; i++) {
            System.out.println(fibo(i));
        }
    }
    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

}
