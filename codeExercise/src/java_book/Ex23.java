package java_book;

public class Ex23 {
	public static void main(String[] args) {
		Child c = new Child();
	}
}

class Parent {
	Parent() {
		System.out.println("Parent class Constructor...");
	}
}


class Child extends Parent {
	Child() {
		System.out.println("Child class Constructior...");
	}
}