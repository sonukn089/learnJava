import java.util.Scanner;

public class GradeMethod{
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number : ");

		double a = input.nextDouble();

		System.out.println(getGrade(a));
		gradeStatement(a);
		
	}

	public static char getGrade(double score){

		if (score < 0 || score > 100) {
			
			return 'I';
		}

		else if (score >= 90.0) {

			return 'A';
		}
		else if (score >= 80.0) {
			
			return 'B';
		}
		else if (score >= 70.0) {
			
			return 'C';
		}
		else if (score >= 60.0) {
			
			return 'D';
		}

		else{
			return 'F';
		}
	}

	public static void gradeStatement(double score){

		if (score < 0 || score > 100) {
			System.out.println("Invalid");
		}

		else if (score >= 90.0) {
			System.out.println("Grade A");
		}
		else if (score >= 80.0) {
			System.out.println("Grade B");
		}
		else if (score >= 70.0) {
			System.out.println("Grade C");
		}
		else if (score >= 60.0) {
			System.out.println("Grade D");
		}
		else{
			System.out.println("Grade F");
		}
	}
}