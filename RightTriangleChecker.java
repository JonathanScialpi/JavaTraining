import java.util.*;

public class RightTriangleChecker {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int side1,side2,side3;
        System.out.print("Enter three integers: ");
        System.out.print("\r\nSide 1: ");
           side1 = keyboard.nextInt();
           System.out.print("Side 2: ");
           side2 = keyboard.nextInt();
        while (side2<side1){
            System.out.print(side2+" is smaller than "+side1+". Try again.");
            System.out.print("\r\nSide 2: ");
            side2 = keyboard.nextInt();
        }
           System.out.print("Side 3: ");
           side3 = keyboard.nextInt();
        while (side3<side2){
            System.out.print(side3+" is smaller than "+side2+". Try again.");
            System.out.print("\r\nSide 3: ");
            side3 = keyboard.nextInt();
        }
        System.out.print("Your three sides are "+side1+" "+side2+" "+side3);
        if (Math.pow(side1, 2)+Math.pow(side2, 2)==Math.pow(side3, 2)){
            System.out.print("\r\nThese sides *do* make a right triangle.  Yippy-skippy!");
        }else System.out.print("\r\nNO!  These sides do not make a right triangle!");
    }
}
