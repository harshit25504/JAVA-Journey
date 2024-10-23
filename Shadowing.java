public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40; //local scope and it only print that in the same block.the class variable is shadowed by this.
       // int x; declaration.
       // system.out.println(x); the scope will only begin when it is initialised
       // x = 40;initialisation.
        System.out.println(x);
        fun();
    }
    static void fun() {
        System.out.println(x);
    }
}
