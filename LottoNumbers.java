import java.util.*;

public class LottoNumbers {
/*
As of Java8, this can be simplied to:
        int[] luckArray = new Random().ints(1, 59).distinct().limit(6).toArray();
        Arrays.sort(luckArray);
        for (int i=0; i<luckArray.length;i++)
            if(i!=5){
                System.out.print(luckArray[i]+"-");
            }else
        System.out.print(luckArray[i]);
*/
    public static void main(String[] args) {

        Random rand = new Random();
        int[] luckyArray = new int[6];

        //build array
        for (int i = 0; i < luckyArray.length; i++) {

            int luckyNumber = rand.nextInt(54) + 1;
            luckyArray[i] = luckyNumber;
        }
        Arrays.sort(luckyArray);
        //detect duplicates in the array
        for (int i = 0; i < luckyArray.length; i++) {
            if (i > 0 && luckyArray[i] == luckyArray[i - 1]) {
               // System.out.print("WE HAVE FOUND A DUPLICATE!");
                while (luckyArray[i - 1] == luckyArray[i]) {
                    luckyArray[i] = rand.nextInt(54) + 1;
                }
            }
        }
        //sort the array before printing
        Arrays.sort(luckyArray);
        for (int i = 0; i < luckyArray.length; i++) {
            if (i > 0 && luckyArray[i] == luckyArray[i - 1]) {
               // System.out.print("WE HAVE FOUND A DUPLICATE!");
                while (luckyArray[i - 1] == luckyArray[i]) {
                    luckyArray[i] = rand.nextInt(54) + 1;
                }
            }
        }
        
        Arrays.sort(luckyArray);
        for (int t = 0; t < luckyArray.length; t++) {

            if (t != 5) {
                System.out.print(luckyArray[t] + "-");
            } else System.out.print(luckyArray[t]);
        }
    }
}
