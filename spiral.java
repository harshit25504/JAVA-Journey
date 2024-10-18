import java.util.*;

public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[n][m] = sc.nextInt();
            }
        }
        System.out.println("The spiral model matrix is : ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;


        while(rowStart <= rowEnd && colStart <= colEnd){
            //1
            for(int col = colStart; col<=colEnd; col++){
                System.out.println(matrix[rowStart][col]+" ");
            }
            rowStart++;

            //2

            for(int row = rowStart; row<=rowEnd; row++){
                System.err.println(matrix[row][colEnd]+ " ");
            }
            colEnd--;

            //3

            for(int col=colEnd; col>=colStart; col--){
                System.out.println(matrix[rowEnd][col]+" ");
            }

            rowEnd--;

            for(int row=rowEnd; row>=rowStart; row--){
                System.err.println(matrix[row][colEnd]+" ");
            }
            colStart++;

            System.out.println();
        }
    }
}