import java.util.Scanner;

public class GenderGame {

    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
    
     System.out.print("What is your gender (M or F): ");
     String gender = keyboard.nextLine();
     
     System.out.print("First name: ");
     String firstName = keyboard.nextLine();
     
     System.out.print("Last name: ");
     String lastName = keyboard.nextLine();
     
     System.out.print("Age: ");
     int age = keyboard.nextInt();
     keyboard.nextLine();  
     if(gender.equals("F") && age >= 20){
    	 System.out.print("\r\nAre you married, "+firstName+" (y or n)?");
         String status = keyboard.nextLine();
         if (status.equals("y")){
        	 System.out.print("Then I shall call you Mrs."+lastName);
         }else System.out.print("Then I shall call you Ms."+lastName);
     }
     else if (gender.equals("F") && age < 20) {
    	 System.out.print("Then I shall call you "+firstName+' '+lastName);
     }
     else if (gender.equals("M") && age>=20){
    	 System.out.print("Then I shall call you Mr."+lastName);
     }else System.out.print("Then I shall call you "+firstName+' '+lastName);
     
    }

}
