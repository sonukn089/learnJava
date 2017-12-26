import java.util.Scanner;

class Equilateral{

      public static void main(String[] args){

      
                Scanner input = new Scanner(System.in);
            
                System.out.print("Please enter the first value = ");
                int a = input.nextInt();

                System.out.print("Please enter the Second value = ");
                int b = input.nextInt();

                System.out.print("Please enter the third value = ");
                int c = input.nextInt();

                if (a == b && b == c && c == a) {

                    System.out.print("Equilateral");
                    
                }

                else if (a == b || a == c || c == b) {

                    System.out.print("Isosceles");
                    
                }

                else{

                     System.out.print("Scalene");
                }

               
    
    }

}