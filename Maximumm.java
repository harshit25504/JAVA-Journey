public class Maximumm{
    public static void main(String []args){
    int num1 = 2, num2 = 4, num3 = 5,max;
    max = (num1 > num2)?(num1 > num3?num1:num3):(num2 > num3?num2:num3);
    System.out.println("Maximum of"+num1+","+num2+","+num3+"is"+max);
    }
}