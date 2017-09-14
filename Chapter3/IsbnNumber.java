import java.util.Scanner;

class IsbnNumber{
	
	    public static void main(String[] args) {
	    
	        Scanner input = new Scanner(System.in);

	        System.out.print("input d1 : ");
	        int d1 = input.nextInt();

	        System.out.print("input d2 : ");
	        int d2 = input.nextInt();

	        System.out.print("input d3 : ");
	        int d3 = input.nextInt();

	        System.out.print("input d4 : ");
	        int d4 = input.nextInt();

	        System.out.print("input d5 : ");
	        int d5 = input.nextInt();

	        System.out.print("input d6 : ");
	        int d6 = input.nextInt();

	        System.out.print("input d7 : ");
	        int d7 = input.nextInt();

	        System.out.print("input d8 : ");
	        int d8 = input.nextInt();

	        System.out.print("input d9 : ");
	        int d9 = input.nextInt();


           int x = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

           if (x == 10) {
           
           System.out.print(d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+"X");

           }
           
           else {
           	System.out.print(x);
           }

         }
 


}