import java.util.*;

public class func2 {
    public static int calculateProduct (int a, int b){
    return a / b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b  = sc.nextInt();

        System.out.println("The sum of 2 numbers are "+calculateProduct(a, b));
    }
}
