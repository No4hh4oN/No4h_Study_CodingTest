package java_jungol;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		System.out.print("두 개의 수를 입력하시오. ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		sc.close();
		plus(n1, n2);
		minus(n1, n2);
		mul(n1, n2);
		div(n1, n2);
		last(n1, n2);
	}

	static void plus(int n1, int n2) {
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2) + " ");
	}

	static void minus(int n1, int n2) {
		System.out.println(n1 + " - " + n2 + " = " + (n1 - n2) + " ");
	}

	static void mul(int n1, int n2) {
		System.out.println(n1 + " * " + n2 + " = " + (n1 * n2) + " ");
	}

	static void div(int n1, int n2) {
		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2) + " ");
	}

	static void last(int n1, int n2) {
		System.out.println(n1 + " % " + n2 + " = " + (n1 % n2) + " ");
	}
}
