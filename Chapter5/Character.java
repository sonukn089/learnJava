import java.util.Scanner;

class Character{
	
	public static void main(String[] args) {

		char ch;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Please input any Character : ");
        ch = scan.next().charAt(0);
		
        if((ch >='a' && ch <='z') || (ch >='A' && ch <='Z'))
        {
            System.out.print(ch + " is an Alphabet");
        }
        else if ((ch >= 48 && ch <= 57)) {
        
            System.out.print(ch + " is an Number");
            	
        }
        else{

            System.out.print(ch + " is an Special Character");
        }
		
	}
}