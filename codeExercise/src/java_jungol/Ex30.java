package java_jungol;

import java.util.Scanner;

public class Ex30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		sc.close();
		circle(n1);
	}
	
	static void circle(int n) {
		double d = n * n * 3.14;
		System.out.printf("%.2f", d);
	}
}