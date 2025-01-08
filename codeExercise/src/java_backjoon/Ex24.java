package java_backjoon;

import java.util.Scanner;

public class Ex24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < N; i++) {
			if (i + 1 == N) {
				for (int j = 0; j < 2 * N - 1; j++) {
					System.out.print("*");
				}
				break;
			}
			for (int j = N - 1; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print(" ");
			}
			if (i != 0) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
