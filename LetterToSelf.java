import java.util.Scanner;


public class LetterToSelf {
	public static void main( String[] args )
	{
		String name;
		String address;
		String cityStateZip;
		Scanner in = new Scanner(System.in);
		
		//User input
		System.out.println("What is your name?");
		name = in.nextLine();
		
		System.out.println("Enter your address:");
		address = in.nextLine();
		
		System.out.println("Enter your City, State, and Zip code:");
		cityStateZip = in.nextLine();
		
		//Call to methods
		printBorder();
		printHeader();
		printLabel(name);
		printLabel(address);
		printLabel(cityStateZip);
		printBorder();
	}
	//top and bottom border
	public static void printBorder(){
		for (int i=0; i<71; i++){
			if (i==0){
				System.out.print("+-");
			}
			else if (i == 70){
				System.out.println("-+");
			}
			else{
			System.out.print('-');
			}
		}
	}
	//number sign headers
	public static void printHeader(){
		for (int i=0; i<4; i++){
			if (i<3){
				System.out.println("|                                                                  #### |");
			}
			else{
				System.out.println("|                                                                       |");
			}
		}
	}
	//Label with user input
	public static void printLabel(String input){
				
		String firstHalf = "|	                          "+input;
		final int threshold = 70;
		int firstHalfLength = firstHalf.length();
		int secondHalfLength = threshold - firstHalfLength;
		System.out.print(firstHalf);
		for (int x = 0; x < secondHalfLength-4; x++){
			System.out.print(" ");
		}
		System.out.println('|');
		
		
		
		

}
}


