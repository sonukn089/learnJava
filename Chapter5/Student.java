public class Student {
	public static void main(String[] args) {
		System.out.print("a");
		Moniter mn = new Moniter();
		Teacher tchr = new Teacher();
		Principle pr = new Principle();
		System.out.println(pr.moniterName());
		System.out.println(tchr.moniterName());
		System.out.println(mn.moniterName());
		System.out.println(mn.moniterName(4));
	}
}

class Moniter {

	String moniterName() {
		return "moniterName";
	}

	int moniterName(int a) {
		return 2;
	}
}

class Teacher {

	String moniterName() {
		return "TeacherName";
	}

}

class Principle {

	String moniterName() {
		return "PrincipleName";
	}

}