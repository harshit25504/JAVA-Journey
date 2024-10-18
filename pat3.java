// public class pat3 {
//     public static void main(String[] args) {
//         for(int i = 1; i<=4; i++){
//             for(int j = 3; j>=i; j--){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

public class pat3 {
    public static void main(String[] args) {
        for(int i = 1; i<=4; i++){
            for(int j = 2; j<=i; j++){//if we put j = 1 then it'll put a space in the first line if we put 2 it won't.
                System.out.print(" ");
            }
            for(int k=4; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

