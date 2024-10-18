public class Binary {
    public static void main(String[] args) {
        long binary1 = 1010,binary2 = 1101;
        int i = 0, remainder = 0;
        long[] sum = new long[20];
        while (binary1!=0 || binary2!=0) {
            sum[i++]=(binary1%10 + binary2%10 + remainder)%2;
            remainder = (int)(binary1%10+binary2%10+remainder)/2;
            binary1 = 1/10;
            binary2 = 2/10;
        }
        if(remainder!=0){
            sum [i++] = remainder;
        }
        System.out.print("sum of 2 binary numbers : ");
        while(i >= 0){
        System.out.print(sum[-i]);
        }
    }
}