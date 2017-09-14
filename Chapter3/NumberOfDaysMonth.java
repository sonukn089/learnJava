import java.util.Scanner;

class NumberOfDaysMonth{

	    public static void main(String[] args) {
	    	
	     Scanner input = new Scanner(System.in);

	     //boolean leapyear;

	     System.out.print("Enter the month less than 12 : ");
	     
         int month = input.nextInt();

         System.out.print("year : ");

	     int year = input.nextInt();

	     if (month ==1) {

	     	System.out.print("january and " + year + " 31 days");
	     	
	     }

	     else if (month == 2) {

	     	if (year % 4 == 0){  
	     
              System.out.print("February and " + year + " 29 days" );
		
	     	 }
           else{    
                 System.out.print("February and " + year + " 28 days");

             }	     
          
	      } 
          else if (month == 3) {

          	System.out.print("March and " + year + " 31 days ");
          	
          }
          else if (month == 4) {

          	System.out.print("April and " + year + " 30 days ");
          	
          }
          else if (month == 5) {

          	System.out.print("May and " + year + " 31 days ");
          	
          }
          else if (month == 6) {

          	System.out.print("June and " + year + " 30 days ");
          	
          }
          else if (month == 7) {

          	System.out.print("July and " + year + " 31 days ");
          	
          }
          else if (month == 8) {

          	System.out.print("August and " + year + " 31 days ");
          	
          }
          else if (month == 9) {

          	System.out.print("September and " + year + " 30 days ");
          	
          }
          else if (month == 10) {

          	System.out.print("October and " + year + " 31 days ");
          	
          }
	      else if (month == 11) {

          	System.out.print("November and " + year + " 30 days ");
          	
          }
          else if (month == 12) {
          	  System.out.print("December and " + year + " 31 days ");
          	
          }
          else
          	System.out.print("Your month is Greater than 12, You have to put the month less than 12");


    	 }

}