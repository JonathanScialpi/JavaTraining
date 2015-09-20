import java.util.*;

public class ShorterDoubleDice {

    public static void main(String[] args) {

        Random rand = new Random();
        int diceRoll1 = rand.nextInt(6) + 1;
        int diceRoll2 = rand.nextInt(6) + 1;

        System.out.print("HERE COMES THE DICE!");
        if (diceRoll1 == diceRoll2) {
            System.out.print("\r\n\r\nRoll #1: " + diceRoll1 + "!");
            System.out.print("\r\nRoll #2: " + diceRoll2 + "!");
            System.out.print("\r\nThe Total is: " + (diceRoll1 + diceRoll2 + "!"));
        }

        do {
            System.out.print("\r\n\r\nRoll #1: " + diceRoll1 + "!");
            System.out.print("\r\nRoll #2: " + diceRoll2 + "!");
            System.out.print("\r\nThe Total is: " + (diceRoll1 + diceRoll2 + "!"));
            diceRoll1 = rand.nextInt(6)+1;
            diceRoll2 = rand.nextInt(6)+1;

            if (diceRoll1 == diceRoll2) {
                System.out.print("\r\n\r\nRoll #1: " + diceRoll1 + "!");
                System.out.print("\r\nRoll #2: " + diceRoll2 + "!");
                System.out.print("\r\nThe Total is: " + (diceRoll1 + diceRoll2 + "!"));
                break;
            }
        }while(diceRoll1 != diceRoll2);
    }
}
