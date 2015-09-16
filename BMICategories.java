import java.util.Scanner;

public class BMICategories {

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

        double output = bmiCalc(feet, inches, lbs);
        System.out.println("\r\nYour BMI is: " + output);
        if (output <15.0){
            System.out.print("BMI Category: very severly underweight");
        }else if (output >=15.0 && output<=16.0){
            System.out.print("BMI Category: severly underweight");
        }
        else if (output >=16.1 && output<=18.4){
            System.out.print("BMI Category: underweight");
        }
        else if (output >=18.5 && output<=24.9){
            System.out.print("BMI Category: normal weight");
        }
        else if (output >=25.0 && output<=29.9){
            System.out.print("BMI Category: overweight");
        }
        else if (output >=30.0 && output<=34.9){
            System.out.print("BMI Category: moderately obese");
        }
        else if (output >=35.0 && output<=39.9){
            System.out.print("BMI Category: severly obese");
        }
        else if (output >= 40.0){
            System.out.print("BMI Category: morbidly obese");
        }

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
