import java.util.Scanner;

class WeekDays{
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
        System.out.print("Please input any Character : ");
        int n = input.nextInt();
		
        if (n == 1) {
             
          System.out.print("Monday");
        }
        else if(n == 2){

            System.out.print("Tuesday");
        }
        else if(n == 3){

            System.out.print("Wenesday");
        }
        else if(n == 4){

            System.out.print("Thursday");
        }
        else if(n == 5){

            System.out.print("Friday");
        }
        else if(n == 6){

            System.out.print("Saturday");
        }
        else{

            System.out.print("Sunday");
        }

		
	}
        
}