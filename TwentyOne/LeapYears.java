import java.util.Scanner;
class LeapYears{
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        
		System.out.print("Please input the year = ");
		int y = input.nextInt();

		if (y % 4 == 0) {

			System.out.print(y + "  is Leap-Year");
			
		}


		else
			System.out.print(y + "  is not Leap-Year");

  }

}