import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(214);
        // list.add(715);
        // list.add(364);
        // list.add(37);
        // list.add(72);
        
        // System.out.println(list.contains(72));
        // System.out.println(list);
        // list.set(0, 99);
        // list.remove(2);
        // System.out.println(list);
        //input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());    
        }
        //get item at any index.
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here. list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
