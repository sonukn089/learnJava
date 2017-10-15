import java.util.Scanner;
class MaxNumber{
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please input the first number = ");
		int a = input.nextInt();

		System.out.print("Please input the Second number = ");
		int b = input.nextInt();

		int c = a > b ? a : b;

		if (a == b) {

			System.out.print("Both Number are equal !");
			
		}
		else

		System.out.print("Max Number is " + c);
		
	}
}