import java.util.*;

public class functions {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }
    

    static int sum2() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int b = sc.nextInt();
        int sum = a + b;
        return sum;

    }








    static void sum() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
