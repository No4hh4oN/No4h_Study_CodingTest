package java_backjoon;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = 0; i < N; i++) {
			for (int j = N - i; j < N; j++) {
				System.out.print(" ");
			}
			for (int k = N - i; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}