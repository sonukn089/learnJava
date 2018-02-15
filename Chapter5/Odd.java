import java.util.Scanner;
class Odd{
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please input the Number : ");
		int n = input.nextInt();

		if ( (n & 1) == 0){
			
			System.out.print("Even Number");
		}
		else
			
			System.out.print("Odd Number");
	}
}