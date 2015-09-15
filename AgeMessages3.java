import java.util.Scanner;

public class AgeMessages3 {

    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     
     System.out.println("Your name: ");
     String name = keyboard.nextLine();
     
     System.out.println("Your age: ");
     int age = keyboard.nextInt();
     
     if (age<16){
    	 System.out.print("\r\nYou can't drive, "+name);	 
     }
     if (age>15 && age <18){
    	 System.out.print("\r\nYou can drive but not vote, "+name);	 
     }
     if (age>17 && age <25){
    	 System.out.print("\r\nYou can vote but not rent a car, "+name);	 
     }
     if (age>=25){
    	 System.out.print("\r\nYou can do pretty much anything, "+name);	 
     }
     
    }

}
