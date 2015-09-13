import java.util.Scanner;

public class HowOldAreYouAgain {

    public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);

        int age;

        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
        String name = keyboard.nextLine();

        System.out.print("Ok, "+name+", how old are you? ");
        age = keyboard.nextInt();

        if (age<16){
            System.out.println("You can't drive, "+name);
            }
        else if(age>=16 && age <18){
            System.out.println("You can drive but not vote, "+name);
        }
        else if (age>=18 && age < 25){
            System.out.println("You can vote but not rent a car, "+name);
        }
        else if (age>25) {
            System.out.println("You can do pretty much anything, "+name);
        }
    }
        }
