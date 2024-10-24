import java.util.Arrays;

public class ColNoFixed {
    public static void main(String[] args) {
        int[][] arr = {
                { 4, 2, 3, 7 },
                { 9, 1 },
                { 8, 6, 5 },
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
