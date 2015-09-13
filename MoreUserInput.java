package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MoreUserInput {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String first_name;
        String last_name;
        int grade = 0;
        int sid =0;
        String login;
        double gpa = -1; //initialize to negative 1 because my do-while statement will check for GPA between 0.0-4.0

        System.out.println("Please enter the following information so I can sell it for a profit!");

        System.out.print("First name: ");
        first_name = keyboard.nextLine();

        System.out.print("Last name: ");
        last_name = keyboard.nextLine();
        // make sure you handle the exception of not receiving an int as well as valid grades
        do{
            try {
                System.out.print("Grade (9-12): ");
                grade = keyboard.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Sorry, please enter a number between 9 & 12");
            }
            keyboard.nextLine(); 
        }while (grade < 9 || grade > 12);
        // sid should be greater than 0 and numerical
        do {
            try {
                System.out.print("Student ID: ");
                sid = keyboard.nextInt();//throw away the \n not consumed by nextInt()
                if (sid==0){
                    System.out.println("Your SID cannot be 0");
                }
            } catch (InputMismatchException y) {
                System.out.println("Sorry, your SID should not be zero & only contain numerical values.");
            }
            keyboard.nextLine();//throw away the \n not consumed by nextInt()
        }while(sid == 0);
        keyboard.nextLine(); //throw away the \n not consumed by nextInt()
        System.out.print("Login ID: ");
        login = keyboard.nextLine();
        // GPA should be between 0.0 and 4.0 and numerical
        do {
            try {
                System.out.print("GPA (0.0-4.0): ");
                gpa = keyboard.nextDouble();
            }catch(InputMismatchException x){
                System.out.println("Sorry, please enter a GPA between 0.0 & 4.0");
              }
            keyboard.nextLine();
        }while(gpa < 0.0 || gpa > 4.0);

        System.out.println("Your information:");
        System.out.println("Login: " + login);
        System.out.println("ID: "+sid);
        System.out.println("Name: " + last_name + ", " + first_name);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: "+grade);

    }

}
