// 백준10828-스택
package java_backjoon;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		No4hStack nStack = new No4hStack(N);

		for (int i = 0; i < N; i++) {
			String str = sc.next();

			if (str.equals("push")) {
				int num = sc.nextInt();
				nStack.push(num);
			} else if (str.equals("pop")) {
				nStack.pop();
			} else if (str.equals("size")) {
				nStack.size();
			} else if (str.equals("empty")) {
				nStack.empty();
			} else if (str.equals("top")) {
				nStack.top();
			} else {
				System.out.println("Error");
			}
		}
		sc.close();
	}

}

class No4hStack {
	private int[] stack;
	private int size = 0;

	public No4hStack(int N) {
		this.stack = new int[N];
	}

	void push(int X) {
		if (size >= stack.length) {
			System.out.println("Stack overflow");
			return;
		}
		stack[size] = X;
		size++;
	}

	void pop() {
		if (size == 0) {
			System.out.println("-1");
		} else {
			System.out.println(stack[size - 1]);
			size--;
		}
	}

	void size() {
		System.out.println(size);
	}

	void empty() {
		if (size == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	void top() {
		if (size == 0) {
			System.out.println("-1");
		} else {
			System.out.println(stack[size - 1]);
		}
	}
}