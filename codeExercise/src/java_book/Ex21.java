package java_book;

public class Ex21 {
	public static void main(String[] args) {
		A a = new A();
		a.methodA();

		B b = new B();
		b.methodA();
		b.methodB();
	}
}

class A {
	int fieldA = 2;

	void methodA() {
		System.out.println(fieldA);
	}
}

class B extends A { // A 상속받음
	int fieldB = 3;

	void methodB() {
		System.out.println(fieldB);
	}
}