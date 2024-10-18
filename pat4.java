public class pat4 {
    public static void main(String[] args) {
        for(int i = 1; i<=4; i++){
            for(int j = 4; j>=i; j--){
            System.out.print(" ");
            }
            for(int k = 2; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i<=4; i++){
            for(int j = 2; j<=i;j++){
                System.out.print(" ");
            }
            for(int k = 4; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
