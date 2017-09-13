import java.util.Scanner;

class ThreeIntergers{
	
		   public static void main(String[] args) {
	
			           Scanner input = new Scanner(System.in);

			           System.out.print("Please input first integer : ");
			           int a = input.nextInt();
			           
			           System.out.print("Please input Second integer : ");
			           int b = input.nextInt();

			           System.out.print("Please input Third integer : ");
			           int c = input.nextInt();

			           if ((a > b && a > c)){
			        
			            if(b > c){
			            
			                System.out.println(c);
			                System.out.println(b);
			                System.out.println(a);
			            }

			            else
			                System.out.println(b);
			                System.out.println(c);
			                System.out.println(a);

			            }
				        else if ((b > a && b > c)){
				        
				            if(a > c){
				            
				                System.out.println(c);
				                System.out.println(a);
				                System.out.println(b);

				            }
				            else
				                {
				                System.out.println(a);
				                System.out.println(c);
				                System.out.println(b);
				                }
				        }
				        else if ((c > a && c > b)){
				        
				            if(a > b)
				            {
				                System.out.println(b);
				                System.out.println(a);
				                System.out.println(c);
				            }
				            else
				                System.out.println(a);
				                System.out.println(b);
				                System.out.println(c);
				        }
				        
    

    }



}