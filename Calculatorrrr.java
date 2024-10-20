import java.util.*;

public class Calculatorrrr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        while (true) {
            System.out.println("Choose Your Operator - +, -, *, /, %");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input 2 numbers
                System.out.println("Enter the two numbers-");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
            } 
        }
            else if (op == 'x' || op == 'X') {
                    break;
            } else {
                System.out.println("Invalid Operetor");
                }
            System.out.println("The answer is :  "+ans);
        }
    }
}