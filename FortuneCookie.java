import java.util.*;

public class FortuneCookie {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int randFortune = rand.nextInt(5);
        String[] fortune = {
                    "A friend asks only for your time not your money. ",
                    "If you refuse to accept anything but the best, you very often get it. ",
                    "Today it's up to you to create the peacefulness you long for. ",
                    "A smile is your passport into the hearts of others. ",
                    "A good way to keep healthy is to eat more Chinese food.",
                    "Your high-minded principles spell success."
        };


        System.out.println("Fortune cookie says: " + fortune[randFortune]);
        System.out.print("Lucky Numbers: ");
        for (int i=0; i<6;i++) {
         int luckyNumber = rand.nextInt(54)+1;
         int[] luckyArray = new int[6];
         luckyArray[i]=luckyNumber;
            if(i<5) {
                System.out.print(luckyArray[i] + "-");
            }
           else if (i == 5){
                System.out.print(luckyArray[5]);
            }
        }
    }
}
