import java.util.Scanner;

class PickCard{
	
	    public static void main(String[] args) {

	    	Scanner input = new Scanner(System.in);

	    	System.out.print("Pick your card : ");

	    	int a = input.nextInt();



	    	int card = (int) (Math.random() * 52);

	    	int rank = card / 4;  // determine the rank 0-12

	    	int suit = card % 4; // determine the suit 0-3

	    	String strRank = "";

	    	String strSuit = "";

	    	 switch (rank) {

				   case 0: strRank = "Ace";
				   break;

				   case 10:
				   strRank = "Jack";
				   break;

				   case 11:
				   strRank = "Queen";
				   break;

				   case 12:
				   strRank = "King";
				   break;

				   default:
				   strRank = "" + (rank + 1);
				   break;

	     		}

	     		switch (suit) {
                   case 0:
				   strSuit = "Clubs";
				   break;
				   case 1:
				   strSuit = "Diamonds";
				   break;
				   case 2:
				   strSuit = "Hearts";
				   break;
				   case 3:
				   strSuit = "Spades";
				   break;
				}

                System.out.print("The card you picked is " + strRank +" of " + strSuit );

	    }


}