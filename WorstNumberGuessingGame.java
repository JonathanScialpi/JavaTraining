import java.util.*;

public class WorstNumberGuessingGame {

    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);   
     int magicNumber = 4;
     
     System.out.println("THE WORST NUMBER GUESSING GAME EVER!!!!!!");
     
     System.out.println("\r\nI'M THINKING OF A NUMBER FROM 1-10. TRY TO GUESS! ");
     int answer = keyboard.nextInt();
     
     if(answer == magicNumber){
     System.out.print("LOL!!! YOU GOT IT! I CAN'T BELIEVE YOU GUESSED IT WAS "+magicNumber);
     }else System.out.println("SORRY, THE NUMBER WAS "+magicNumber+'!');
    }

}
