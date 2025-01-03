//백준10828  - 스택
package java_backjoon;

import java.util.Scanner;

public class Ex08 {
	public static int[] stack;
	public static int size = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		stack = new int[N];

		for (int i = 0; i < N; i++) {
			String str = sc.next();

			if (str.equals("push")) {
				int num = sc.nextInt();
				push(num);
			} else if (str.equals("pop")) {
				pop();
			} else if (str.equals("size")) {
				size();
			} else if (str.equals("empty")) {
				empty();
			} else if (str.equals("top")) {
				top();
			} else {
				System.out.println("Error");
			}
		}
		sc.close();
	}

	static void push(int X) {
		if (size >= stack.length) {
			System.out.println("Stack overflow");
			return;
		}
		stack[size] = X;
		size++;
	}

	static void pop() {
		if (size == 0) {
			System.out.println("-1");
		} else {
			System.out.println(stack[size - 1]);
			size--;
		}
	}

	static void size() {
		System.out.println(size);
	}

	static void empty() {
		if (size == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	static void top() {
		if (size == 0) {
			System.out.println("-1");
		} else {
			System.out.println(stack[size - 1]);
		}
	}
}