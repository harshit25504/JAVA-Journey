public class pattern1 {
    public static void main(String[] args) {
        int n = 10;
        int m = 1000;
        //Outer Loop
        for(int i=1; i<=n ; i++){
            //Inner Loop
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
