import java.util.*;

public class func {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);// we called function here!


        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        printMyName(name);



    }
}
