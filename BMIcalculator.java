import java.util.Scanner;
public class BMIcalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int feet;
        int inches;
        double lbs;

        System.out.print("Your height (feet only): ");
        feet = keyboard.nextInt();

        System.out.print("Your height (inches): ");
        inches = keyboard.nextInt();

        System.out.print("Your weight in pounds: ");
        lbs = keyboard.nextDouble();

        System.out.print("\r\nYour BMI is: "+bmiCalc(feet, inches, lbs));

    }
public static double bmiCalc(int x, int y, double z){
    //convert pounds to kilograms for the BMI formula
    double total_height = (x*12)+y;
    // convert inches to meters to use the BMI meter input formula
    double to_meters = total_height/39.3701;
    z = z/2.2046;
    double answer = z/(to_meters*to_meters);
    return answer;
}
}
