import java.util.Scanner;

class PerimeterOfTriangle{
	
		public static void main(String[] args) {

				Scanner input = new Scanner(System.in);

				System.out.print("Please input the first edge : ");
				double a = input.nextDouble();

				System.out.print("Please input the first edge : ");
				double b = input.nextDouble();

				System.out.print("Please input the first edge : ");
				double c = input.nextDouble();

				if ((a + b) > c && (b + c) > a && (a + c) > b ){

					System.out.print("Perimeter is : " + (a + b + c) );
				}
				else{
					System.out.print("input edge is invalid");
				}
                

			
		 }
}