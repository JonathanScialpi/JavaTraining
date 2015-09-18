import java.util.*;

public class OneShotHiLo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       Random rand = new Random();
        int oneShot = rand.nextInt(100)+1;

        System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
        int answer = keyboard.nextInt();

        if (answer == oneShot){
            System.out.print("You guessed it! What are the odds?!");
        }else if(answer < oneShot){
            System.out.print("Sorry, your answer was too low. I was thinking of: "+oneShot);
        }else if (answer > oneShot) {
            System.out.print("Sorry, your answer was too high. I was thinking of: "+oneShot);
        }
    }
}
