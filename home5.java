import java.util.*;
public class home5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.print("Enter Yo Marks : ");
            int marks = sc.nextInt();
            if(marks >= 90 && marks <= 100){
                System.out.println("Excellent");
            }
            else if(marks >= 60 && marks <= 80){
                System.out.println("Nice");
            }
            else if(marks >= 0 && marks <= 59){
                System.out.println("Ow Hell Naww");
            }
            else{
                System.out.println("Invalid");
            }
            System.out.println("Do you want to continue - Yes(1) or No(0)");
            input = sc.nextInt();

        }while(input == 1);
    }
}
