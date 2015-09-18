import java.util.*;

public class ValuesInLoop {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("I will add up the numbers you give me.");
        int nextNumber = 0;
        int total = 0;
        do {
            System.out.print("\r\nNumber: ");
            nextNumber = keyboard.nextInt();
            total += nextNumber;
            System.out.print("The total so far is " + total);
        } while (nextNumber != 0);
        if (nextNumber == 0) {
            System.out.print("The total is " + total);
        }
    }
}
