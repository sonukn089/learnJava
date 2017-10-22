import java.util.Scanner;
class StudentResult{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean isHindi = false, isMaths = false, isChemestry = false, isEnglish = false, isPhysics = false;
		
		float h = 101;
		while(h > 100 ){
			System.out.print("Enter the number of Hindi = ");
			h = input.nextFloat();
			if(h > 100)
				System.out.println("Number should be less then 100.");
			else if(h < 33)
				isHindi = true;
		}

        float e = 101;
        while(e > 100){
			System.out.print("Enter the number of English = ");
			e = input.nextFloat();
			
			if (e > 100)
				System.out.println("Number should be less then 100.");
			else if(e < 33)
				isEnglish = true;

		}
		float m = 101;
        while(m > 100){
			System.out.print("Enter the number of Math = ");
			m = input.nextFloat();

			if (m > 100)
				System.out.println("Number should be less then 100.");
			else if(m < 33)
				isMaths = true;

		}
        float p = 101;

        while(p > 100){
			System.out.print("Enter the number of Physics = ");
			p = input.nextFloat();

			if (p > 100)
				System.out.println("Number should be less then 100.");
			else if(p < 33)
				isPhysics = true;
		}
        

        float c = 101;
        while(c > 100){
			System.out.print("Enter the number of Chemistry = ");
			c = input.nextFloat();
			if (c > 100)
				System.out.println("Number should be less then 100.");
			else if(c < 33)
				isChemestry = true;
		}	

		float t = h + e + m + p + c;

		float Total = (t * 100) / 500;

		System.out.println(Total);

		if(isChemestry || isMaths || isPhysics || isHindi || isEnglish){
			System.out.println("But you are Fail because !");
			
			if(isEnglish)
				System.out.println("You got "+e+" number in English.");
			if(isHindi)
				System.out.println("You got "+h+" number in Hindi.");
			if(isChemestry)
				System.out.println("You got "+c+" number in Chemestry.");
			if(isPhysics)
				System.out.println("You got "+p+" number in Physics.");
			if(isMaths)
				System.out.println("You got "+m+" number in Maths.");
		}
		else {

			if (Total >=0 && Total <33) {

				System.out.print(" Fail");
				
			}	

			else if (Total >= 33 && Total < 45) {

				System.out.print(" Third");
				
			}

			else if (Total >= 45 && Total <=60) {
				
				System.out.print(" Second");
			}

	        else if (Total >= 61 && Total <= 79) {
				
				System.out.print(" First");
			}

			else{
				
				System.out.print(" Honour");
			}

		}
	}
}







