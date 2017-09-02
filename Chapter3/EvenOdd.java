import java.util.Scanner;

class EvenOdd{
	
           public static void main(String[] args) {

           	 Scanner input = new Scanner(System.in);


             System.out.print("Please input the num : ");
           	 int num = input.nextInt();
           	
             System.out.println((num % 2 == 0) ? "num is even" : "num is odd");

             



           }


}