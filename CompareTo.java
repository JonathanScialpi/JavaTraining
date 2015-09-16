import java.util.Scanner;

public class CompareTo {

    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);   
   
     String str1 = "Dog";
     String str2 = "cat";
     
     String str3 = "dude";
     String str4 = "surf";
     
     String str5 = "pear";
     String str6 = "ceiling";
     
     String str7 = "Sand";
     String str8 = "turmoil";
     
     String str9 = "hello world";
     String str10 = "goodbye world";
     
     String str11 = "hola";
     String str12 = "hola";
     
     String str13 = "adios";
     String str14 = "adios";
     
     String str15 = "interstellar";
     String str16 = "Venus";
     
     String str17 = "gravity";
     String str18 = "Germany";
     
     String str19 = "Elon";
     String str20 = "Musk";
     
     String str21 = "Tesla";
     String str22 = "Mercedez";
     
     String str23 = "car";
     String str24 = "Motorcycle";
     
     int result;
     
     result = str1.compareTo(str2);
     System.out.println("Comparing \"Dog\" with \"cat\" produces: "+result);
     
     result = str3.compareTo(str4);
     System.out.println("Comparing \"dude\" with \"surf\" produces: "+result);
     
     result = str7.compareTo(str8);
     System.out.println("Comparing \"Sand\" with \"turmoil\" produces: "+result);
     
     result = str19.compareTo(str20);
     System.out.println("Comparing \"Elon\" with \"Musk\" produces: "+result);
     
     result = str24.compareTo(str23);
     System.out.println("Comparing \"car\" with \"Motorcycle\" produces: "+result);
     
     result = str11.compareTo(str12);
     System.out.println("Comparing \"hola\" with \"hola\" produces: "+result);
     
     result = str13.compareTo(str14);
     System.out.println("Comparing \"adios\" with \"adios\" produces: "+result);
     
     result = str15.compareTo(str16);
     System.out.println("Comparing \"interstellar\" with \"Venus\" produces: "+result);
     
     result = str17.compareTo(str18);
     System.out.println("Comparing \"gravity\" with \"Germany\" produces: "+result);
        
     result = str21.compareTo(str22);
     System.out.println("Comparing \"Tesla\" with \"Mercedez\" produces: "+result);
         
     result = str9.compareTo(str10);
     System.out.println("Comparing \"hello world\" with \"goodbye world\" produces: "+result);
     
     result = str5.compareTo(str6);
     System.out.println("Comparing \"pear\" with \"ceiling\" produces: "+result);
     
    }

}
