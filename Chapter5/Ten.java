class Ten{
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j<= 19; j++) {

				if (i==1 || i==5 || j==1 || j==19)

					System.out.print(" *");

				else if(i == 3){

					if(j == 3)

						System.out.print("   M y   N a m e   -I s   S o n u  ");
				}
				else
					
					System.out.print("  ");
			 }

			 System.out.println(" ");
			
		}
	}
}