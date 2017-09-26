import java.util.Scanner;

class Max{
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

			int number;
			int max;
			
            System.out.print("Please input the number : ");
			number = input.nextInt();

			max = number;

			while (number != 0){
                
				number = input.nextInt();

				if (number > max) {

					max = number;
					
				}

				System.out.println("Max is = " + max);

				System.out.println("number = " + number);


			 }
		
	}

}