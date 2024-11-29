// 04. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.*;

public class operators04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Enter the Operator to perform: ");
            char op = sc.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter First Number: ");
                int a = sc.nextInt();
                System.out.println("Enter Second Number: ");
                int b = sc.nextInt();
                if(op == '+'){
                    ans = a+b;
                }
                if(op == '-'){
                    ans = a-b;
                }
                if(op == '*'){
                    ans = a*b;
                }
                if(op == '/'){
                    if(b!=0){
                        ans = a/b;
                    }
                }
                if(op == '%'){
                    ans = a%b;
                }
            }
            else if(op == 'x' || op == 'X') {
                break;
            }
            else {
                System.out.println("Invalid Number ");
            }
            System.out.println(ans);
        }
    }
}
