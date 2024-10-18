import java.util.*;
    public class eif{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of a : ");
            int a = sc.nextInt();
            System.out.print("Enter the value of b : ");
            int b = sc.nextInt();
            if(a == b){
                System.out.println("a and b are equal");
            }
            else if(a > b){
                System.out.println("a is bigger than b");
            }
            else{   
                System.out.println("a is smaller than b");
            }
        }
    }