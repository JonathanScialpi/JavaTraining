import java.util.Scanner;

public class AgeInFiveYears {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);

        String name;
        int age;
        int yearsAgo;
        int yearsFromNow;

        System.out.print("Hello. What is your name?");
        name = keyboard.nextLine();
        System.out.print("\r\n"+"Hi, "+name+"! How old are you?");
        age = keyboard.nextInt();
        yearsFromNow = age+5;
        yearsAgo = age-5;
        System.out.println("\r\n"+"Did you know that in five years you will be "+yearsFromNow+" years old?"+
                "\r\n"+"And five years ago you were "+yearsAgo+"! Image that!");

    }

}
