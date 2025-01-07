
package java_book;

import java.util.Arrays;

public class Ex36 {
	public static void main(String[] args) {
		Member3 original = new Member3("홍길동", 25, new int[] { 90, 80 }, new Car4("소나타"));

		Member3 cloned = original.getMember();
		cloned.scores[0] = 101;
		cloned.car.model = "K5";

		System.out.println("[복제 객체의 필드값]");
		System.out.println("name : " + cloned.name);
		System.out.println("age : " + cloned.age);
		System.out.print("scores : {");
		for (int i = 0; i < cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i == (cloned.scores.length - 1)) ? "" : ",");
		}
		System.out.println("}");
		System.out.println("car: " + cloned.car.model);
		System.out.println();

		System.out.println("[원본 객체의 필드값]");
		System.out.println("name : " + original.name);
		System.out.println("age : " + original.age);
		System.out.print("scores : {");
		for (int i = 0; i < original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i == (original.scores.length - 1)) ? "" : ",");
		}
		System.out.println("}");
		System.out.println("car: " + original.car.model);
		System.out.println();

	}
}

class Car4 {
	public String model;

	public Car4(String model) {
		this.model = model;
	}
}

class Member3 implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car4 car;

	public Member3(String name, int age, int[] scores, Car4 car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	protected Object clone() throws CloneNotSupportedException {
		Member3 cloned = (Member3) super.clone();

		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);

		cloned.car = new Car4(this.car.model);

		return cloned;
	}

	public Member3 getMember() {
		Member3 cloned = null;

		try {
			cloned = (Member3) clone();
		} catch (CloneNotSupportedException e) {
		}
		return cloned;
	}
}