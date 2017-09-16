import java.util.Scanner;

class CostOfShipping{
	
	 public static void main(String[] args) {

	 	Scanner input = new Scanner(System.in);

	 	System.out.print("Please inter the weight of Package : ");

	 	double weight = input.nextDouble();

	 	if (weight <= 1 ) {

	 		System.out.print("your cost is " + (weight * 3.15) );	 		
	 	}
	 	else if (weight <= 3) {

	 		System.out.print("your cost is " + (weight * 5.5));
	 		
	 	}
	 	else if (weight <= 10) {

	 		System.out.print("your cost is " + (weight * 8.5));
	 		
	 	}

	 	else if (weight <= 50) {

	 		System.out.print("your cost is " + (weight * 10.5));
	 		
	 	}
         else
         	System.out.print("your weight is grater than 50, The package cannot be shipped");

	}


}