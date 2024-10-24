import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
//      fun();
//        multiple(2, 4, "Harshit", "Rana", "sdjfbiusebf"); //always be in order.
        demo(2, 5, 4);
        demo("Harshit");
    }
    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));

    }
    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v) {

        System.out.println(Arrays.toString(v));
    }
}
