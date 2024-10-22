public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //swap numbers code
        // int temp = a;
        // a = b;
        // b = temp;

        swap(a,b);
        System.out.println(a + " " + b);

    //Not correct code ignore this one
    //     String name = "Harshit Rana";
    //     changeName(name);
    //     System.out.println(name );

    // }
    // static void changeName(String name){
    //     name = "Peter Parker";
    }
    //till this
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println();
        //this change will only be valid in only this functions scope.
    }
}
