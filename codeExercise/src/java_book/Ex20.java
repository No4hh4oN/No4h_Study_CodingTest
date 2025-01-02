package java_book;

public class Ex20 {
	public static void main(String[]args) {
		Person p1 = new Person("123456-1234567", "KyeBaek");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// p1.nation ="USA"; Final 필드는 못바꿔
		// p1.ssn = "654321-7654321";
		p1.name = "LeeSoonsin";
	}
}

class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}