import java.util.Scanner;
class MonthPrint{


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Please input the number between 1 to 12 : ");

		int n = input.nextInt();

		if (n == 1) {

			System.out.print("January");
			
		}
		else if (n == 2) {

			System.out.print("Feburary");
			
		}
		else if (n == 3) {
			
			System.out.print("March");
			
		}
		else if (n == 4) {
			
			System.out.print("April");
			
		}
		else if (n == 5) {
			
			System.out.print("May");
			
		}
		else if (n == 6) {
			
			System.out.print("June");
			
		}
		else if (n == 7) {
			
			System.out.print("July");
			
		}
		else if (n == 8) {
			
			System.out.print("August");
			
		}
		else if (n == 9) {
			
			System.out.print("September");
			
		}
		else if (n == 10) {
			
			System.out.print("October");
			
		}
		else if (n == 11) {
			
			System.out.print("November");
			
		}
		else if (n == 2) {
			
			System.out.print("December");
			
		}

        else{
        		System.out.print("Wrong Input ! Please input the number between 1 to 12 ");

        }

	}



}