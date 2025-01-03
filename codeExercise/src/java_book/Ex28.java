package java_book;

public class Ex28 {
	public static void main(String[] args) {
		Child3 child = new Child3();
		Parent3 parent = new Parent3();
		
		parent.method1();
		parent.method2();
		
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println("-----");
		
		parent = child;
		parent.method1();
		parent.method2();
	}
}

class Parent3{
	void method1() {
		System.out.println("Parent method1()");
	}
	void method2() {
		System.out.println("Parent method2()");
	}
}

class Child3 extends Parent3 {
	void method2() {
		System.out.println("Child method2()");
	}
	
	void method3() {
		System.out.println("Child method3()");
	}
}
