// 정올-함수1-자가진단1 #571
package java_jungol;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A strA = new A();
		String str = strA.Function1();

		int N = sc.nextInt();
		sc.close();
		for (int i = 0; i < N; i++) {
			System.out.println(str);
		}
	}
}

class A {
	public String Function1() {
		String str = "~!@#$^&*()_+|";
		return str;
	}
}
