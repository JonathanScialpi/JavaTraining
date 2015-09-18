import java.util.*;

public class ThreeCardMonte {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int ace = rand.nextInt(3) + 1;
        System.out.print("You slide up to Fast Eddie's card table and plap down your cash." +
                "\r\nHe glances at you out of the corner of his eye and starts shuffling." +
                "\r\nHe lays down three cards." +
                "\r\n\r\nWhich one is the ace?" +
                "\r\n          ##    ##    ##" +
                "\r\n          ##    ##    ##" +
                "\r\n          1     2     3");
        int guess = keyboard.nextInt();

        String firstCard = "\r\n          AA    ##    ##\r\n          AA    ##    ##";
        String secondCard = "\r\n          ##    AA    ##\r\n          ##    AA    ##";
        String thirdCard = "\r\n          ##    ##    AA\r\n          ##    ##    AA";

        if (guess == ace) {
            if (guess == 1) {
                System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
                System.out.print(firstCard);
            }
            if (guess == 2) {
                System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
                System.out.print(secondCard);
            }
            if (guess == 3) {
                System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
                System.out.print(thirdCard);
            }
        } else if (ace == 1) {
            System.out.print("Ha! Fast Eddie wins again! The ace was card number " + ace);
            System.out.print(firstCard);
        } else if (ace == 2) {
            System.out.print("Ha! Fast Eddie wins again! The ace was card number " + ace);
            System.out.print(secondCard);
        } else if (ace == 3) {
            System.out.print("Ha! Fast Eddie wins again! The ace was card number " + ace);
            System.out.print(thirdCard);
        }
    }
}
