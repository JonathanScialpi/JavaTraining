import java.util.Scanner;

public class TwoMoreQuestions {

    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     
     System.out.println("TWO  MORE QUESTIONS, BABY!");
     
     System.out.println("Think of something an I'll tyr to guess it!");
     
     System.out.print("\r\nQuestion 1) Does it stay inside or outside or both?");
     String input1 = keyboard.nextLine();
     System.out.print("Question 2) Is it a living thing?");
     String input2 = keyboard.nextLine();
     
     if (input1.equals("inside") && input2.equals("yes")){
    	System.out.print("You must be thinking of a: houseplant!");
     }
     if (input1.equals("inside") && input2.equals("no")){
     	System.out.print("You must be thinking of a: shower curtain!");
      }
     if (input1.equals("outside") && input2.equals("yes")){
     	System.out.print("You must be thinking of a: bison!");
      }
     if (input1.equals("outside") && input2.equals("no")){
     	System.out.print("You must be thinking of a: billboard!");
      }
     if (input1.equals("both") && input2.equals("yes")){
     	System.out.print("You must be thinking of a: dog!");
      }
     if (input1.equals("both") && input2.equals("no")){
     	System.out.print("You must be thinking of a: cell phone!");
      }
    }

}
