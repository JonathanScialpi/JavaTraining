import java.util.Scanner;

public class YourOwnAdventure {

    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     
     System.out.println("WELCOME TO JONATHAN'S ADVENTURE!");
     
     System.out.println("\r\nYou are at Six Flags Great Adventure!\r\nWould you like to wait in line for the "
    		 +"\"Batman\" ride? Or would you like to try to \"win a prize\" at the water gun game?");
     String answer = keyboard.nextLine();
     if (answer.equals("Batman")){
    	 System.out.println("\r\nYou arrive at the entrance of the Batman ride. However, there is long line with"
    			 +" a wait of up to 1 hour.\r\nBUT, you notice that some people just snuck through the exit."
    			 +"\r\nDo you want to try and \"sneek\" throught the exit too? Or \"wait\" an hour?");
    	 answer = keyboard.nextLine();
    	 if (answer.equals("sneek")){
    		 System.out.println("\r\nA security guard has caught you and thrown you out of the park!");
    	 }
    	 else {
    		 for (int i=0;i<3601;i++){
    			 System.out.println(i+"seconds");
    		 }
    		 System.out.println("\r\nYou had a great time on Batman the ride!");
    	 }
     }
     else if (answer.equals("win a prize")){
    	 System.out.println("\r\nYou walk over to the water gun game stand and see 5 competitors."
    			 +"\r\nYou are informed that the more competitors the bigger the prize."
    			 +"\r\nWould you like to \"wait\" for a group of less competitors or \"play now\"?");
    	 answer = keyboard.nextLine();
    	 if (answer.equals("wait")){
    		 System.out.println("\r\nYou waited for the next roud and beat 2 other people to win a slinky!");
    	 }else if(answer.equals("play now")){
    		 System.out.println("\r\nYou lost to a 3rd grader and walked away with nothing!");
    	 }
     }

    }

}
