import java.util.Scanner;

public class YourInterplanetaryWeight {

    public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your current earth weight: ");
        double earthWeight = keyboard.nextDouble();
        double newWeight=0;

        System.out.println("\r\nI have information for the following planets:" +
                "\r\n    1. Venus 2. Mars 3. Jupiter" +
                "\r\n    4. Saturn 5. Uranus 6. Neptune");
        System.out.print("\r\nWhich planet are you visiting?");
        int planet = keyboard.nextInt();

        switch(planet){
            case 1: newWeight = earthWeight * 0.78;
                break;
            case 2: newWeight = earthWeight * 0.39;
                break;
            case 3: newWeight = earthWeight * 2.65;
                break;
            case 4: newWeight = earthWeight * 1.17;
                break;
            case 5: newWeight = earthWeight * 1.05;
                break;
            case 6: newWeight = earthWeight * 1.23;
                break;
        }

        System.out.print("\r\nYour weight would be "+newWeight+" pounds on that planet.");
    }
        }
