import java.util.*;

public class Main {

    public static void SafeSquareRoot(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("SQUARE ROOT!");
        System.out.print("Enter a number: ");
        int input = keyboard.nextInt();
        while (input < 0){
            System.out.println("You can't take the square root of a negative number, silly.");
            System.out.print("Try again: ");
            input = keyboard.nextInt();
        }
        double squareRT = Math.sqrt(input);
        System.out.print("The square root of "+input+" is "+squareRT);
    }
}
