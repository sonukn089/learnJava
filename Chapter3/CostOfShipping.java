import java.util.Scanner;

class CostOfShipping{
	
	 public static void main(String[] args) {

	 	Scanner input = new Scanner(System.in);

	 	System.out.print("Please inter the weight of Package : ");

	 	double weight = input.nextDouble();

	 	double cost = 0;

	 	if (weight > 0 && weight <= 1 ) {

	 		System.out.print("your shipping cost is " + (weight * 3.15) );	 		
	 	}
	 	else if (weight > 1 && weight <= 3) {

	 		System.out.print("your shipping cost is " + (weight * 5.5));
	 		
	 	}
	 	else if (weight > 3 && weight <= 10) {

	 		System.out.print("your shipping cost is " + (weight * 8.5));
	 		
	 	}

	 	else if (weight > 10 && weight <= 20) {

	 		System.out.print("your shipping cost is " + (weight * 10.5));

	 		
	 	}
	 	else if (weight > 20 && weight <= 30) {

	 		System.out.print("your shipping cost is " + (weight * 10.5));
	 	}
	 	else if (weight > 30 && weight <= 40) {

	 		System.out.print("your shipping cost is " + (weight * 10.5));
	 	}
	 	else if (weight > 40 && weight <= 50) {

	 		System.out.print("your shipping cost is " + (weight * 10.5));
	 	}

         else
         	System.out.print("your package weight is grater than 50, The package cannot be shipped");

	}


}