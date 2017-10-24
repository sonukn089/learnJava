import java.util.Scanner;

class UperaLower{
	
	public static void main(String[] args) {

				char ch;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Please input any Character : ");
        ch = scan.next().charAt(0);
		
        if((ch >='a' && ch <='z') ) 
        {
            System.out.print(ch + " is Lowercase");
        }
        else if(ch >='A' && ch <='Z'){

            System.out.print(ch +" is Upper case");
        }
        else{

            System.out.print("Please inout the Character a to z or A to Z ");
        }
        
		
	}
}