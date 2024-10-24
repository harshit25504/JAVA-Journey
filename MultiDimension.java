import java.util.*;
import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //   int[][] arr = {
        //           {1, 2, 3}, 0th index
        //           {4, 5}, 1st index
        //           {6, 7, 8, 9} 2nd inde x
        //   }; 
        int[][] arr = new int[3][3];
        // System.out.print(arr.length);// no. of rows.

        //input-
          for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();

            }
          }
          for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
