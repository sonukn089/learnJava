import java.util.Scanner;

class Equilateral{

      public static void main(String[] args){

      
                Scanner input = new Scanner(System.in);
            
                System.out.print("Please enter a = ");
                int a = input.nextInt();

                System.out.print("Please enter b = ");
                int b = input.nextInt();

                System.out.print("Please enter c = ");
                int c = input.nextInt();

                if (a == b == c) {

                    System.out.print("Equilateral");
                    
                }

                else if (a == b || a == c) {

                    System.out.print("Isosceles");
                    
                }

                else{

                     System.out.print("Scalene");
                }

               
    }
                }

}