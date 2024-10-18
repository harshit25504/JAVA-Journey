import java.util.*;

public class Bit {
    public static void main(String[] args) {
        // Update Bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper=1 : set oper = 0: Clear
        int n = 5;//0101
        int pos = 2; 

        int bitMask = 1<<pos;
        if(oper == 1){
            //set
            int newNumber = bitMask | n;
            System.out.println();
        }else{
            newBitMask =  ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
        
    }
}



// Clear Bit
        // int n = 5;//0101
        // int pos = 2;
        // int bitMask = 1 << pos;
        // int notBitMask = ~(bitMask);

        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);


//Set Bit
        // int n = 5;//0101
        // int pos = 1;
        // int bitMask = 1 << pos;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

//Get Bit
        // int n = 5;//0101
        // int pos = 2;
        // int bitmask = 1<<pos;

        // if((bitmask & n) == 0){
        //     System.out.println("Bit Was Zero");
        // }else{
        //     System.out.println("Bit Was One");
        //}