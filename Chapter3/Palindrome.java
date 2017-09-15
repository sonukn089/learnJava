import java.util.Scanner;

class Palindrome{
	 
		   public static void main(String[] args) {

			   	Scanner input = new Scanner(System.in);

			   	System.out.print("Please input the first number : ");

			   	int a = input.nextInt();

			   	System.out.print("Please input the second number : ");

			   	int b = input.nextInt();

			   	System.out.print("Please input the third number : ");

			   	int c = input.nextInt();

			   	if (a == c) {

			   		System.out.print(a + "" + b + "" + c + " is a Palindrome number");
			   		
			   	}

                else{
                    System.out.print(a + "" + b + "" + c + " is not a Palindrome number");
                }


		     }


}