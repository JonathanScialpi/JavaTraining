import java.util.Scanner;

public class TheForgetfulMachine {

    public static void main(String[] args) {
    
    //Scanner variable, but never storing the user input...
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me a word!");
        keyboard.nextLine();
        System.out.println("Give me another word!");
        keyboard.nextLine();
        System.out.println("Great, now your favorite number?");
        keyboard.nextLine();
        System.out.println("And your second-favorite number...");
        keyboard.nextLine();
        System.out.println("Whew! Wasn't that fun?");

    }

}
