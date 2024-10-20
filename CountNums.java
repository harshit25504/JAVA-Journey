public class CountNums{
    public static void main(String[] args) {
        int num = 22364;

        int count = 0;

        while(num > 0){
            int rem = num % 10;
            if(rem == 2){
                count++;
                }
                num /= 10;
            }
            System.out.println(count);
    }
}



















// public class CountNums {
//     public static void main(String[] args) {
//         int a = 346353;
//         int count = 0;
//         while(n > 0){
//             rem = n % 10;
//             if(rem == 3){
//                 count++;
//             }
//             n = n / 10;
//         }
//         System.out.println(count);
//     }
// }
