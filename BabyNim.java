import java.util.*;
public class BabyNim {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int pileA = 3;
        int pileB = 3;
        int pileC = 3;
        //keep playing until none left
        while(pileA>0 || pileB > 0 || pileC >0) {
            System.out.print("A: "+pileA+ "     B: " + pileB + "     C: " + pileC);
            System.out.print("\r\nChoose a pile: ");
            String choice = keyboard.nextLine();
            System.out.print("\r\nHow many to remove from pile " + choice + ": ");
            int removal = keyboard.nextInt();
            keyboard.nextLine();
            if (choice.equals("A")) {
                pileA = pileA - removal;
            } else if (choice.equals("B")) {
                pileB = pileB - removal;
            } else if (choice.equals("C")) {
                pileC = pileC - removal;
            }
            if(pileA<=0 && pileB <= 0 && pileC <= 0) {
                System.out.print("All piles are empty. Good job!");
            }
        }
    }
}
