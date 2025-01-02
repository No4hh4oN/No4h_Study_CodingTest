// 정올-함수1-자가진단1 #571
package java_jungol;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A strA = new A();
		int N = sc.nextInt();
		sc.close();

		for (int i = 0; i < N; i++) {
			strA.Function1();
		}
	}
}

class A {
	public void Function1() {
		System.out.println("~!@#$^&*()_+|");
	}
}
