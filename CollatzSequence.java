import java.util.*;

public class CollatzSequence {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int steps =0;
        System.out.print("Starting Number: ");
        int number = keyboard.nextInt();
        System.out.print(number);
       do {
           if (number%2>0){
               number = (number * 3)+1;
           }
           else if (number %2 == 0){
               number = number/2;
           }
           System.out.print("   "+number);
           ++steps;
       }while(number!=1);
    System.out.print("\r\nTerminated after "+steps+" steps.");
    }
}
