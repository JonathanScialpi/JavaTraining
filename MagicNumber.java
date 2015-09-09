import java.util.Scanner; 
import java.util.Random;

public class MagicNumber {

      /**
      * @param args
      */
      public static void main(String[] args) {
            // TODO Auto-generated method stub
      Random rand = new Random();
      int guess_number = rand.nextInt(1000);
      Scanner user_in = new Scanner(System.in);
      
      //prompt
      System.out.println("Guess a number from 0 - 1,000");
      int answer = user_in.nextInt();
      int total_guess = 0;
      user_in.nextLine();
      ++total_guess;
      
      //correct answer checker. notice we are incrementing the # of guesses
      if (answer == guess_number){
            ++total_guess;
            System.out.println("Correct!!! You guessed: " +total_guess+" times.");
            
      }
      
      //is the user getting hotter or colder
      while (answer != guess_number){
            ++total_guess;
      if (answer > guess_number){
            System.out.println("Sorry, but your answer: "+answer+" was too high.");
            System.out.println("Please guess again.");
            answer = user_in.nextInt();
            user_in.nextLine();
            if (answer == guess_number){
                  System.out.println("Correct!!! You guessed: "+total_guess+" times.");
            }
      }
      else if (answer < guess_number){
            System.out.println("Sorry, but your answer: "+answer+" was too low.");
            System.out.println("Please guess again.");
            answer = user_in.nextInt();
            user_in.nextLine();
            if (answer == guess_number){
                  System.out.println("Correct!!! You guessed: "+total_guess+" times.");
            }
      }
      }
      }
            }

