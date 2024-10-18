import java.util.*;

public class primee {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        int number = sc.nextInt();

        if(number%1 == 0){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Its a normal number.");
        }
    }
}
