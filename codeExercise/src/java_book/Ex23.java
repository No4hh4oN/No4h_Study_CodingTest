package java_book;

public class Ex23 {
	public static void main(String[] args) {
		Child c = new Child("홍길동");
		System.out.println("자녀 이름 : " + c.name);
	}
}

class Parent {
	Parent() {
		System.out.println("Parent class Constructor...");
	}
}


class Child extends Parent {
	String name;
	Child(String name) {
		this.name = name;
		System.out.println("Child class Constructior...");
	}
}