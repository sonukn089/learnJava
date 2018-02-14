import java.util.Scanner;
class Factor{
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Pleas input the number: ");
		int number = input.nextInt();

		int fact = 2;

		while (number != 1){

			if (number % fact == 0) {

				System.out.print(fact + " ");

				number /= fact;
				
			}
			else
				
				++fact;
		}
	}
}