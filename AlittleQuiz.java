import java.util.Scanner;

public class AlittleQuiz{

    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);
        int totalCorrect =0;

        System.out.print("Are you ready for a quiz? ");
        keyboard.nextLine();
        System.out.println("Okay, here it comes!");

        System.out.println("\nQ1) What is the capital of Alaska?" +
                "\r\n     1)Melbourne" +
                "\r\n     2)Anchorage" +
                "\r\n     3)Juneau");
        int answer = keyboard.nextInt();
        if (answer ==3){
            System.out.println("\nThat's right!");
            ++totalCorrect;
        }
        else{
            System.out.println("\nIncorrect :(");
        }

        System.out.print("\nQ2) Can you store the value \"cat\" in a variable of type int?" +
                "\r\n     1)yes" +
                "\r\n     2)no");
        answer = keyboard.nextInt();
        if (answer == 2){
            System.out.println("\nThat's right!");
            ++totalCorrect;
        }
        else{
            System.out.println("\nIncorrect :(");
        }

        System.out.print("\nQ3) What is the result of 9+6/3?" +
                "\r\n   1)5" +
                "\r\n   2)11" +
                "\r\n   3)15/3");
        answer = keyboard.nextInt();
        if (answer == 1){
            System.out.println("\nThat's right!");
            ++totalCorrect;
        }
        else{
            System.out.println("\nIncorrect :(");
        }

        System.out.println("\r\n\r\nOverall, you got "+ totalCorrect +" out of 3 correct");
    }
}
