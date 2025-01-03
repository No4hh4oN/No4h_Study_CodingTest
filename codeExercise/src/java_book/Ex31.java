package java_book;

public class Ex31 {
	public static void main(String[] args) {
		Parent4 parent = new Parent4();
		Child4 child = new Child4();
		
		if(parent instanceof Parent4) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if(parent instanceof Child4) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if(child instanceof Parent4) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if(child instanceof Child4) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}

class Parent4 {
	public Parent4() {
		// TODO Auto-generated constructor stub
	}
}

class Child4 extends Parent4 {
	public Child4() {
		// TODO Auto-generated constructor stub
	}
}