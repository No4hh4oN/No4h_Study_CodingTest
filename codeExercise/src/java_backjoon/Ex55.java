package java_backjoon;

import java.util.Scanner;
import java.util.Stack;

public class Ex55 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<Integer> stack = new Stack<Integer>();

		int N = sc.nextInt();
		int total = 0;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (num == 0) {
				total -= stack.get(stack.size() - 1);
				stack.remove(stack.size() - 1);

			} else {
				total += num;
				stack.add(num);

			}
		}

		System.out.println(total);

		sc.close();
	}
}
