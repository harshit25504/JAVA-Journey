import java.util.*;

public class loop {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String h = sc.next();
    for(int i = 1; i<=10;i++){
        for(int j = 1; j<=i; j++){
            System.out.print(h);
        }
        System.out.println();
      }
   } 
}
