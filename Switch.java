import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();

        switch(empID){
            case 1 -> System.out.println("Harshit Rana");
            case 2 -> System.out.println("Donquixote Alex");
            case 3 -> { System.out.println("Employee Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department Entered!!");
                }
            }
            default -> System.out.println("Enter Correect EmpID!");

        }
    }
}
