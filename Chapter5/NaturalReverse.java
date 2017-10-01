import java.util.Scanner;

class NaturalReverse{
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please input the number : ");

		int n = input.nextInt();
		
		for (int i = n; i >= 1; i--) {
		
			System.out.println(i);
		}
	}
}