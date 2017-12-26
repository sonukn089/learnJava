import java.util.Scanner;
class DivisibleNumber{
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        
		System.out.print("Please input the number = ");
		int n = input.nextInt();

		if (n % 5 == 0 && n % 11 == 0) {

			System.out.print(n + " Number is Divisible 5 & 11 ");
			
		}


		else
			System.out.print(n + " Number is not Divisible by 5 & 11");

  }

}