import java.util.Scanner;

class SimpleIfDemo{
	
      public static void main(String[] args) {
      	
      	Scanner input = new Scanner(System.in);

      	System.out.print("Enter an integer : ");

      	int number = input.nextInt();

      	  if (number % 5 == 0)

      	  	 System.out.print("Hi Five Number");

      	   if (number % 2 == 0)
      	   
      	      System.out.print("Hi Even Number");	


      }


}