public class Maxim {
    public static void main(String[] args) {
        int[] arr = {2, 35, 23 ,11, 63};
        System.out.println(max(arr)); 
    }
    //imagine that arr in not empty
    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
