import java.util.Scanner;

class PositiveNegative{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int number = 1;
		int nCount = 0;
		int pCount = 0;
		int sum = 0;

		while(number != 0) {

			System.out.print("Input the number : ");
			number = input.nextInt();

	        if (number > 0)
	        	pCount++;
	        if(number < 0)
	        	nCount++;

	        sum += number;
		}

		System.out.println("Ncount = " + nCount);
		System.out.println("Pcount = " + pCount);
		System.out.print("Sum = " + sum);
	

	}

}