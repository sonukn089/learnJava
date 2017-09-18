import java.util.Scanner;

class CirclePoint{
	
    public static void main(String[] args) {

           Scanner input = new Scanner(System.in);

           double a = 25/4;    	
    	
	       System.out.print("Enter a first point coordinates :");
	       double x = input.nextDouble();

	       System.out.print("Enter Second point coordinates :");
	       double y = input.nextDouble();

	       double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

	       if (d >= 10) {
   
             }
 
            System.out.print("Point " + x + ", " + y + " is the circle");
    




    }


}