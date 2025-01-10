package java_book;

import java.util.HashSet;
import java.util.Set;

public class Ex63 {
	public static void main(String[] args) {
		Set<Member4> set = new HashSet<Member4>();

		set.add(new Member4("홍길동", 30));
		set.add(new Member4("홍길동", 30));

		System.out.println("총 객체 수 : " + set.size());
	}
}

class Member4 {
	public String name;
	public int age;

	public Member4(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Member4) {
			Member4 member = (Member4) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}

	public int hashCode() {
		return name.hashCode() + age;
	}
}