import java.util.Scanner;

public class NameAgeSalary {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner (System.in);
        String name;
        int age;
        double wage;

        System.out.println("Hello. What is your name?");
        name = keyboard.nextLine();
        System.out.println("Hi, "+name+"! How old are you?");
        age = keyboard.nextInt();
        System.out.println("So you're "+age+", eh? That's not old at all!"+"\r\n"+"How much do you make, "+name+'?');
        wage = keyboard.nextDouble();
        System.out.print(wage+"! hope that's per hour and not per year! LOL!");
    }

}
