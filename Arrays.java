import java.util.*;
public class Arrays {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers[] = new int[size];

    for(int i = 0; i<size; i++){
        numbers[i] = sc.nextInt();
      }
      int x = sc.nextInt();

      for(int i = 0; i < numbers.length; i++){
        if(numbers[i] == x){
            System.out.println("x found at index "+ i);
        }
      }
   }
}





// int marks[] = new int[3];
//     // int[] marks = new int[3]; both are valid syntax.
//     marks[0] = 99;
//     marks[1] = 91;
//     marks[2] = 98;
//     // System.out.println(marks[0]);
//     // System.out.println(marks[1]);
//     // System.out.println(marks[2]);
//     for(int i = 0; i<3; i++){
//         System.out.println(marks[i]);
//     }