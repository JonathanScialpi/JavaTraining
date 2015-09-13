import java.util.Scanner;

public class DumbCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your first number?");
        double first = keyboard.nextDouble();

        System.out.print("What is your second number?");
        double second = keyboard.nextDouble();

        System.out.print("What is your third number?");
        double third = keyboard.nextDouble();


        System.out.print("( "+first+" + "+second+" + "+third+" ) / 2 is... "+calc(first, second, third));
    }

    public static double calc (double x, double y, double z){
        double answer = (x+y+z)/2;

        return answer;
    }
}
