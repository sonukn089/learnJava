import java.util.Scanner;

class TriangleValid{

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Please input the first Triangle : ");

		float a = input.nextFloat();

		System.out.print("Please input the Second Triangle : ");

		float b = input.nextFloat();

		System.out.print("Please input the Third Triangle : ");

		float c = input.nextFloat();

		float s = a + b + c;

		if (s == 180) {

			System.out.print("Triangle are valid !");
			
		}

		else{
			System.out.print("Triangle are not valid !");
		}

	}
	


}