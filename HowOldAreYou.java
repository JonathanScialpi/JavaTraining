import java.util.Scanner;

public class HowOldAreYou {

    public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);

        int age;

        System.out.print("Hey, what's your name?");
        String name = keyboard.nextLine();

        System.out.print("Ok, "+name+", how old are you? ");
        age = keyboard.nextInt();

        if (age<16){
            System.out.println("You can't drive, "+name);
            System.out.println("You can't vote, "+name);
            System.out.println("You can't rent a car, "+name);

        }
        else if(age>=16 && age <18){
            System.out.println("You can't vote, "+name);
            System.out.println("You can't rent a car, "+name);
        }
        else if (age>=18 && age < 25){
            System.out.println("You can't rent a car, "+name);
        }
        else if (age>25) {
            System.out.println("You can't do anything that's illegal, "+name);
        }
    }
        }
