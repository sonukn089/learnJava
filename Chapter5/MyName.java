class MyName{
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j<= 19; j++) {


		if ((i==1 || i==19 || j==1 || j==19) || i>=3 && j<=4 && i>=6 && j<=9 && i>=11 && j<=12 && i>=14 && j<=17) {

					System.out.print(" *");
					
				}

				else{

					System.out.print("  ");
                  }
               
				
			 }

			 System.out.println(" ");
			
		}
	}
}