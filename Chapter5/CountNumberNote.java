import java.util.Scanner;

class CountNumberNote{
	
      public static void main(String[] args) {

		      Scanner input = new Scanner(System.in);
        
         int a;
          
          System.out.print("Please input the number : ");

          int n = input.nextInt();

            a = n / 2000;
            n = n % 2000;
            System.out.println(a + " 2000 ke Note ");
            

            a = n / 500;
            n = n % 500;

           System.out.println(a + " 500 ke Note ");

            a = n / 100;
            n = n % 100;


           System.out.println(a + " 100 ke Note"); 

            a = n / 50;
            n = n % 50;
           System.out.println(a + " 50 ke Note");
  
            a = n / 20;
            n = n % 20;

            System.out.println(a + " 20 ke Note");

            a = n / 10;
            n = n % 10;

            System.out.println(a + " 10 ke Note");

            a = n / 5;
            n = n % 5;

            System.out.println(a + " 5 ke Note");
            
            a = n / 2;
            n = n % 2;

            System.out.println(a + " 2 ke Note");

            a = n / 1;

            System.out.print(a + " 1 ke Note");




















          


            
            
          




	}
        
}