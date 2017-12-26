import java.util.Scanner;

class Lottery{
	
       public static void main(String[] args) {
    	
	    	Scanner input = new Scanner(System.in);
            
            // generate a lottery number
	    	int lottery = (int)(Math.random() * 100);

	    	
	    	System.out.print("Enter your lottery pick ( two digits ) : ");

	    	int guess = input.nextInt();


            // get digits from lottery
	    	int lotteryDigit1 = lottery / 10;

	    	int lotteryDigit2 = lottery % 10;

            // get digits from guess
            int guessDigit1 = guess / 10;

            int guessDigit2 = guess % 10;

            System.out.println("The lottery number is "  +   lottery);

            // check the guess
            if (guess == lottery) {

            	System.out.println("Exact match : You win $10,000");
            	
            }

            else if (guessDigit2 == lotteryDigit1 && guessDigit1 == guessDigit2)  {

            	System.out.println("Match all digits : you win $3,000");
            	
            }
            
            else if (guessDigit1 == lotteryDigit1
            	 ||  guessDigit1 == lotteryDigit2
                 ||  guessDigit2 == lotteryDigit1    	 
                 ||  guessDigit2 == lotteryDigit2 ){

            	System.out.print("Match one digit : you win $1,000");
            	
            }

            else
            	System.out.print("Sorry, no match");


         }

}