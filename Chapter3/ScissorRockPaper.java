import java.util.Scanner;

class ScissorRockPaper{
	
	    public static void main(String[] args) {

             Scanner input = new Scanner(System.in);

             System.out.print("Please input the number Scissor (0), rock (1), Paper(2) : ");

             int i = input.nextInt();

             int x = (int)(Math.random() * 3);

             if (i == x) {

             	System.out.print("You have Won");
             	
             }
             else {
             	System.out.print("You have lose");
             }


	     }


}