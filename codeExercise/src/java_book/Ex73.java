package java_book;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex73 {
	public static void main(String[] args) {
		TreeSet<Person2> treeSet = new TreeSet<Person2>();
		treeSet.add(new Person2("홍길동", 45));
		treeSet.add(new Person2("김자바", 25));
		treeSet.add(new Person2("박지원", 31));
		
		Iterator<Person2> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
		Person2 person = iterator.next();
		System.out.println(person.name + ":" + person.age);
		}
	}
}

class Person2 implements Comparable<Person2> {
	public String name;
	public int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
		}

	@Override
	public int compareTo(Person2 arg0) {
		// TODO Auto-generated method stub
		if (age < arg0.age)
			return -1;
		else if (age == arg0.age)
			return 0;
		else
			return 1;

	}
}