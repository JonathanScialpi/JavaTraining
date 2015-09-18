import java.util.*;

public class NumGuessingCounter {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(10)+1;
        int tries =0;


        System.out.print("I have chose a number between 1 and 10. Try to guess it." +
                "\r\nYour guess: ");
        int guess = keyboard.nextInt();
        ++tries;
        if (guess == number){
            System.out.print("That's right! You're a good guesser." +
                    "\r\nIt only took you "+tries+". tries");
        }else{
            while (guess!=number){
                System.out.print("That is incorrect. Guess again." +
                        "\r\nYour guess: ");
                guess = keyboard.nextInt();
                ++tries;
                if (guess == number){
                    System.out.print("That's right! You're a good guesser." +
                            "\r\nIt only took you "+tries+" tries.");
                    break;
                }
            }

        }
    }
}
