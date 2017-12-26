class StarOne{
	
	public static void main(String[] args) {
		
		int i = 1;
		int j = 1;

		for (i = 1; i<=5; i++ ) {
		
			for (j = 1; j<=5; j++) {

				if (j <= i) {

					System.out.print(" * ");

				}	
		        else

				   System.out.print(" ");

			}

			    System.out.println(" ");
		}
	}


}