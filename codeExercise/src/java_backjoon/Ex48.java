package java_backjoon;

import java.util.Scanner;

public class Ex48 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if (A == 0 && B == 0) {
				break;
			} else if (A % B == 0) {
				System.out.println("multiple");
			} else if (B % A == 0) {
				System.out.println("factor");
			} else {
				System.out.println("neither");
			}
		}
		sc.close();
	}
}
