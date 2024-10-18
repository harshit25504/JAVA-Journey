public class pattern4 {
    public static void main(String[] args) {
        int n = 5;
        //Outer Loop
        for(int i=n; i>=1 ; i--){
            //Inner Loop
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}