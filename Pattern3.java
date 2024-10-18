public class Pattern3 {
    public static void main(String[] args) {
        int n = 4;
        //Outer Loop
        for(int i=1; i<=n ; i++){
            //Inner Loop
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}