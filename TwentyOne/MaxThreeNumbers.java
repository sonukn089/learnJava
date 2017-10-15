import java.util.Scanner;
class MaxThreeNumbers{
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        
		System.out.print("Please input the first number = ");
		int a = input.nextInt();

		System.out.print("Please input the Second number = ");
		int b = input.nextInt();

		System.out.print("Please input the Third number = ");
		int c = input.nextInt();

		int d = a > b && a > c ? a : b > a && b > c ? b : c > a && c > b ? c : 0; 

			//System.out.print("Max Number is " + f);
			
		
		if (a == b && a == c && b == c) {

			System.out.print("All Numbers are equal !");
			
		}
		else

		System.out.print("Max Number is " + d);
		
  }
}