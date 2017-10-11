class MyNameInBox {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= 18; j++){

				//For first row
				if(i == 0)
					System.out.print("*");
				else if(i == 1){
					if(j == 0 || j == 18)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				else if(i == 2){
					if(j == 0 || j == 18)
						System.out.print("*");
					else if(j == 1 || j == 17)
						System.out.print(" ");
					else if(j == 2)
						System.out.print("My name is Sonu");
				}
				else if(i == 3){
					if(j == 0 || j == 18)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				else if(i == 4) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}