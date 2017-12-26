import java.util.Scanner;
class ArrayTest{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		//int a[] = {5};

	    int n[] = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Please input the 10 number :");
			int a = input.nextInt();
			n[i] = a;
		} 

		for(int i = 0; i < 10; i++){
			System.out.println(n[i]);
		}

	}

}