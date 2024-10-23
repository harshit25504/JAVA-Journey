public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            //int a = 75; is already initialized outside the block in the same method, hence you cannot initialize it again.
            a = 75; // this would change the original value tho...// reassign the origin ref variable to some other value.  
            System.out.println(a);
            int c = 99;
            name = "Harshit";
            System.out.println(name);
            //values inititalized in this block, will remain in block.
        }
        int c = 900;
        System.out.println(a);
        System.out.println(name);
        //System.out.println(c); cannot be outside the block.

        //scoping in for loop.
        for(int i = 1; i < 4; i++){
            System.out.println(i);
            int num = 99;
            a = 10000;
        }
        System.out.println( );
    }
    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
