import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Choose one: (+, -, *, /)");
        char choices = sc.next().charAt(0);
        System.out.println("Enter your second number");
        int b = sc.nextInt();
        
        int result;

        switch (choices) {
            case '+': result = a + b;
            System.out.println("Sum of a + b: "+result);
            break;

            case '-': result = a - b;
            System.out.println("Sum of a - b: "+result);
            break;

            case '*': result = a * b;
            System.out.println("Sum of a * b: "+result);
            break;

            case '/': result = a / b;
            System.out.println("Sum of a / b: "+result);
            break;
        
            default: System.out.println("Error");
                break;
        }

    }
}