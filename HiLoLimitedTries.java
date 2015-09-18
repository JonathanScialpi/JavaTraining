import java.util.*;

public class HiLoLimitedTries {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100)+1;
        int tries =0;


        System.out.print("I have chose a number between 1 and 100. Try to guess it." +
                "\r\nYour guess: ");
        int guess = keyboard.nextInt();
        ++tries;
        if (guess == number){
            System.out.print("That's right! You're a good guesser." +
                    "\r\nIt only took you "+tries+". tries");
        }else{
            while (guess!=number && tries < 8){
                if (tries == 7){
                    System.out.print("Sorry, you didn't guess it in 7 tries.  You lose.");
                    break;
                }
                if (guess>number) {
                    System.out.print("Sorry that guess was too high." +
                            "\r\nYour guess: ");
                    guess = keyboard.nextInt();
                    ++tries;
                }else if(guess<number){
                    System.out.print("Sorry that guess was too low." +
                            "\r\nYour guess: ");
                    guess = keyboard.nextInt();
                    ++tries;
                }

                if (guess == number && tries < 8){
                    System.out.print("You guessed it!  What are the odds?!?");
                    break;
                }
            }

        }
    }
}
