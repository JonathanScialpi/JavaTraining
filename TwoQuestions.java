import java.util.Scanner;

public class TwoQuestions {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String input1,input2;
        String myGuess;

        System.out.println("TWO QUESTIONS!");

        System.out.println("Think of an object, and I'll try to guess it.\r\n");

        System.out.println("Question 1) Is it an animal, vegetable, or mineral?");
        input1 = keyboard.nextLine();

        System.out.println("\r\nQuestion 2) Is it bigger than a breadbox?");
        input2 = keyboard.nextLine();

        // remember to use yourString.equals() to compare strings!
        if (input1.equals("animal")){

            if (input2.equals("yes")){
                myGuess = "moose";
            }
            else{
                myGuess = "squirrel";
            }
        }
        else if (input1.equals("vegetable")){
            if (input2.equals("yes")){
                myGuess = "watermelon";
            }
            else{
                myGuess = "carrot";
            }
        }
        else if (input2.equals("yes")){
                myGuess = "Camaro";
            }
        else{
                myGuess = "paper clip";
            }


        System.out.println("\r\nMy guess is that you are think of a "+myGuess+".\r\nI would"
                +" ask you if I'm right, but I don't actually care."+input1+input2);
    }
}
