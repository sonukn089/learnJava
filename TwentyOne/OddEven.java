import java.util.Scanner;
class OddEven{
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        
		System.out.print("Please input the number = ");
		int n = input.nextInt();

		if (n % 2 == 0) {

			System.out.print(n + " Number Even ");
			
		}


		else
			System.out.print(n + " Number Odd");

  }

}