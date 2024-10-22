import java.util.*;

public class greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String personlaised = myGreet(name);
        System.out.println(personlaised);
    }
    static String myGreet(String name){
        String message = "Hello "+name;
        return message;
    }
}
