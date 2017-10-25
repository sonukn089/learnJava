import java.util.Scanner;

class CountNumberNote{
	
      public static void main(String[] args) {

		      Scanner input = new Scanner(System.in);
          int a = 0;
          
          System.out.print("Please input the number : ");

          int n = input.nextInt();
          

          if(n % 2000 == 0){
            while(n!=0)
            a++;

            System.out.print(a);
          }




	}
        
}