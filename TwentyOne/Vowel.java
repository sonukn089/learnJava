import java.util.Scanner;
class Vowel{
	
	public static void main(String[] args) {

		

		Scanner input = new Scanner(System.in);
        
		System.out.print("Please input the Character = ");
		char c = input.next().charAt(0);

		char a = 'a';
		char e = 'e';
		char i = 'i';
		char o = 'o';
		char u = 'u';

		if (c == a || c == e || c == i || c == o || c == u) {

			System.out.print(c + " is Vowel");
			
		}


		else
			System.out.print(c + "  is not Vowel");

  }

}