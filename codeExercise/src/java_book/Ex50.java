package java_book;

public class Ex50 {
	public static void main(String[] args) {
		PrintMethod.printName();

		PrintMethod m = new PrintMethod();
		m.printEmail();
	}
}

class PrintMethod {
	static void printName() {
		System.out.println("printName() 실행");
	}

	void printEmail() {
		System.out.println("printEmail() 실행");

		printId();
	}

	void printId() {
		System.out.println("printId() 실행");
	}
}