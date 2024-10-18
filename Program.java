import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Name: ");
        String a = sc.next();
        System.out.println("Enter Your Last Name: ");
        String b = sc.next();
        
        System.out.println(a+b);
        
        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();
        if(age < 13){
            System.out.println("You are a Kid");
        }else if(age >= 13 && age < 18){
            System.out.println("You are a teen");
        }else if(age >= 18 && age <= 30){
            System.out.println("Adult");
        }else{
            System.out.println("Old");
        }
    }
}
