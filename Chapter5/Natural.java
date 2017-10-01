import java.util.Scanner;

class Natural{
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please input the number : ");

		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
		
			System.out.println(i);
		}
	}
}