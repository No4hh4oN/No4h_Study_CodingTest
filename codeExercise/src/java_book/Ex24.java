package java_book;

public class Ex24 {
	public static void main(String[] args) {
		Child2 c = new Child2("홍길동", "123456-1234567", 1);
		System.out.println("name : " + c.name);
		System.out.println("ssn : " + c.ssn);
		System.out.println("childNo : "+ c.childNo);
	}
}

class Parent2 {
	public String name;
	public String ssn;

	Parent2(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

class Child2 extends Parent2 {
	public int childNo;

	Child2(String name, String ssn, int childNo) {
		super(name, ssn);
		this.childNo = childNo;
	}
}