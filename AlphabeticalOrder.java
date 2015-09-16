import java.util.*;
import java.math.*;

public class AlphabeticalOrder {

    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);   
   
     System.out.println("What's your last name?");
     String lastName = keyboard.nextLine();
     
     // take the first character of the string and set it to a char type
     char character = lastName.charAt(0);
     
     //cast the character as a int type to get the ascii value
     int ascii = character;

     if (ascii <= 69){
    	 System.out.print("You don't have to wait that long, "+lastName);
     }
     else if (ascii> 69&& ascii <= 74){
    	 System.out.print("That's not bad, "+lastName);
     }
     else if (ascii>74 && ascii <= 79){
    	 System.out.print("Looks like a bit of a wait, "+lastName);
     }
     else if (ascii>79 && ascii <= 84){
    	 System.out.print("It's gonna be a while, "+lastName);
     }
     else if (ascii>84){
    	 System.out.print("Not going anywhere for a while? "+lastName);
     }
    }

}
