class StarSecond{
	
	public static void main(String[] args) {
		
		int i = 1;
		int j = 1;

		for (i = 1; i<=4; i++ ) {
		
			for (j = 1; j<=7; j++) {

				if (j >= 5-i && j <= 3+i ) {


					System.out.print(" *");
					
					
				}	
		        else{
                   
				   System.out.print("  ");
                }
			}

			    System.out.println("  ");
		}
	}


}