import java.util.*;

public class Strings{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("hello");
        for(int i = 0 ; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);
       
    }
}














        // sb.append("e");  //str = str + e
        // sb.append("l");  //str = str + l
        // sb.append("l");  //str = str + l
        // sb.append("o");  //str = str + o
        // sb.reverse();
        // System.out.println(sb);
        // //char index at 4
        // System.out.println(sb.charAt(4));

        // //set char at index
        // (sb.setCharAt(4,'a'));
         // //compare
        // String sentence = "My name is nigga";
        // String name = sentence.substring(4);
        // System.out.println(name);
        //---------
        // Scanner sc = new Scanner(System.in);
        // String name1 = "nigga";
        // String name2 = "chigga";
        //THIS CHECKS STRINGS IN THESE CASES -
        //String1 > String2 -> +ve value
        //String1 == String2 -> 0
        //String1 < String2 -> -ve value

        //hello wello
        // if(name1.compareTo(name2) == 0){  
        //     System.out.println("Both strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }
        // if(new String("Tony") == new String("Tony")){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }