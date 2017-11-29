import java.util.Scanner;

class Sum{

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int s = 0;
		int i = 1;

		while (i < 10 ){

			s = s + i;
			i++;
		}

		System.out.print("Sum is " + s);

	}
	
}