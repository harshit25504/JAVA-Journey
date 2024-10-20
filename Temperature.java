import java.util.*;
 
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the temp in celcius: ");
        float tempC = sc.nextFloat();
        float tempF = (tempC * 9/5)+32;
        System.out.println(tempF);


    }
}
