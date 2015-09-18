import java.util.*;

public class DiceRoll {

    public static void main(String[] args) {

       Random rand = new Random();
        int diceRoll1 = rand.nextInt(6);
        int diceRoll2 = rand.nextInt(6);

        System.out.println("HERE COMES THE DICE!");
        System.out.print("\r\nRoll #1: " + diceRoll1);
        System.out.print("\r\nRoll #2: "+diceRoll2);
        System.out.print("\r\nThe Total is: "+(diceRoll1+diceRoll2));


    }
}
