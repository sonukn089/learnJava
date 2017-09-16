import java.util.Scanner;

class DayOfTheWeek{
	
		public static void main(String[] args) {

			 Scanner input = new Scanner(System.in);

			 System.out.print("Please input the year : ");
             int y = input.nextInt();


             System.out.print("Please input the month M : ");
             int m = input.nextInt();

			 System.out.print("Please input the day of the month Q : ");
             int q = input.nextInt();

              if (m == 1 || m == 2) {

                 m = m + 12;

                 y = y - 1;

                }

                int j = y / 100;

                int k = y % 100;

                int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

                if (h == 0) {

                	System.out.print("Day of the week is Saturday");
                 	
                }
                 else if (h == 1) {

                 	System.out.print("Day of the week is Sunday");
                 	
                }
                 else if (h == 2) {

                 	System.out.print("Day of the week is Monday");
                 	
                }
                 else if (h == 3) {

                 	System.out.print("Day of the week is Tuseday");
                 	
                }
                 else if (h == 4) {

                 	System.out.print("Day of the week is Wednesday");
                 	
                }
                 else if (h == 5) {

                 	System.out.print("Day of the week is Thursday");
                 	
                }
                 else if (h == 6) {
                 	
                 
                 	System.out.print("Day of the week is Friday");
                }


			
     	 }
} 