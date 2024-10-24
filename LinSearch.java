public class LinSearch {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        int ans = linearsearch(nums, target);
        System.out.println(ans);
    }
    //search the target and return true or false.
    static boolean linearsearch3(int[] arr, int target) {
        if (arr.length == 0) {
        return -1;
    }
        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return false;
    }

    //search the target and return the element
    static int linearsearch2(int[] arr, int target) {
        if (arr.length == 0) {
        return -1;
    }
        //run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }


    //search in the array : return the index if item found.
    //otherwise return -1
    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
        return -1;
    }
        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
