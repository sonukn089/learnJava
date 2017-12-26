import java.util.Scanner;

class HeadTails{
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		System.out.print("Please guess Head (0) or Tails (1) : ");
		String a = input.next();

		int x = (int)(Math.random() * 2);

		// Genrate 0 or 1
		if (x == 0)
			System.out.print("Head");
		else
			System.out.print("Tails");
		   	
	}

}


