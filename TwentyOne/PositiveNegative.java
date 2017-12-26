import java.util.Scanner;
class PositiveNegative{
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        
		System.out.print("Please input the first number = ");
		int a = input.nextInt();

		if (a > 1 ) {

			System.out.print(a + " Number is Positive ");
			
		}

		else if (a == 0) {

			System.out.print(a + " Number is Zero");
			
		}

		else
			System.out.print(a + " Number is Negative");

  }

}