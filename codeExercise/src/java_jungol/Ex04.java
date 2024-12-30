package java_jungol;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		System.out.println(n);
		if (n < 0) {
			System.out.println("minus");
		}
	}
}
