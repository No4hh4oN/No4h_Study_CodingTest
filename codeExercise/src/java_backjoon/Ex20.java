package java_backjoon;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		sc.close();

		int a = 100 - N1;
		int b = 100 - N2;
		int c = 100 - (a + b);
		int d = a * b;
		int q = d / 100;
		int r = d % 100;
		int result1 = c + q;
		int result2 = r;

		System.out.println(a + " " + b + " " + c + " " + d + " " + q + " " + r);
		System.out.println(result1 + " " + result2);
	}
}
