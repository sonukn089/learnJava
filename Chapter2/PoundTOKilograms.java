import java.util.Scanner;

class PoundTOKilograms{
	
          public static void main(String[] args) {

          	Scanner input = new Scanner(System.in);

          	System.out.print(" Pleas enter the pounds ");

          	double pounds = input.nextDouble();

          	double kilo = (pounds * 0.454);

          	System.out.println(pounds + "pounds is " + kilo + " kilograms");

             }

}